plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

compileJava.options.encoding = "UTF-8"
compileTestJava.options.encoding = "UTF-8"


repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.22.0")
    testImplementation("io.github.bonigarcia:webdrivermanager:5.9.1")
}

tasks.test {
    useJUnitPlatform()
}