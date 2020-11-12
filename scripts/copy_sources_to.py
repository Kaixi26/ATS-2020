#!/bin/python
import sys
from sys import stdin
from shutil import copyfile
import os

def main():
    dest = None
    if len(sys.argv) < 2:
        print("usage :" + sys.argv[0] + " <dest path>")
        return 1;
    else:
        dest = sys.argv[1]
        if dest[len(dest)-1] != '/':
            dest = dest + "/"

    lines = []
    for line in stdin:
        lines.append(line.replace('\n',''))

    if len(lines) == 0:
        return 0

    #find sources root (common prefix)
    i = 0
    foundPrefix = False
    while i < len(lines[0]) and not foundPrefix:
        c = lines[0][i]
        for line in lines:
            if len(line) < i or line[i] != c:
                foundPrefix = True
                break;
        i += 1

    print("Copying files from '" + line[0:(i-1)] + "' to '" + dest + "'")
#    print(dest)
#    print(line[0:(i-1)])
    for line in lines:
        #print(line[0:(i-1)] + " | " + line[(i-1):])
        try:
            copyfile(line, dest + line[(i-1):])
        except IOError as io_err:
            os.makedirs(os.path.dirname(dest + line[(i-1):]))
            copyfile(line, dest + line[(i-1):])




if __name__ == "__main__":
    main()
