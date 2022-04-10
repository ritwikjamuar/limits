package com.in28minutes.microservices.limitsservice

import com.in28minutes.microservices.limitsservice.configuration.AppConfiguration

import org.springframework.boot.autoconfigure.SpringBootApplication

import org.springframework.boot.context.properties.EnableConfigurationProperties

import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(
	value = [
		AppConfiguration::class
	]
)
class LimitsServiceApplication

fun main(args: Array<String>) {
	runApplication<LimitsServiceApplication>(*args)
}
