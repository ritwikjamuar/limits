package com.in28minutes.microservices.currencyexchange

import org.springframework.boot.autoconfigure.SpringBootApplication

import org.springframework.boot.runApplication

@SpringBootApplication
class CurrencyExchangeServiceApplication

fun main(args: Array<String>) {
	runApplication<CurrencyExchangeServiceApplication>(*args)
}
