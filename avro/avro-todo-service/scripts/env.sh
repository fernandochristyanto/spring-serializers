#!/bin/bash

# Dockerhub
export CONFLUENT_REPOSITORY=confluentinc
export CONFLUENT_TAG=5.5.1
export WURSTMEISTER_REPOSITORY=wurstmeister
export KAFKA_TAG=2.12-2.5.0
export ZOOKEEPER_TAG=latest

# General
export LOCAL_STATIC_IP=192.168.99.3

# Kafka
export KAFKA_CONSUMER_GROUP_ID=my-consumer-group

# Control Center
export CONTROL_CENTER_REPLICATION_FACTOR=1
export CONTROL_CENTER_INTERNAL_TOPICS_PARTITIONS=1
export CONTROL_CENTER_MONITORING_INTERCEPTOR_TOPIC_REPLICATION=1
export CONTROL_CENTER_MONITORING_INTERCEPTOR_TOPIC_PARTITIONS=1
export CONTROL_CENTER_METRICS_TOPIC_REPLICATION=1
export CONTROL_CENTER_METRICS_TOPIC_PARTITIONS=1
export CONTROL_CENTER_STREAMS_CACHE_MAX_BYTES_BUFFERING=100000000
export CONTROL_CENTER_STREAMS_CONSUMER_REQUEST_TIMEOUT_MS=960032
export CONTROL_CENTER_STREAMS_NUM_STREAM_THREADS=1