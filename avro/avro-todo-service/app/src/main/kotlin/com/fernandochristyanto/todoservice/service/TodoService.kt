package com.fernandochristyanto.todoservice.service

import com.fernandochristyanto.todoservice.domain.Todo
import com.fernandochristyanto.todoservice.dto.TaskDTO
import com.fernandochristyanto.todoservice.dto.TodoDTO
import com.fernandochristyanto.todoservice.dto.createtodo.CreateTodoRequest
import com.fernandochristyanto.todoservice.dto.publishtodo.PublishTodoMessage
import com.fernandochristyanto.todoservice.repository.TodoRepository
import mu.KotlinLogging
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class TodoService(private val todoRepository: TodoRepository, private val kafkaTemplate: KafkaTemplate<String, PublishTodoMessage>) {
    fun createTodo(createTodoRequest: CreateTodoRequest) {
        KotlinLogging.logger(createTodoRequest.title)
    }

    fun publishTodoDetailsToKafka(todoId: Long) {
        val todo: Todo = todoRepository.get(todoId) ?: throw Exception("Todo with id $todoId not found")

        // Convert to avro-generated message
        val publishTodoMessage = PublishTodoMessage().run {
            this.todo = TodoDTO(todo.id!!, todo.title
//                    todo.tasks.map {
//                        TaskDTO(it.id!!, it.todoId, it.title, it.description, it.isImportant, it.deadline.toString(), it.completed, it.createdAt.toString())
//                    }
            )
            return@run this
        }

        // Publish to broker
        kafkaTemplate.send("todos", publishTodoMessage)
    }
}