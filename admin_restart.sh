#!/usr/bin/env bash

set -e

docker rm -f kadmin
docker rmi -f kadmin

mvn clean install -pl kadmin -am -DskipTests=true

docker-compose up -d --no-deps --build  kadmin
docker ps -a
docker logs --follow kadmin
