package test.develop.config

import java.util.UUID

object IdGenerator {
    fun generateId(): String {
        val uuid = UUID.randomUUID().toString().replace("-", "")
        return uuid.substring(0, 8)
    }
}


