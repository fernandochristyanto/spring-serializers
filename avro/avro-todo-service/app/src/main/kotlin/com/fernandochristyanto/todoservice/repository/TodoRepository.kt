package com.fernandochristyanto.todoservice.repository

import com.fernandochristyanto.todoservice.domain.Todo
import org.springframework.stereotype.Component

@Component
class TodoRepository {
    private val todos: MutableList<Todo> = ArrayList()

    fun create(todo: Todo) {
        todos.add(todo)
    }

    fun get(id: Long): Todo? = todos.firstOrNull { todo -> todo.id == id }
}