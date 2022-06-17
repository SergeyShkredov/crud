package com.example.crud.exceptions

import org.springframework.http.HttpStatus

class BlogAPIException : RuntimeException() {
    var status: HttpStatus? = null
    override var message: String? = null
}
