package com.example.crud.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "orders")
class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null

    @OneToOne
    @JoinColumn(name = "productId", referencedColumnName = "productId")
    private val product: Product? = null

    @Column(name = "date")
    private val date: Date? = null
}
