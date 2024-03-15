plugins {
    alias(libs.plugins.jetbrainsKotlinJvm)
    alias(libs.plugins.anvil)
}

dependencies {
    implementation(project(":scope"))

    implementation(libs.dagger.core)
}
