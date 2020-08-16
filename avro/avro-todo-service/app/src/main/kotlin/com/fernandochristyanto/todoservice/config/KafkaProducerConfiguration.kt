package com.fernandochristyanto.todoservice.config

import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig
import io.confluent.kafka.serializers.KafkaAvroDeserializer
import io.confluent.kafka.serializers.KafkaAvroSerializer
import io.confluent.kafka.serializers.KafkaAvroSerializerConfig
import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.common.serialization.StringSerializer
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.DefaultKafkaProducerFactory
import org.springframework.kafka.core.ProducerFactory
import java.util.*


@Configuration
class KafkaProducerConfiguration {
    @Value("\${spring.kafka.properties.schema-registry-url}")
    lateinit var schemaRegistryUrl: String

    @Bean
    fun producerFactory(): ProducerFactory<*, *>? {
        val config: MutableMap<String, Any> = HashMap()
        config[ProducerConfig.BOOTSTRAP_SERVERS_CONFIG] = "http://192.168.99.3:9092"
        config[ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG] = StringSerializer::class.java
        config[ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG] = KafkaAvroSerializer::class.java
        config[AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG] = "http://192.168.99.3:8085"
        /**
         * From apache kafka config reference (https://kafka.apache.org/documentation/#producerconfigs):
         * Users should generally prefer the "retry" count config unset and instead use delivery.timeout.ms to control retry behavior.
         */
        return DefaultKafkaProducerFactory<Any, Any>(config)
    }
}