package com.in28minutes.microservices.currencyexchange.repository

import com.in28minutes.microservices.currencyexchange.bean.CurrencyExchange

import org.springframework.data.jpa.repository.JpaRepository

/**
 * [JpaRepository] of [CurrencyExchange] wth [Long] ID.
 */
interface CurrencyExchangeRepository : JpaRepository<CurrencyExchange, Long>
