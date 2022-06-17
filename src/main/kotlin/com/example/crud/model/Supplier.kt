package com.example.crud.model

import javax.persistence.*

@Table(name = "suppliers")
@Entity
class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplierId", unique = true, nullable = false)
    var supplierId: Long? = null

    @Column(name = "name", unique = true, nullable = false)
    var name: String? = null

    constructor(supplierId: Long?, name: String?) {
        this.supplierId = supplierId
        this.name = name
    }

    constructor() {}
}
