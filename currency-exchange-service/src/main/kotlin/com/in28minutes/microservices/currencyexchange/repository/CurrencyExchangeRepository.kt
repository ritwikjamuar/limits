package com.in28minutes.microservices.currencyexchange.repository

import com.in28minutes.microservices.currencyexchange.bean.CurrencyExchange

import org.springframework.data.jpa.repository.JpaRepository

/**
 * [JpaRepository] of [CurrencyExchange] wth [Long] ID.
 */
interface CurrencyExchangeRepository : JpaRepository<CurrencyExchange, Long> {

	/**
	 * Finds a specific [CurrencyExchange] whose [from] and [to] matches.
	 *
	 * @param from [String] denoting the ID of currency from which conversion is to take place.
	 * @param to [String] denoting the ID of currency to which conversion should be computed.
	 * @return If found, then an instance of [CurrencyExchange], otherwise `null`.
	 */
	fun findByFromAndTo(from: String, to: String): CurrencyExchange?

}
