plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)


    id("kotlin-kapt")

}

android {
    namespace = "com.codepath.group26.movie26"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.codepath.group26.movie26"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    
    // RecyclerView for movie lists
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    
    // CardView for movie cards
    implementation("androidx.cardview:cardview:1.0.0")
    
    // Fragment Navigation
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.6")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.6")

    // Retrofit for API calls
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // OkHttp logging for debugging network requests
    implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")

    // Glide for loading movie posters
    implementation("com.github.bumptech.glide:glide:4.15.1")
    kapt("com.github.bumptech.glide:compiler:4.15.1")

    // RecyclerView
    implementation("androidx.recyclerview:recyclerview:1.3.2")

    // ConstraintLayout
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}