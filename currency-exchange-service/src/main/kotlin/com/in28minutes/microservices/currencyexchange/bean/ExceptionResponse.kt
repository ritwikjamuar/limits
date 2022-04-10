package com.in28minutes.microservices.currencyexchange.bean

import java.util.Date

/**
 * Data Class as a representation of an Error thrown by the microservice.
 *
 * @param timeStamp [Date] denoting the time at which the Error was logged.
 * @param message [String] denoting the message of the Error.
 * @param details [String] denoting the extra details that can throw some light on the cause of error.
 */
data class ExceptionResponse(
	val timeStamp: Date,
	val message: String,
	val details: String
)
