plugins {
	java
	id("org.springframework.boot") version "3.3.3"
	id("io.spring.dependency-management") version "1.1.6"
}

group = "com.travelwink"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation ("org.springframework.boot:spring-boot-starter-web")

//	implementation ("org.opensearch.client:spring-data-opensearch-starter:1.5.1")
	implementation("org.opensearch.client:spring-data-opensearch-starter:1.5.1") {
		exclude ("org.opensearch.client", "opensearch-rest-high-level-client")
	}
	implementation("org.opensearch.client:opensearch-java:2.13.0")

//	implementation "software.amazon.awssdk:elasticsearch:2.27.12"
	implementation("software.amazon.awssdk:opensearch:2.27.14")
	implementation("software.amazon.awssdk:apache-client:2.27.14")
	implementation("org.apache.httpcomponents.client5:httpclient5:5.2.1")

	compileOnly("org.projectlombok:lombok")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	developmentOnly("org.springframework.boot:spring-boot-docker-compose")

	annotationProcessor("org.projectlombok:lombok")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
