import org.jetbrains.dokka.DokkaConfiguration.Visibility as DokkaVisibility

dependencies {
    implementation(project(":base-util"))
    implementation(project(":object-repr"))
    implementation(project(":range-util"))
    implementation(project(":assertion"))
}

tasks.withType<org.jetbrains.dokka.gradle.DokkaTaskPartial>().configureEach {
    dokkaSourceSets.configureEach {
        reportUndocumented.set(false)
        sourceRoots.from(file("./src/main"))
        documentedVisibilities.set(setOf<DokkaVisibility>(
            DokkaVisibility.PUBLIC,
            DokkaVisibility.PROTECTED,
            DokkaVisibility.PRIVATE,
            DokkaVisibility.INTERNAL
        ))
    }
}
