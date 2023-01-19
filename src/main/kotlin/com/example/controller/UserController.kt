package com.example.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @RequestMapping("/user")
    fun user(): User {
        val user = User("Taro",12)
        return user
    }
}

data class User(val name: String, val age: Int)