package com.in28minutes.microservices.limitsservice

import org.springframework.boot.autoconfigure.SpringBootApplication

import org.springframework.boot.runApplication

@SpringBootApplication
class LimitsServiceApplication

fun main(args: Array<String>) {
	runApplication<LimitsServiceApplication>(*args)
}
