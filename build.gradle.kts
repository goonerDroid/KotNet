plugins {
    // trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    id("com.android.application").version("8.1.0").apply(false)
    kotlin("plugin.serialization").version("1.9.20").apply(false)
}
