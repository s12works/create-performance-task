import org.jetbrains.dokka.DokkaConfiguration.Visibility as DokkaVisibility

plugins {
    application
}

dependencies {
    implementation(project(":base-util"))
    implementation(project(":object-repr"))
    implementation(project(":range-util"))
    implementation(project(":graphics"))
    implementation(project(":input"))
}

tasks.withType<org.jetbrains.dokka.gradle.DokkaTaskPartial>().configureEach {
    dokkaSourceSets.configureEach {
        reportUndocumented.set(true)
        sourceRoots.from(file("./src/main"))
        documentedVisibilities.set(setOf<DokkaVisibility>(
            DokkaVisibility.PUBLIC,
            DokkaVisibility.PROTECTED,
            DokkaVisibility.PRIVATE,
            DokkaVisibility.INTERNAL
        ))
    }
}

application {
    mainClass = "com.s12works.imageRandomizer.app.MainKt"
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}
