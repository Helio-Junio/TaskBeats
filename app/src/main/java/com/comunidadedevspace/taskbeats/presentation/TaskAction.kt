package com.comunidadedevspace.taskbeats.presentation

import com.comunidadedevspace.taskbeats.data.local.Task
import java.io.Serializable

// [CRUD] CREATE, READ, UPDATE, DELETE
enum class ActionType {
    DELETE,
    UPDATE,
    CREATE
}

data class TaskAction(
    val task: Task?,
    val actionType: String
) : Serializable