package com.fernandochristyanto.todoservice.controller

import com.fernandochristyanto.todoservice.service.TodoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/todos")
class TodoController(private val todoService: TodoService) {
    @PostMapping
    fun createTodo() = todoService.createTodo()

    @PostMapping("/kafka/{todoId}")
    fun publishTodoDetailsToKafka(@PathVariable todoId: Long) = todoService.publishTodoDetailsToKafka(todoId)
}