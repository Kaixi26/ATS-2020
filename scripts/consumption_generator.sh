#!/usr/bin/env bash

for i in 10 100 1000 10000 20000 50000
do
    pushd logGenerator
    stack --allow-different-user run -- logGenerator --users $i --volunteers $i --transport $i --stores $i --orders $i --accepted $i\
        > ../files/Logs.txt
    popd
    for n in {0..19}
    do
        for proj in "07" "50"
        do
            echo "test $n on project $proj for size $i"
            (sudo java -cp ats_$proj\_refactored/target/classes/ EnergyCheckUtils $i $i $i $i $i | tail -1)\
                >> consumption_tests/$proj\_$i
            (sudo java -cp ats_$proj\_refactored/target/classes/ EnergyCheckUtils -1 | tail -1)\
                >> consumption_tests/$proj\_logs_$i
        done
    done
done
