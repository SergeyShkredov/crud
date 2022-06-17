package com.example.crud.model

import javax.persistence.*

@Table(name = "categories")
@Entity
class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryId", unique = true, nullable = false)
    var categoryId: Long? = null

    @Column(name = "categoryName", unique = true, nullable = false)
    var categoryName: String? = null

    constructor(categoryId: Long?, categoryName: String?) {
        this.categoryId = categoryId
        this.categoryName = categoryName
    }

    constructor() {}
}
