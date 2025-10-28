import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.22"
    kotlin("plugin.spring") version "1.9.22" apply false  // Kotlin + Spring 지원
    kotlin("plugin.jpa") version "1.9.22" apply false
    id("org.springframework.boot") version "3.3.2" apply false // Spring Boot 플러그인
    id("io.spring.dependency-management") version "1.1.3" apply false // 의존성 관리
}

repositories {
    mavenCentral()
}

subprojects {
    afterEvaluate {
        tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
            kotlinOptions {
                freeCompilerArgs = listOf("-Xjsr305=strict")
                jvmTarget = "17"
            }
        }
    }

    repositories {
        mavenCentral()
    }

    apply {
        plugin("kotlin")
        plugin("kotlin-spring")
        plugin("org.jetbrains.kotlin.plugin.jpa")
        plugin("org.springframework.boot")
        plugin("io.spring.dependency-management")

    }

    group = "org.develop"
    version = "1.0-SNAPSHOT"

    java {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    dependencies {
        implementation(kotlin("stdlib"))
        implementation("org.springframework.boot:spring-boot-starter-web")
        implementation("org.springframework.boot:spring-boot-starter-data-jpa")
        // Kotlin 지원
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
        implementation("org.jetbrains.kotlin:kotlin-reflect")

        // 테스트
        testImplementation("org.springframework.boot:spring-boot-starter-test")

    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "17"
        }
    }
    tasks.withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }
    //
    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(17))
        }
    }


    tasks.test {
        useJUnitPlatform()
    }

}


