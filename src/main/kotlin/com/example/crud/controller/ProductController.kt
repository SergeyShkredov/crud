package com.example.crud.controller


import com.example.crud.model.Product
import com.example.crud.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@CrossOrigin(origins = ["*"], maxAge = 3600)
@RestController
@RequestMapping("/product")
class ProductController {

    @Autowired
    var productRepository: ProductRepository? = null

    @GetMapping("/{id}")
    fun getProductlById(@PathVariable("id") id: Long): ResponseEntity<Product> {
        val product: Optional<Product?> = productRepository!!.findById(id)
        return ResponseEntity<Product>(product.get(), HttpStatus.OK)
    }

    @PostMapping
    fun addProduct(@RequestBody product: Product): ResponseEntity<Product> {

        productRepository!!.save(product)

        val product: Product = productRepository!!.save(product)

        return ResponseEntity<Product>(product, HttpStatus.CREATED)
    }

    @DeleteMapping("/{id}")
    fun deleteProduct(@PathVariable("id") id: Long): ResponseEntity<HttpStatus> {
        return try {
            productRepository!!.deleteById(id)
            ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT)
        } catch (e: Exception) {
            ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @GetMapping()
    fun findAllUsers(): List<Product?>? {
        return productRepository!!.findAll()
    }
}
