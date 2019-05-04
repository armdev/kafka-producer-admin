#!/usr/bin/env bash

set -e

sudo docker rm -f kadmin
sudo docker rmi -f kadmin

mvn clean install -pl kadmin -am -DskipTests=true

sudo docker-compose up -d --no-deps --build  kadmin
sudo docker ps -a
sudo docker logs --follow kadmin
