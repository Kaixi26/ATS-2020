module Main where

import System.Environment

import qualified Data.Set as Set
import Data.Maybe

import Test.QuickCheck

import Control.Monad.State.Lazy

import qualified Data.Person as Person
import qualified Data.Transport as Transp
import qualified Data.Store as Store
import qualified Data.Order as Order
import Data.GenState

data RunState =
  PrintUsage
  | PrintHelp
  | Run {cfg :: Config}
  deriving Show

data Config = Config
  { nUsers :: Int
  , nVolunteers :: Int
  , nTrans :: Int
  , nStores :: Int
  , nOrders :: Int
  , nAccepted :: Int
  } deriving Show

defaultConfig :: Config
defaultConfig = Config
  { nUsers = 3
  , nVolunteers = 3
  , nTrans = 3
  , nStores = 3
  , nOrders = 3
  , nAccepted = 3
  }

stateFromConfig :: Config -> GenState
stateFromConfig cfg = defaultGenState
  { availablePeopleUIDs = Set.fromList [0..(nUsers cfg + nVolunteers cfg-1)]
  , availableTransportUIDs = Set.fromList [0..(nTrans cfg-1)]
  , availableStoreUIDs = Set.fromList [0..(nStores cfg-1)]
  , availableOrderUIDs = Set.fromList [0..(nOrders cfg-1)]
  }
  
genState :: Config -> StateT GenState Gen [String]
genState cfg = do
  st <- get
  (users, st) <- lift $ runStateT (Person.genN Person.User (nUsers cfg)) st
  (volunteers, st) <- lift $ runStateT (Person.genN Person.Volunteer (nVolunteers cfg)) st
  (transp, st) <- lift $ runStateT (Transp.genN $ nTrans cfg) st
  (stores, st) <- lift $ runStateT (Store.genN (nStores cfg)) st
  (orders, st) <- lift $ runStateT (Order.genOrderN (nOrders cfg)) st
  (accepted, st) <- lift $ runStateT (Order.genAcceptedN (nAccepted cfg)) st
  put st
  return $
    map show (users ++ volunteers) ++
    map show transp ++
    map show stores ++
    map show (orders ++ accepted)

logFromConfig :: Config -> IO [String]
logFromConfig config =
  generate $ evalStateT (genState config) (stateFromConfig config)

test :: IO ()
test = logFromConfig defaultConfig >>= mapM_ putStrLn

parseArgs :: [String] -> RunState
parseArgs = parseArgs' defaultConfig
  where
    parseArgs' :: Config -> [String] -> RunState
    parseArgs' config [] = Run config
    parseArgs' _ ("--help":_) = PrintHelp
    parseArgs' config (opt:num:args) =
      let num' = (listToMaybe . map fst . reads $ num) :: Maybe Int
      in case num' of
        Just value ->
          case opt of
            "--users"      -> parseArgs' config{nUsers = value} args
            "--volunteers" -> parseArgs' config{nVolunteers = value} args
            "--transport"  -> parseArgs' config{nTrans = value} args
            "--stores"     -> parseArgs' config{nStores = value} args
            "--orders"     -> parseArgs' config{nOrders = value} args
            "--accepted"   -> parseArgs' config{nAccepted = value} args
            _ -> PrintUsage
        Nothing -> PrintUsage
    parseArgs' _ _ = PrintUsage

main :: IO ()
main = do
  pname <- getProgName
  args <- getArgs
  print args
  case parseArgs args of
    Run config -> do
      logLines <- logFromConfig config
      mapM_ putStrLn logLines
      return ()
    PrintHelp -> do
      putStrLn . unlines $
        [ concat ["usage: ", pname, " --help"]
        , "parameters: (Default value is 3)"
        , "\t--users [number], set number of users"
        , "\t--volunteers [number], set number of volunteers"
        , "\t--transport [number], set number of transport companies"
        , "\t--stores [number], set number of stores"
        , "\t--orders [number], set number of orders"
        , "\t--accepted [number], set number of accepted orders"
        ]
    PrintUsage -> do
      putStrLn $ concat ["usage: ", pname, " --help"]


