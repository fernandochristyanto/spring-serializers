# Spring Avro

Trying out avro on spring framework for serializing & deserializing messages (through kafka). This project implements ***schema-first*** approach, where  schemas are written firsthand in *JSON* format, then the respective classes will be generated on build-time (using avro-tools).

This project:

* Publishes a message to kafka (serialized by avro), while invalidate schema backward-compatibility
* Consumes a message from kafka (deserialized by avro)

## Prerequisites

* Gradle
* Java
* Docker & Compose
* Postman

## Components

* **Gradle** -- Build tool
* **Spring** -- App Framework
* **Kafka** -- Broker
* **Avro** -- Serialization protocol
* **Confluent Schema Registry** -- Keeps track of avro schema evolution
* **Confluent Control Center** -- UI for confluent server

## How to run

1. Setup a static IP on your local machine

``` 
sudo ifconfig lo0 alias 192.168.99.3
```

2. Execute `start.sh` in `scripts` directory
3. Publish a message by hitting the `POST` publish endpoint (available in postman file)
4. To open confluent control center, head to `localhost:9021` .
