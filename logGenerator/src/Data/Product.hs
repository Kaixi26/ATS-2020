module Data.Product where

type ProductUID = Int
type ProductName = String
type ProductWeight = Float
type ProductPrice = Float

data Product = Product
  { uid :: ProductUID
  , name :: ProductName
  , weight :: ProductWeight
  , price :: ProductPrice
  } deriving Show

instance Eq Product where
  (==) prod prod' =
    uid prod == uid prod'

instance Ord Product where
  prod `compare` prod' =
    uid prod `compare` uid prod'
  
