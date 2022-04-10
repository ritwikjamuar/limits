package com.in28minutes.microservices.currencyexchange.bean

import org.hibernate.Hibernate

import java.math.BigDecimal
import javax.persistence.Column

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Data Representation of a Currency Exchange.
 *
 * @param id [Long] denoting the ID for specific currency exchange.
 * @param from [String] denoting the ID of currency from which conversion is to take place.
 * @param to [String] denoting the ID of currency to which conversion should be computed.
 * @param conversionMultiple [BigDecimal] denoting the conversion rate.
 * @param environment [String] denoting the environment.
 */
@Entity
data class CurrencyExchange(

	@field: Id
	@field: GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Long,

	@field: Column(name = "currency_from")
	val from: String,

	@field: Column(name = "currency_to")
	val to: String,

	@field: Column(name = "conversion_multiple")
	val conversionMultiple: BigDecimal,

	val environment: String

) {

	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
		other as CurrencyExchange
		return id == other.id
	}

	override fun hashCode(): Int = javaClass.hashCode()

	override fun toString(): String =
		"${this::class.simpleName} (id=$id, from=$from, to=$to, conversionMultiple=$conversionMultiple, environment=$environment)"

}
