package com.nexterdigitals.installationservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class InstallationServiceApplication

fun main(args: Array<String>) {
    runApplication<InstallationServiceApplication>(*args)
}
