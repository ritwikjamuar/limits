package com.in28minutes.microservices.currencyexchange.exception

import com.in28minutes.microservices.currencyexchange.bean.CurrencyExchange

/**
 * [RuntimeException] that marks that a [CurrencyExchange] has not been found.
 */
class CurrencyExchangeNotFoundException constructor(override val message: String?) : RuntimeException()
