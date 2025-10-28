package test.develop.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TravelProjectKotlinApplication

fun main(args: Array<String>) {
    runApplication<TravelProjectKotlinApplication>(*args)
}
