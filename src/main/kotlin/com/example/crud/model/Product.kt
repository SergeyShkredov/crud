package com.example.crud.model

import javax.persistence.*

@Entity
@Table(
    name = "products",
    indexes = [Index(
        name = "fki_products_category_table_id_fk",
        columnList = "categoryId"
    ), Index(name = "fki_products_supplier_table_id_fk", columnList = "supplierId")]
)
class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId", nullable = false)
    private val id: Long = 0

    @Column(name = "name")
    private val name: String? = null

    @Column(name = "article ")
    private val article: String? = null

    @Column(name = "quantity")
    private val quantity: Long? = null

    @ManyToOne(optional = false)
    @JoinColumn(name = "supplierId", nullable = false)
    private val supplier: Supplier? = null

    @Column(name = "cost")
    private val cost: Long? = null

    @ManyToOne(optional = false)
    @JoinColumn(name = "categoryId", nullable = false)
    private val category: Category? = null
}
