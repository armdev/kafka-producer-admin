#!/usr/bin/env bash

set -e

docker rm -f kafka
docker rmi -f kafka



docker-compose up -d --no-deps --build kafka
docker ps -a
docker logs --follow kafka
