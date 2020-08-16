package com.fernandochristyanto.todoservice.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "kafka-topic")
data class KafkaTopicConfigurationProperties(
        val todos: Topic
) {
    data class Topic (
            val name: String,
            val partitionCount: Int,
            val replicationFactor: Short
    )
}