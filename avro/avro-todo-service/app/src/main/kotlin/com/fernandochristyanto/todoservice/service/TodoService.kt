package com.fernandochristyanto.todoservice.service

import com.fernandochristyanto.todoservice.dto.createtodo.CreateTodoRequest
import com.fernandochristyanto.todoservice.repository.TodoRepository
import org.springframework.stereotype.Service

@Service
class TodoService(private val todoRepository: TodoRepository) {
    fun createTodo(createTodoRequest: CreateTodoRequest) {

    }

    fun publishTodoDetailsToKafka(todoId: Long) {

    }
}