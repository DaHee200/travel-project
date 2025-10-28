import org.springframework.boot.gradle.tasks.bundling.BootJar
import java.time.LocalDateTime
import java.util.*


val jar: Jar by tasks
val bootJar: BootJar by tasks
bootJar.enabled = false
jar.enabled = true

dependencies {
    implementation(project(":gateway"))
    implementation(project(":domain"))
    implementation(project(":common"))
}