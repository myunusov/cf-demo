package org.maxur.cfdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigServer
class CfDemoApplication

fun main(args: Array<String>) {
    runApplication<CfDemoApplication>(*args)
}
