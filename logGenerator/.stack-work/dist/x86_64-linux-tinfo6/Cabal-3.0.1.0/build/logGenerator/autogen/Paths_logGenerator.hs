{-# LANGUAGE CPP #-}
{-# LANGUAGE NoRebindableSyntax #-}
{-# OPTIONS_GHC -fno-warn-missing-import-lists #-}
module Paths_logGenerator (
    version,
    getBinDir, getLibDir, getDynLibDir, getDataDir, getLibexecDir,
    getDataFileName, getSysconfDir
  ) where

import qualified Control.Exception as Exception
import Data.Version (Version(..))
import System.Environment (getEnv)
import Prelude

#if defined(VERSION_base)

#if MIN_VERSION_base(4,0,0)
catchIO :: IO a -> (Exception.IOException -> IO a) -> IO a
#else
catchIO :: IO a -> (Exception.Exception -> IO a) -> IO a
#endif

#else
catchIO :: IO a -> (Exception.IOException -> IO a) -> IO a
#endif
catchIO = Exception.catch

version :: Version
version = Version [0,1,0,0] []
bindir, libdir, dynlibdir, datadir, libexecdir, sysconfdir :: FilePath

bindir     = "/home/kaixi/git/ATS-2020/logGenerator/.stack-work/install/x86_64-linux-tinfo6/c34a7dc22df3a495794e45611f97d14e6a996a3b701e04c4a9b8c7a1dbd98a76/8.8.4/bin"
libdir     = "/home/kaixi/git/ATS-2020/logGenerator/.stack-work/install/x86_64-linux-tinfo6/c34a7dc22df3a495794e45611f97d14e6a996a3b701e04c4a9b8c7a1dbd98a76/8.8.4/lib/x86_64-linux-ghc-8.8.4/logGenerator-0.1.0.0-6s6eBTxcTxN1jEOXfaq7Ox-logGenerator"
dynlibdir  = "/home/kaixi/git/ATS-2020/logGenerator/.stack-work/install/x86_64-linux-tinfo6/c34a7dc22df3a495794e45611f97d14e6a996a3b701e04c4a9b8c7a1dbd98a76/8.8.4/lib/x86_64-linux-ghc-8.8.4"
datadir    = "/home/kaixi/git/ATS-2020/logGenerator/.stack-work/install/x86_64-linux-tinfo6/c34a7dc22df3a495794e45611f97d14e6a996a3b701e04c4a9b8c7a1dbd98a76/8.8.4/share/x86_64-linux-ghc-8.8.4/logGenerator-0.1.0.0"
libexecdir = "/home/kaixi/git/ATS-2020/logGenerator/.stack-work/install/x86_64-linux-tinfo6/c34a7dc22df3a495794e45611f97d14e6a996a3b701e04c4a9b8c7a1dbd98a76/8.8.4/libexec/x86_64-linux-ghc-8.8.4/logGenerator-0.1.0.0"
sysconfdir = "/home/kaixi/git/ATS-2020/logGenerator/.stack-work/install/x86_64-linux-tinfo6/c34a7dc22df3a495794e45611f97d14e6a996a3b701e04c4a9b8c7a1dbd98a76/8.8.4/etc"

getBinDir, getLibDir, getDynLibDir, getDataDir, getLibexecDir, getSysconfDir :: IO FilePath
getBinDir = catchIO (getEnv "logGenerator_bindir") (\_ -> return bindir)
getLibDir = catchIO (getEnv "logGenerator_libdir") (\_ -> return libdir)
getDynLibDir = catchIO (getEnv "logGenerator_dynlibdir") (\_ -> return dynlibdir)
getDataDir = catchIO (getEnv "logGenerator_datadir") (\_ -> return datadir)
getLibexecDir = catchIO (getEnv "logGenerator_libexecdir") (\_ -> return libexecdir)
getSysconfDir = catchIO (getEnv "logGenerator_sysconfdir") (\_ -> return sysconfdir)

getDataFileName :: FilePath -> IO FilePath
getDataFileName name = do
  dir <- getDataDir
  return (dir ++ "/" ++ name)
