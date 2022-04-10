package com.in28minutes.microservices.limitsservice.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

import org.springframework.context.annotation.Configuration

/**
 * [Configuration] Class to access the custom fields defined in `application.properties`.
 */
@ConstructorBinding
@ConfigurationProperties(prefix = "limits-service")
data class AppConfiguration(
	val minimum: String,
	val maximum: String
) {

	/*----------------------------------------------- Property Fields ------------------------------------------------*/

	/**
	 * [Int] denoting the minimum limit.
	 */
	val minimumValue: Int
		get() = try {
			minimum.toInt()
		} catch (e: java.lang.NumberFormatException) {
			1
		}

	/**
	 * [Int] denoting the maximum limit.
	 */
	val maximumValue: Int
		get() = try {
			maximum.toInt()
		} catch (e: java.lang.NumberFormatException) {
			1000
		}

}
