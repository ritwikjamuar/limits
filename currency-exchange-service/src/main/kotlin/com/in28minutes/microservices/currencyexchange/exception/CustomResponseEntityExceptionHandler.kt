package com.in28minutes.microservices.currencyexchange.exception

import com.in28minutes.microservices.currencyexchange.bean.ExceptionResponse

import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.MethodArgumentNotValidException

import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

import org.springframework.web.context.request.WebRequest

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

import java.util.*

/**
 * [ResponseEntityExceptionHandler] to handle Custom Exceptions thrown by this microservice.
 */
@Suppress("unused")
@ControllerAdvice
class CustomResponseEntityExceptionHandler : ResponseEntityExceptionHandler() {

	/*----------------------------------- ResponseEntityExceptionHandler Callbacks -----------------------------------*/

	override fun handleMethodArgumentNotValid(
		ex: MethodArgumentNotValidException,
		headers: HttpHeaders,
		status: HttpStatus,
		request: WebRequest
	): ResponseEntity<Any> =
		ResponseEntity(
			ExceptionResponse(
				Date(),
				ex.message ?: "Something went wrong",
				request.getDescription(false)
			),
			HttpStatus.BAD_REQUEST
		)

	/*------------------------------------------------ Public Methods ------------------------------------------------*/

	/**
	 * Handles General Purpose [Exception] and tagging HTTP Status [HttpStatus.INTERNAL_SERVER_ERROR].
	 */
	@ExceptionHandler(
		value = [
			Exception::class
		]
	)
	final fun handleAllExceptions(exception: Exception, request: WebRequest): ResponseEntity<ExceptionResponse> =
		ResponseEntity(
			ExceptionResponse(
				Date(),
				exception.message ?: "Something went wrong",
				request.getDescription(false)
			),
			HttpStatus.INTERNAL_SERVER_ERROR
		)

	/**
	 * Handles specific exceptions that was caused as some sort of Content Not Found
	 * and tagging HTTP Status [HttpStatus.NOT_FOUND].
	 */
	@ExceptionHandler(
		value = [
			CurrencyExchangeNotFoundException::class
		]
	)
	final fun handleContentNotFoundExceptions(
		exception: Exception,
		request: WebRequest
	): ResponseEntity<ExceptionResponse> =
		ResponseEntity(
			ExceptionResponse(
				Date(),
				exception.message ?: "Something went wrong",
				request.getDescription(false)
			),
			HttpStatus.NOT_FOUND
		)

}
