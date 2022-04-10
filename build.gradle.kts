import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.6.6"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.6.10"
	kotlin("plugin.spring") version "1.6.10"
}

allprojects {

	apply(plugin = "org.jetbrains.kotlin.jvm")
	apply(plugin = "org.springframework.boot")
	apply(plugin = "org.jetbrains.kotlin.plugin.spring")
	apply(plugin = "io.spring.dependency-management")

	group = "com.in28minutes.microservices"
	version = "0.0.1-SNAPSHOT"
	java.sourceCompatibility = JavaVersion.VERSION_17

}

subprojects {

	extra["springCloudVersion"] = "2021.0.1"

	dependencyManagement {
		imports {
			mavenBom(
				"org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}"
			)
		}
	}

	repositories {
        mavenCentral()
    }

}

repositories {
	mavenCentral()
}

tasks {

	withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs = listOf("-Xjsr305=strict")
			jvmTarget = "17"
		}
	}

	withType<Test> {
		useJUnitPlatform()
	}

}
