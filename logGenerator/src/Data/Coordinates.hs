module Data.Coordinates where

import Test.QuickCheck

newtype Coordinates = Coords { getCoords :: (Float, Float) } 
  deriving Show

genCoords :: Gen Coordinates
genCoords = do
  lat  <- choose (-90, 90)
  long <- choose (-180, 180)
  return $ Coords (lat, long)
