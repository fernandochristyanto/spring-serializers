package com.fernandochristyanto.todoservice.config

import com.fernandochristyanto.todoservice.domain.Task
import com.fernandochristyanto.todoservice.domain.Todo
import com.fernandochristyanto.todoservice.repository.TodoRepository
import org.springframework.context.annotation.Configuration
import java.time.Instant
import javax.annotation.PostConstruct

@Configuration
class TodoSeeder(private val todoRepository: TodoRepository) {
    @PostConstruct
    fun seedTodos() {
        todoRepository.save(
                Todo(1,
                        "First Todo",
                        listOf(Task(1, 1, "Cook", null, true, Instant.now(), false, Instant.now()),
                                Task(2, 1, "Eat", null, true, Instant.now(), false, Instant.now())),
                        Instant.now()
                )
        )
        todoRepository.save(
                Todo(2,
                        "Second Todo",
                        listOf(Task(3, 2, "Cook Again", null, true, Instant.now(), false, Instant.now()),
                                Task(4, 2, "Eat Again", null, true, Instant.now(), false, Instant.now())),
                        Instant.now()
                )
        )
    }
}