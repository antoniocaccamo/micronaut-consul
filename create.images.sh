#!/bin/bash
# Read a string with spaces using for loop

mvn package -DskipTests

if [ $? -ne 0 ] 
    then
        exit
fi

for value in catalogue inventory recommandation
do
    echo "\n-------------------- $value  -----------------------------"

    echo "\n $value : create image "
    docker build -t antoniocaccamo/micronaut-consul-book$value:$(git rev-parse --short HEAD) \
        -f book$value/Dockerfile book$value/

    echo "\n $value : tag latest image "
    docker image tag antoniocaccamo/micronaut-consul-book$value:$(git rev-parse --short HEAD) \
        antoniocaccamo/micronaut-consul-book$value:latest

done
