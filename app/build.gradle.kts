plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.zd3_1_zakharov"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.example.zd3_1_zakharov"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation("androidx.leanback:leanback:1.2.0")
    implementation("androidx.appcompat:appcompat:1.8.0")
    implementation("androidx.media2:media2-widget:1.3.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.2")
    implementation(libs.androidx.activity.ktx)

    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}