#!/bin/python
import sys
from sys import stdin
from shutil import copyfile
import os
import urllib.request
import json

metrics_keys = [ "ncloc"
               , "bugs"
               , "vulnerabilities"
               , "security_hotspots"
               , "sqale_index"
               , "code_smells"
               , "duplicated_lines_density"
               , "duplicated_blocks"
               ]

def search_link(project_name):
    return "http://localhost:9000/api/components/search?qualifiers=TRK&q=" + project_name

def get_metric_link(componentId, metric):
    return "http://localhost:9000/api/measures/component?componentId=" + componentId + "&metricKeys=" + metric


def main():
    if len(sys.argv) < 2:
        print("usage :" + sys.argv[0] + " <dest path> or --metrics")
        return 1;
    if sys.argv[1] == "--metrics":
        print("name", end="")
        for key in metrics_keys:
            print("\t" + key, end="")
        print("")
        exit()
    contents = urllib.request.urlopen(search_link(sys.argv[1])).read()
    name = json.loads(contents)['components'][0]['name']
    componentId = json.loads(contents)['components'][0]['id']
    print(name, end="")
    for i in range(len(metrics_keys)):
        url = get_metric_link(componentId, metrics_keys[i])
        contents = urllib.request.urlopen(url).read()
        value = json.loads(contents)["component"]["measures"][0]["value"]
        print("\t" + value, end="")
    print("")

if __name__ == "__main__":
    main()
