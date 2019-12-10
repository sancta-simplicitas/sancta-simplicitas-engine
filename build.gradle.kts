plugins {
    java
    scala
    application
    id("org.openjfx.javafxplugin") version "0.0.8"
    id("org.beryx.jlink") version "2.12.0"
}

group = "com.github.sancta-simplicitas-engine"
version = "0.0.1.190808_alpha_a"

application {
    mainClassName = "com.github.sancta-simplicitas.engine.App"
}

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

javafx {
    version = "13.0.1"
    modules = mutableListOf("javafx.controls")
}

jlink {
    launcher {
        name = "hellofx"
    }
}

dependencies {
    implementation("org.scala-lang:scala-library:2.13.1")
    implementation("com.google.code.gson:gson:2.8.5")
    implementation("org.openjfx", "javafx-controls", "13.0.1")
    implementation("org.openjfx", "javafx-media", "13.0.1")
    implementation("junit","junit","4.12")
}

tasks {
    compileScala
}