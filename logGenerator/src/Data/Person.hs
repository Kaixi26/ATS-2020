module Data.Person where

import Data.Coordinates
import Data.GenState

import qualified Data.Set as Set

import Control.Monad.State.Lazy

import Test.QuickCheck

data PersonType = User | Volunteer

data Person = Person 
  { uid :: PersonUID
  , name :: String
  , coords :: Coordinates
  , ptype :: PersonType
  , range :: Maybe Float
  }

instance Show Person where
  show person =
    let (lat, long) = getCoords (coords person)
    in concat
      [ case ptype person of
          User -> "Utilizador:u"
          Volunteer -> "Voluntario:v"
      , show (uid person) ++ ","
      , name person ++ ","
      , show lat ++ "," ++ show long
      , maybe "" ((',':) . show) (range person)
      ]

gen :: PersonType -> StateT GenState Gen Person
gen ptype = do
  st <- get
  let avUIDs = availablePeopleUIDs st
  if Set.size avUIDs == 0 then
    error "No available user uids left."
  else do
    index <- lift $ choose (0::PersonUID, Set.size avUIDs-1)
    let uid = Set.elemAt index avUIDs
    fstName <- lift $ elements $ availableFirstNames st
    lastName <- lift $ elements $ availableLastNames st
    let name = unwords [fstName, lastName]
    coords <- lift genCoords
    case ptype of
      User -> do
        put st
          {availablePeopleUIDs = Set.delete uid avUIDs
          , generatedUserUIDs = Set.insert uid (generatedUserUIDs st)}
        return Person{ uid = uid, name = name
                     , coords = coords, ptype = ptype
                     , range = Nothing }
      Volunteer -> do
        range <- lift $ choose (0::Float, 20)
        put st
          {availablePeopleUIDs = Set.delete uid avUIDs
          , generatedVolunteerUIDs = Set.insert uid (generatedVolunteerUIDs st)}
        return Person{ uid = uid, name = name
                     , coords = coords, ptype = ptype
                     , range = Just range }

genN :: PersonType -> Int -> StateT GenState Gen [Person]
genN ptype 0 = return []
genN ptype n = do
  st <- get
  (user, st) <- lift $ runStateT (gen ptype) st
  (users, st) <- lift $ runStateT (genN ptype (n-1)) st
  put st
  return (user:users)

