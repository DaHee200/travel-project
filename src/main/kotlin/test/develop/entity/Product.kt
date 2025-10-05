package test.develop.entity

import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import test.develop.config.IdGenerator

@Entity
@Table(name = "product")
class Product(
    @Id
    val id:String = IdGenerator.generateId(),
    val title: String,
    val price: Int,
    val description: String,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    val region: Region
)