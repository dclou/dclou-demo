#!/usr/bin/env bash
eval $(docker-machine env default)
gradle buildDocker
docker-compose up -d
