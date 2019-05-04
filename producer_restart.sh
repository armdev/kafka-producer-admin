#!/usr/bin/env bash

set -e

sudo docker rm -f kproducer
sudo docker rmi -f kproducer

mvn clean install -pl kproducer -am -DskipTests=true

sudo docker-compose up -d --no-deps --build kproducer
sudo docker ps -a
sudo docker logs --follow kproducer
