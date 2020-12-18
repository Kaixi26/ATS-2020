module Data.GenState where

import Data.Set (Set)
import qualified Data.Set as Set
import Data.Product
import Names

type PersonUID = Int
type EntityUID = Int
type OrderUID = Int

data GenState = GenState
  { availablePeopleUIDs :: Set PersonUID
  , generatedUserUIDs   :: Set PersonUID
  , generatedVolunteerUIDs :: Set PersonUID
  , availableTransportUIDs :: Set EntityUID
  , generatedTransportUIDs :: Set EntityUID
  , availableStoreUIDs :: Set EntityUID
  , generatedStoreUIDs :: Set EntityUID
  , availableOrderUIDs :: Set OrderUID
  , generatedOrderUIDs :: Set OrderUID
  , acceptedOrderUIDs  :: Set OrderUID
  , availableProducts  :: Set Product
  , availableFirstNames :: [String]
  , availableLastNames  :: [String]
  , availableStoreNames :: [String]
  , availableTransportNames :: [String]
  } deriving Show

defaultGenState :: GenState
defaultGenState = GenState
  { availablePeopleUIDs = Set.fromList [0..10]
  , generatedUserUIDs   = Set.fromList []
  , generatedVolunteerUIDs = Set.fromList []
  , availableTransportUIDs = Set.fromList [0..10]
  , generatedTransportUIDs = Set.fromList []
  , availableStoreUIDs = Set.fromList [0..10]
  , generatedStoreUIDs = Set.fromList []
  , availableOrderUIDs = Set.fromList [0..10]
  , generatedOrderUIDs = Set.fromList []
  , acceptedOrderUIDs  = Set.fromList []
  , availableProducts  = Set.fromList products
  , availableFirstNames = firstNames
  , availableLastNames = lastNames
  , availableStoreNames = storeNames
  , availableTransportNames = transportNames
  }


products :: [Product]
products = [ Product{uid = 0, name = "Rice", weight=1, price=0.99}
           , Product{uid = 1, name = "Pasta", weight=1, price=0.79}
           , Product{uid = 2, name = "Apple", weight=0.2, price=0.50}
           , Product{uid = 1, name = "Pear", weight=1, price=0.60}
           , Product{uid = 1, name = "Mango", weight=1.5, price=4.00}
           ]
