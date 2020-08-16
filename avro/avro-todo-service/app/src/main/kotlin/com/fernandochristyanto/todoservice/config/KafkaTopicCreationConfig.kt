package com.fernandochristyanto.todoservice.config

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class KafkaTopicCreationConfig(private val kafkaTopicConfigurationProperties: KafkaTopicConfigurationProperties) {
    @Bean
    fun todoTopic() = with(kafkaTopicConfigurationProperties) { NewTopic(todos.name, todos.partitionCount, todos.replicationFactor) }
}