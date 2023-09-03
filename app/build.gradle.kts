plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    buildFeatures{
        viewBinding = true
        dataBinding = true
    }
    namespace = "com.curso.android.app.practica.app_proyectofinal"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.curso.android.app.practica.app_proyectofinal"
        minSdk = 21
        targetSdk = 33
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    val lifecycle_version = "2.6.1"
    val activity_version = "1.7.2"

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
    // Activity
    implementation("androidx.activity:activity-ktx:$activity_version")

    //runBlockingTest, CoroutineDispatcher etc.
    testImplementation ("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3")
    //InstantTaskExecutorRule
    testImplementation ("androidx.arch.core:core-testing:2.1.0")
    // Optional -- Mockk framework
    testImplementation ("io.mockk:mockk:1.12.2")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}

/*
    implementation "androidx.fragment:fragment-ktx:1.5.4"
    implementation "androidx.activity:activity-ktx:1.6.1"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1"
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:2.5.1"

    implementation 'androidx.core:core-ktx:1.9.0'
    implementation 'androidx.appcompat:appcompat:1.5.1'
    implementation 'com.google.android.material:material:1.7.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'

    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.1'


    testImplementation 'junit:junit:4.13.2'
    //runBlockingTest, CoroutineDispatcher etc.
    testImplementation "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.1"
    //InstantTaskExecutorRule
    testImplementation "androidx.arch.core:core-testing:2.1.0"
    androidTestImplementation 'com.android.support.test:rules:1.0.2'
    androidTestImplementation 'com.android.support.test:runner:1.0.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation "androidx.arch.core:core-testing:2.1.0"
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
*/