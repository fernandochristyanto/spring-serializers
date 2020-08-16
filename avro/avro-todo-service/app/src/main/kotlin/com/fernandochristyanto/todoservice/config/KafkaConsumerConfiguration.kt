package com.fernandochristyanto.todoservice.config

import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig
import io.confluent.kafka.serializers.KafkaAvroDeserializer
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.common.serialization.StringDeserializer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.ConsumerFactory
import org.springframework.kafka.core.DefaultKafkaConsumerFactory
import java.util.*

@Configuration
class KafkaConsumerConfiguration {
    fun consumerFactoryConfiguration(): Map<String, Any>? {
        val configs: MutableMap<String, Any> = HashMap()
        configs[ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG] = "http://192.168.99.3:9092"
        configs[ConsumerConfig.GROUP_ID_CONFIG] = "my-group"
        configs[ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG] = StringDeserializer::class.java
        configs[ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG] = KafkaAvroDeserializer::class.java
        configs[AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG] = "http://192.168.99.3:8085"
        configs[KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG] = true
        return configs
    }

    @Bean
    fun consumerFactory(): ConsumerFactory<*, *> {
        return DefaultKafkaConsumerFactory<Any, Any>(consumerFactoryConfiguration()!!)
    }
}