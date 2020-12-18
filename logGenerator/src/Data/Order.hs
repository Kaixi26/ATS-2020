module Data.Order where

import Text.Printf

import Data.GenState hiding (products)
import Data.Product (Product, ProductUID)
import qualified Data.Product as Product

import Data.List
import qualified Data.Set as Set

import Control.Monad.State.Lazy

import Test.QuickCheck

data Order =
  Accepted
    { uid :: OrderUID
    }
  | Order
    { uid :: OrderUID
    , userUID :: PersonUID
    , storeUID :: EntityUID
    , products :: [(Int, Product)]
    , weight :: Float
    }

instance Show Order where
  show order@Order{} = concat
    [ "Encomenda:e" ++ show (uid order) ++ ","
    , "u" ++ show (userUID order) ++ ","
    , "l" ++ show (storeUID order) ++ ","
    , printf "%.2f" (weight order) ++ ","
    , intercalate "," . map showProduct $ products order
    ]
    where
      showProduct (quantity, prod) = intercalate ","
        [ show . Product.uid $ prod
        , Product.name prod
        , show quantity
        , printf "%.2f" (Product.price $ prod)
        ]
  show Accepted{uid = uid}
    = "Aceite:e" ++ show uid

genProducts :: Int -> StateT GenState Gen [Product]
genProducts 0 =
  return []
genProducts n = do
  st <- get
  let avProducts = availableProducts st
  if Set.size avProducts == 0 then
    error "No products available."
  else do
    index <- lift $ choose (0::ProductUID, Set.size avProducts-1)
    let product = Set.elemAt index avProducts
    (products, st) <- lift $ runStateT (genProducts (n-1)) st
    return $ product:products

genOrder :: StateT GenState Gen Order
genOrder = do
  st <- get
  let avUIDs = availableOrderUIDs st
  let genUser = generatedUserUIDs st
  let genStore = generatedStoreUIDs st
  if Set.null avUIDs || Set.null genUser || Set.null genStore then
    error "No available/generated UIDs."
  else do
    nProducts <- lift $ choose (1::Int, 10)
    indexOrder <- lift $ choose (0::OrderUID, Set.size avUIDs-1)
    indexUser <- lift $ choose (0::PersonUID, Set.size genUser-1)
    indexStore <- lift $ choose (0::EntityUID, Set.size genStore-1)
    let uid = Set.elemAt indexOrder avUIDs
    let user = Set.elemAt indexUser genUser
    let store = Set.elemAt indexStore genStore
    (prodList, st) <- lift $ runStateT (genProducts nProducts) st
    let weight = sum . map Product.weight $ prodList
    let prods = [(length $ filter (==prod) prodList, prod) | prod <- Set.toList $ Set.fromList prodList]
    put st{ generatedOrderUIDs = Set.insert uid (generatedOrderUIDs st)
          , availableOrderUIDs = Set.delete uid (availableOrderUIDs st)}
    return Order{ uid = uid, userUID = user, storeUID = store
                , products = prods, weight = weight}


genAccepted :: StateT GenState Gen Order
genAccepted = do
  st <- get
  let genOrder = generatedOrderUIDs st
  let accOrder = acceptedOrderUIDs st
  let diff = genOrder `Set.difference` accOrder
  if Set.null diff then
    error $ intercalate "\n"
      [ "No orders left to accept."
      , "generated : " ++ show genOrder
      , "accepted : " ++ show accOrder
      ]
  else do
    index <- lift $ choose (0::Int, Set.size diff-1)
    let orderUID = Set.elemAt index diff
    put st{acceptedOrderUIDs = Set.insert orderUID accOrder}
    return Accepted{uid = orderUID}

genOrderN :: Int -> StateT GenState Gen [Order]
genOrderN 0 =
  return []
genOrderN n = do
  st <- get
  (order, st) <- lift $ runStateT genOrder st
  (orders, st) <- lift $ runStateT (genOrderN (n-1)) st
  put st
  return $ order:orders

genAcceptedN :: Int -> StateT GenState Gen [Order]
genAcceptedN 0 =
  return []
genAcceptedN n = do
  st <- get
  (order, st) <- lift $ runStateT genAccepted st
  (orders, st) <- lift $ runStateT (genAcceptedN (n-1)) st
  put st
  return $ order:orders
