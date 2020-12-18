module Data.Store where

import Data.Coordinates
import Data.GenState

import qualified Data.Set as Set

import Control.Monad.State.Lazy
import Test.QuickCheck


data Store = Store
  { uid :: EntityUID
  , name :: String
  , coords :: Coordinates
  }

instance Show Store where
  show store =
    let (lat, long) = getCoords $ coords store
    in concat
      [ "Loja:l"
      , show (uid store) ++ ","
      , name store ++ ","
      , show lat ++ "," ++ show long
      ]

gen :: StateT GenState Gen Store
gen = do
  st <- get
  let avUIDs = availableStoreUIDs st
  if Set.size avUIDs == 0 then
    error "No available store UIDs left."
  else do
    index <- lift $ choose (0::Int, Set.size avUIDs-1)
    let uid = Set.elemAt index avUIDs
    name <- lift $ elements $ availableStoreNames st
    coords <- lift genCoords
    put st{ availableStoreUIDs = Set.delete uid avUIDs
          , generatedStoreUIDs = Set.insert uid (generatedStoreUIDs st)}
    return Store{uid = uid, name = name, coords = coords}

genN :: Int -> StateT GenState Gen [Store]
genN 0 = return []
genN n = do
  st <- get
  (entity, st) <- lift $ runStateT gen st
  (entities, st) <- lift $ runStateT (genN (n-1)) st
  put st
  return (entity:entities)
