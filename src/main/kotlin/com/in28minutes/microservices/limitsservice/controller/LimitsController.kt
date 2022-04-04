package com.in28minutes.microservices.limitsservice.controller

import com.in28minutes.microservices.limitsservice.bean.Limits

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * [RestController] for receiving and responding all the HTTP Methods related to [Limits].
 */
@Suppress("unused")
@RestController
class LimitsController {

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
	fun retrieveLimits(): Limits = Limits(1, 1000)

}
