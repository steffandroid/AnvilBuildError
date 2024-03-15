plugins {
    alias(libs.plugins.jetbrainsKotlinJvm)
    alias(libs.plugins.anvil)
}

dependencies {
    implementation(project(":scope"))
    api(project(":lib-core"))
}
