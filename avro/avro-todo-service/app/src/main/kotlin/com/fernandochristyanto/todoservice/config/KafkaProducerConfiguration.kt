package com.fernandochristyanto.todoservice.config

import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig
import io.confluent.kafka.serializers.KafkaAvroSerializer
import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.common.serialization.StringSerializer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.DefaultKafkaProducerFactory
import org.springframework.kafka.core.ProducerFactory
import java.util.*


@Configuration
class KafkaProducerConfiguration(private val springKafkaConfigurationProperties: SpringKafkaConfigurationProperties) {
    @Bean
    fun producerFactory(): ProducerFactory<*, *>? {
        val config: MutableMap<String, Any> = HashMap()
        config[ProducerConfig.BOOTSTRAP_SERVERS_CONFIG] = springKafkaConfigurationProperties.bootstrapServers
        config[ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG] = StringSerializer::class.java
        config[ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG] = KafkaAvroSerializer::class.java
        config[AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG] = springKafkaConfigurationProperties.properties.schemaRegistryUrl

        return DefaultKafkaProducerFactory<Any, Any>(config)
    }
}