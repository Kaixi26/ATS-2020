module Data.Transport where

import Data.Coordinates
import Data.GenState
import Data.Char

import qualified Data.Set as Set

import Control.Monad.State.Lazy
import Test.QuickCheck

data Transport = Transport
  { uid :: EntityUID
  , name :: String
  , coords :: Coordinates
  , nif :: String
  , range :: Float
  , pricePerKm :: Float
  }

instance Show Transport where
  show transp =
    let (lat, long) = getCoords $ coords transp
    in concat
      ["Transportadora:t"
      , show (uid transp) ++ ","
      , name transp ++ ","
      , show lat ++ "," ++ show long ++ ","
      , nif transp ++ ","
      , show (range transp) ++ ","
      , show $ pricePerKm transp
      ]

gen :: StateT GenState Gen Transport
gen = do
  st <- get
  let avUIDs = availableTransportUIDs st
  if Set.size avUIDs == 0 then
    error "No available store UIDs left."
  else do
    index <- lift $ choose (0::Int, Set.size avUIDs-1)
    let uid = Set.elemAt index avUIDs
    name <- lift $ elements $ availableTransportNames st
    coords <- lift genCoords
    nif <- lift $ fmap (show . map intToDigit) $
      replicateM 9 $ choose (0::Int, 9)
    range <- lift $ choose (100::Float, 1000)
    pricePerKm <- lift $ choose (0.5::Float, 5)
    put st{ availableTransportUIDs = Set.delete uid avUIDs
          , generatedTransportUIDs = Set.insert uid (generatedTransportUIDs st)}
    return Transport{ uid = uid, name = name, coords = coords
                    , nif = nif, range = range, pricePerKm = pricePerKm}

genN :: Int -> StateT GenState Gen [Transport]
genN 0 = return []
genN n = do
  st <- get
  (entity, st) <- lift $ runStateT gen st
  (entities, st) <- lift $ runStateT (genN (n-1)) st
  put st
  return (entity:entities)
