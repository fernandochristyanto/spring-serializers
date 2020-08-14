package com.fernandochristyanto.todoservice.domain

import java.time.Instant

data class Task(
        val id: Long?,
        val todoId: Long,
        val title: String,
        val description: String?,
        val isImportant: Boolean,
        val deadline: Instant,
        val completed: Boolean,
        val createdAt: Instant
)