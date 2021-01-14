#!/usr/bin/env bash

set -e

docker rm -f kproducer
docker rmi -f kproducer

clean install -pl kproducer -am -DskipTests=true

docker-compose up -d --no-deps --build kproducer
docker ps -a
docker logs --follow kproducer
