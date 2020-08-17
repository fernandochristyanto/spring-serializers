package com.fernandochristyanto.todoservice.inbound

import com.fernandochristyanto.todoservice.config.KafkaTopicConfigurationProperties
import com.fernandochristyanto.todoservice.dto.publishtodo.PublishTodoMessage
import mu.KotlinLogging
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KafkaTodoConsumer(private val kafkaTopicConfigurationProperties: KafkaTopicConfigurationProperties) {

    @KafkaListener(topics = ["todos"])
    fun consumeTodoDetails(publishTodoMessage: PublishTodoMessage) {
        KotlinLogging.logger("KafkaTodoConsumer").info { publishTodoMessage.todo.id.toString() }
    }
}