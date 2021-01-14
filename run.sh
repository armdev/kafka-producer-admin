#!/usr/bin/env bash

set -e
mvn clean install -pl kadmin -am -DskipTests=true
mvn clean install -pl kproducer -am -DskipTests=true
mvn clean install -pl collector -am -DskipTests=true
docker-compose down
docker-compose up -d --build
docker ps -a
