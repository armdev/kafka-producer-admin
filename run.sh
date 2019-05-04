#!/usr/bin/env bash

set -e
mvn clean install -pl kadmin -am -DskipTests=true
mvn clean install -pl kproducer -am -DskipTests=true
sudo docker-compose down
sudo docker-compose up -d --build
sudo docker ps -a
