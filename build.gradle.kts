plugins {
    java
    application
}

repositories {
    mavenCentral()
    maven { url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/") }
}

group = "org.example"
description = "tai-e-template"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

application {
    mainClass.set("org.example.MyMain")
}

val taieVersion = "0.2.2" // or the latest version "0.5.1-SNAPSHOT"

dependencies {
    implementation("net.pascal-lab:tai-e:$taieVersion")
}
