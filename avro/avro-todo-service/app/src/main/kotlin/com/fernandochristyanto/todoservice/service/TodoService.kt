package com.fernandochristyanto.todoservice.service

import com.fernandochristyanto.todoservice.repository.TodoRepository
import org.springframework.stereotype.Service

@Service
class TodoService(private val todoRepository: TodoRepository) {
    fun createTodo() {

    }

    fun publishTodoDetailsToKafka(todoId: Long) {

    }
}