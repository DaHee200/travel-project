package test.develop.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import test.develop.config.IdGenerator

@Entity
@Table(name = "region")
class Region(
    @Id
    val id: String = IdGenerator.generateId(),
    var name: String,
    var description: String,
    var imageUrl: String?
)