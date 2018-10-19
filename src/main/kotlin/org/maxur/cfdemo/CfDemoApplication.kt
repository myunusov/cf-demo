package org.maxur.cfdemo

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigServer
class CfDemoApplication {

    private val log = LoggerFactory.getLogger(javaClass)

    @Value("\${configuration.projectName}")
    fun setProjectName(projectName: String) {
        log.info("Project: $projectName")
    }

}

fun main(args: Array<String>) {
    runApplication<CfDemoApplication>(*args)
}
