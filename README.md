# ATS-2020

## Run Software

### Create all Projects

#### Create into /tmp/

```
for n in {0..98}; do \
./scripts/mkmaven.sh projectsPOO_1920/$n/ /tmp/ "ats_$(printf "%.2d" $n)";\
done
```

**NOTE:** parse error on project 27 put \n at the beginning of files to fix

#### Collect metrics from projects

```
python scripts/collect_metrics.py --metrics;\
for n in {0..98}; do \
    python scripts/collect_metrics.py "ats_$(printf "%.2d" $n)";\
done
```

## Sonarqube-7.9.4 API 
**Documentation:** To access Rest API documentation, go to: http://localhost:9000/web_api

**Project List:** http://localhost:9000/api/components/search?qualifiers=TRK&q=ats_00

**Measures:** http://localhost:9000/web_api/api/measures

**Metric Keys:** http://localhost:9000/api/metrics/search

## Author

-   **Carolina Resende Marques:** [CarolinaRMarques](https://github.com/CarolinaRMarques)
-   **Emely da Mata Mendonça:** [emelydamata](https://github.com/emelydamata)
-   **Jorge Gabriel Alves Cerqueira,:** [Kaixi26](https://github.com/Kaixi26)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
