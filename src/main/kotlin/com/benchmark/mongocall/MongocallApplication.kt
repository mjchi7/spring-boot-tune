package com.benchmark.mongocall

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MongocallApplication

fun main(args: Array<String>) {
	runApplication<MongocallApplication>(*args)
}
