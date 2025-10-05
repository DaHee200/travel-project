package test.develop.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import test.develop.config.IdGenerator
import java.time.LocalDateTime
import java.time.ZoneId

@Entity
@Table(name = "history")
class History (
    @Id
    val id : String = IdGenerator.generateId(),
    var journeyTitle: String,
    var regionName: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    var updatedAt: LocalDateTime = LocalDateTime.now()
)