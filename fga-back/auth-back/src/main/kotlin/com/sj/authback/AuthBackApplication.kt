package com.sj.authback

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AuthBackApplication

fun main(args: Array<String>) {
    runApplication<AuthBackApplication>(*args)
}
