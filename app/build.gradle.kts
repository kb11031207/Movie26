plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

val localProperties = rootProject.file("local.properties")
val tmdbApiKey = localProperties.readLines()
    .find { it.startsWith("TMDB_API_KEY") }
    ?.split("=")?.get(1)?.trim()

val tmdbBearerToken = rootProject.file("local.properties")
    .readLines()
    .find { it.startsWith("TMDB_BEARER_TOKEN") }
    ?.split("=")
    ?.get(1)
    ?.trim()
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
        buildConfigField("String", "TMDB_API_KEY", "\"$tmdbApiKey\"")
        buildConfigField("String", "TMDB_BEARER_TOKEN", "\"$tmdbBearerToken\"")
    }


    buildFeatures {
        buildConfig = true
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

    //asyncHttpClient library
    implementation("com.codepath.libraries:asynchttpclient:2.2.0")
    
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}