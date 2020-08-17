#!/bin/bash

# Environment variables
export CONFLUENT_REPOSITORY=confluentinc
export CONFLUENT_TAG=5.5.1

export WURSTMEISTER_REPOSITORY=wurstmeister
export KAFKA_TAG=2.12-2.5.0
export ZOOKEEPER_TAG=latest

export LOCAL_STATIC_IP=192.168.99.3

# Set-up static IP
sudo ifconfig lo0 alias ${LOCAL_STATIC_IP}

# Start compose
docker-compose up --build