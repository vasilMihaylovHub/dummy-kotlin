package com.logger.kotlin

import io.github.oshai.kotlinlogging.KotlinLogging
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.lang.invoke.MethodHandles

@SpringBootApplication
class KotlinApplication

private val normalLogger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().canonicalName)
private val kLogger = KotlinLogging.logger {}


fun main(args: Array<String>) {
    runApplication<KotlinApplication>(*args)
    normalLogger.info(" Row number test")
    kLogger.info(" Row number test")// wrong line number and method, I am expecting: "c.l.k.KotlinApplication.main.19 :  Row number test "
}
