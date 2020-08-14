package com.fernandochristyanto.todoservice.domain

import java.time.Instant

data class Todo(
        val id: Long?,
        val title: String,
        val tasks: List<Task>,
        val createdAt: Instant
)