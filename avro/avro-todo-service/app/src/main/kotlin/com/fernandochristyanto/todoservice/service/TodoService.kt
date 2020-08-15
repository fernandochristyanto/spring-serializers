package com.fernandochristyanto.todoservice.service

import com.fernandochristyanto.todoservice.domain.Todo
import com.fernandochristyanto.todoservice.dto.createtodo.CreateTodoRequest
import com.fernandochristyanto.todoservice.repository.TodoRepository
import mu.KotlinLogging
import org.springframework.stereotype.Service

@Service
class TodoService(private val todoRepository: TodoRepository) {
    fun createTodo(createTodoRequest: CreateTodoRequest) {
        KotlinLogging.logger(createTodoRequest.title)
    }

    fun publishTodoDetailsToKafka(todoId: Long) {
        val todo: Todo = todoRepository.get(todoId) ?: throw Exception("Todo with id $todoId not found")

        // Convert to avro-generated message


        // Publish to broker

    }
}