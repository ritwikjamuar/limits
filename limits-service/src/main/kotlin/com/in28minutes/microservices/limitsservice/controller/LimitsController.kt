package com.in28minutes.microservices.limitsservice.controller

import com.in28minutes.microservices.limitsservice.bean.Limits

import com.in28minutes.microservices.limitsservice.configuration.AppConfiguration

import org.springframework.beans.factory.annotation.Autowired

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * [RestController] for receiving and responding all the HTTP Methods related to [Limits].
 */
@Suppress("unused")
@RestController
class LimitsController {

	/*-------------------------------------------------- Components --------------------------------------------------*/

	/**
	 * Reference of [AppConfiguration] to access the custom fields defined in `application.properties`.
	 */
	@Autowired
	lateinit var configuration: AppConfiguration

	/*------------------------------------------------ Public Methods ------------------------------------------------*/

	/**
	 * GET Mapping to provide the static value of [Limits].
	 *
	 * @return New instance of [Limits].
	 */
	@GetMapping(
		path = [
			"/limits"
		]
	)
	fun retrieveLimits(): Limits = Limits(configuration.minimumValue, configuration.maximumValue)

}
