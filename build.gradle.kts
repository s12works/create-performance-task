plugins {
    `java-library`
    id("org.jetbrains.kotlin.jvm") version "1.9.20"
    id("org.jetbrains.dokka") version "1.8.10"
}

allprojects {
    repositories {
        mavenCentral()
    }

    apply {
        plugin("org.jetbrains.kotlin.jvm")
        plugin("java")
        plugin("org.jetbrains.dokka")
    }

    dependencies {
        implementation(kotlin("stdlib"))
        testImplementation(kotlin("test"))
    }
}

tasks.dokkaHtmlMultiModule {
    outputDirectory.set(buildDir.resolve("documentation"))
}

tasks.test {
    useJUnitPlatform()
}
