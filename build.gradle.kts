plugins {
    kotlin("jvm") version "2.1.0"
    // Plugins
}

repositories {
    mavenCentral()
    // Repositories
}

dependencies {
    // Dependencies
}

testing {
    suites {
        // Configure the built-in test suite
        val test by getting(JvmTestSuite::class) {
            // Use Kotlin Test test framework
            useKotlinTest("2.1.0")
        }
    }
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(23)
    }
}
