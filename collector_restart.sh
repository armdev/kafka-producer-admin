#!/usr/bin/env bash

set -e

sudo docker rm -f collector
sudo docker rmi -f collector

mvn clean install -pl collector -am -DskipTests=true

sudo docker-compose up -d --no-deps --build  collector
sudo docker ps -a
sudo docker logs --follow collector
