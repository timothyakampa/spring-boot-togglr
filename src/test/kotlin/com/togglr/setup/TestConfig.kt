package com.togglr.setup

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class TestConfig

fun main(args: Array<String>) {
    SpringApplication.run(TestConfig::class.java, *args)
}
