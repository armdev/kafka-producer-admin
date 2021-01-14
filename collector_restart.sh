#!/usr/bin/env bash

set -e

docker rm -f collector
docker rmi -f collector

mvn clean install -pl collector -am -DskipTests=true

docker-compose up -d --no-deps --build  collector
docker ps -a
docker logs --follow collector
