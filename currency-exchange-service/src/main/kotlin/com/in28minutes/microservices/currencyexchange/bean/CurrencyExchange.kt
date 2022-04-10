package com.in28minutes.microservices.currencyexchange.bean

import java.math.BigDecimal

/**
 * Data Representation of a Currency Exchange.
 *
 * @param id [Long] denoting the ID for specific currency exchange.
 * @param from [String] denoting the ID of currency from which conversion is to take place.
 * @param to [String] denoting the ID of currency to which conversion should be computed.
 * @param conversionMultiple [BigDecimal] denoting the conversion rate.
 * @param environment [String] denoting the environment.
 */
data class CurrencyExchange(
	val id: Long,
	val from: String,
	val to: String,
	val conversionMultiple: BigDecimal,
	val environment: String
)
