package com.fernandochristyanto.todoservice.controller

import com.fernandochristyanto.todoservice.dto.createtodo.CreateTodoRequest
import com.fernandochristyanto.todoservice.service.TodoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/todos")
class TodoController(private val todoService: TodoService) {
    /**
     * IMPORTANT
     * =========
     * This endpoint is only for display (does not work).
     * Because I still have no use case in using avro for http body payload
     */
    @PostMapping
    fun createTodo(createTodoRequest: CreateTodoRequest) = todoService.createTodo(createTodoRequest)

    @PostMapping("/kafka/{todoId}")
    fun publishTodoDetailsToKafka(@PathVariable todoId: Long) = todoService.publishTodoDetailsToKafka(todoId)
}