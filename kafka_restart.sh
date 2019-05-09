#!/usr/bin/env bash

set -e

sudo docker rm -f kafka
sudo docker rmi -f kafka



sudo docker-compose up -d --no-deps --build kafka
sudo docker ps -a
sudo docker logs --follow kafka
