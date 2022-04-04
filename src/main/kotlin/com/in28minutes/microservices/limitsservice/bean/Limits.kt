package com.in28minutes.microservices.limitsservice.bean

/**
 * Data Representation of a Limit.
 *
 * @param minimum [Int] denotes the minimum value.
 * @param maximum [Int] denotes the maximum value.
 */
data class Limits(
	val minimum: Int,
	val maximum: Int
)
