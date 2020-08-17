package com.fernandochristyanto.todoservice.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "spring.kafka")
data class SpringKafkaConfigurationProperties(
        val bootstrapServers: String,
        val properties: Properties,
        val consumer: Consumer
) {
    data class Properties (
            val schemaRegistryUrl: String
    )

    data class Consumer (
            val groupId: String,
            val autoOffsetReset: String
    )
}