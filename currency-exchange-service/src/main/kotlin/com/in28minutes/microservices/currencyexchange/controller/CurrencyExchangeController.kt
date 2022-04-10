package com.in28minutes.microservices.currencyexchange.controller

import com.in28minutes.microservices.currencyexchange.bean.CurrencyExchange

import com.in28minutes.microservices.currencyexchange.service.CurrencyExchangeService

import org.springframework.beans.factory.annotation.Autowired

import org.springframework.core.env.Environment

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

import java.math.BigDecimal

/**
 * [RestController] for receiving and responding all the HTTP Methods related to [CurrencyExchange].
 */
@Suppress("unused")
@RestController
class CurrencyExchangeController {

	/*-------------------------------------------------- Components --------------------------------------------------*/

	/**
	 * Reference of [Environment] to fetch the system attributes of this microservice.
	 */
	@Autowired
	private lateinit var environment: Environment

	/**
	 * Reference of [CurrencyExchangeService] to perform the CRUD operations around [CurrencyExchange].
	 */
	@Autowired
	private lateinit var service: CurrencyExchangeService

	/*------------------------------------------------ Public Methods ------------------------------------------------*/

	/**
	 * GET Mapping to provide the value of Currency Exchange.
	 * TODO : Remove this dummy value return once actual currency conversion is implemented.
	 *
	 * @param from [String] denoting the ID of currency from which conversion is to take place.
	 * @param to [String] denoting the ID of currency to which conversion should be computed.
	 * @return New instance of [CurrencyExchange].
	 */
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	fun retrieveExchangeValue(
		@PathVariable from: String,
		@PathVariable to: String
	): CurrencyExchange = CurrencyExchange(
		1000L,
		from,
		to,
		BigDecimal.ZERO,
		environment.getProperty("local.server.port") ?: "-1"
	)

}
