package com.in28minutes.microservices.currencyexchange.service

import com.in28minutes.microservices.currencyexchange.bean.CurrencyExchange

import com.in28minutes.microservices.currencyexchange.exception.CurrencyExchangeNotFoundException

import com.in28minutes.microservices.currencyexchange.repository.CurrencyExchangeRepository

import org.springframework.beans.factory.annotation.Autowired

import org.springframework.stereotype.Component

/**
 * Class abstracting out the logic pertaining to [CurrencyExchange].
 */
@Component
class CurrencyExchangeService {

	/*-------------------------------------------------- Components --------------------------------------------------*/

	/**
	 * Reference of [CurrencyExchangeRepository] to perform CRUD Operations under [CurrencyExchange].
	 */
	@Autowired
	private lateinit var repository: CurrencyExchangeRepository

	/*------------------------------------------------ Public Methods ------------------------------------------------*/

	/**
	 * Finds a specific [CurrencyExchange] whose [from] and [to] matches.
	 *
	 * @param from [String] denoting the ID of currency from which conversion is to take place.
	 * @param to [String] denoting the ID of currency to which conversion should be computed.
	 * @return An instance of [CurrencyExchange] matching [from] and [to].
	 * @throws CurrencyExchangeNotFoundException This exception is thrown when an [CurrencyExchange] matching [from]
	 * and [to] is not found.
	 */
	@kotlin.jvm.Throws(CurrencyExchangeNotFoundException::class)
	fun findByFromAndTo(from: String, to: String): CurrencyExchange =
		repository.findByFromAndTo(from, to)
			?: throw CurrencyExchangeNotFoundException("Currency Exchange From: $from -> To: $to : NOT FOUND")

}
