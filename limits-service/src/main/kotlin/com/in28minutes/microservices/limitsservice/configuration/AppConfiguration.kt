package com.in28minutes.microservices.limitsservice.configuration

import org.springframework.beans.factory.annotation.Value

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

/**
 * [Configuration] Class to access the custom fields defined in `application.properties`.
 */
@Configuration
@PropertySource("classpath:application.properties")
class AppConfiguration {

	/*----------------------------------------------- Member Variables -----------------------------------------------*/

	@Value("\${limits-service.minimum}")
	private val limitsServiceMinimum: String? = null

	@Value("\${limits-service.maximum}")
	private val limitsServiceMaximum: String? = null

	/*----------------------------------------------- Property Fields ------------------------------------------------*/

	/**
	 * [Int] denoting the minimum limit.
	 */
	val minimum: Int
		get() = limitsServiceMinimum?.toInt() ?: 1

	/**
	 * [Int] denoting the maximum limit.
	 */
	val maximum: Int
		get() = limitsServiceMaximum?.toInt() ?: 1000

}
