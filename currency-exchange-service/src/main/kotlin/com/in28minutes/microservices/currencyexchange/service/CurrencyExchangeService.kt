package com.in28minutes.microservices.currencyexchange.service

import com.in28minutes.microservices.currencyexchange.bean.CurrencyExchange

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

}
