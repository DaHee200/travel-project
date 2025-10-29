package test.develop.app.com.example.travel

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.example.travel"])
class TravelProjectKotlinApplication

fun main(args: Array<String>) {
    runApplication<TravelProjectKotlinApplication>(*args)
}
