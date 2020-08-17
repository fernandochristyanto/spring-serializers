#!/bin/bash

# Build App
cd .. && \
  ./gradlew clean build && \
  cd -

source ./env.sh

# Start compose
docker-compose up --build

# Stop compose
docker-compose down