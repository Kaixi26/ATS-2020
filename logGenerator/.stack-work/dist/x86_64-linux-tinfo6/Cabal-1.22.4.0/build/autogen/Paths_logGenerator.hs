module Paths_logGenerator (
    version,
    getBinDir, getLibDir, getDataDir, getLibexecDir,
    getDataFileName, getSysconfDir
  ) where

import qualified Control.Exception as Exception
import Data.Version (Version(..))
import System.Environment (getEnv)
import Prelude

catchIO :: IO a -> (Exception.IOException -> IO a) -> IO a
catchIO = Exception.catch

version :: Version
version = Version [0,1,0,0] []
bindir, libdir, datadir, libexecdir, sysconfdir :: FilePath

bindir     = "/home/kaixi/git/ATS-2020/logGenerator/.stack-work/install/x86_64-linux-tinfo6/a435e1b7be85c8a92600c2263a429d6c6b97abc74333e5fef3d2d5b3ebb849f5/7.10.2/bin"
libdir     = "/home/kaixi/git/ATS-2020/logGenerator/.stack-work/install/x86_64-linux-tinfo6/a435e1b7be85c8a92600c2263a429d6c6b97abc74333e5fef3d2d5b3ebb849f5/7.10.2/lib/x86_64-linux-ghc-7.10.2/logGenerator-0.1.0.0-3P0PPjgA9bmChrwksMLglO"
datadir    = "/home/kaixi/git/ATS-2020/logGenerator/.stack-work/install/x86_64-linux-tinfo6/a435e1b7be85c8a92600c2263a429d6c6b97abc74333e5fef3d2d5b3ebb849f5/7.10.2/share/x86_64-linux-ghc-7.10.2/logGenerator-0.1.0.0"
libexecdir = "/home/kaixi/git/ATS-2020/logGenerator/.stack-work/install/x86_64-linux-tinfo6/a435e1b7be85c8a92600c2263a429d6c6b97abc74333e5fef3d2d5b3ebb849f5/7.10.2/libexec"
sysconfdir = "/home/kaixi/git/ATS-2020/logGenerator/.stack-work/install/x86_64-linux-tinfo6/a435e1b7be85c8a92600c2263a429d6c6b97abc74333e5fef3d2d5b3ebb849f5/7.10.2/etc"

getBinDir, getLibDir, getDataDir, getLibexecDir, getSysconfDir :: IO FilePath
getBinDir = catchIO (getEnv "logGenerator_bindir") (\_ -> return bindir)
getLibDir = catchIO (getEnv "logGenerator_libdir") (\_ -> return libdir)
getDataDir = catchIO (getEnv "logGenerator_datadir") (\_ -> return datadir)
getLibexecDir = catchIO (getEnv "logGenerator_libexecdir") (\_ -> return libexecdir)
getSysconfDir = catchIO (getEnv "logGenerator_sysconfdir") (\_ -> return sysconfdir)

getDataFileName :: FilePath -> IO FilePath
getDataFileName name = do
  dir <- getDataDir
  return (dir ++ "/" ++ name)
