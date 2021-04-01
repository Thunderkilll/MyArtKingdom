# MyArtKingdom
testing read me file to add more content here

using MVVM (Model -> View -> View -> Model)
Build gradel depd:


 // Architectural Components
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1"

    // Room
    implementation "androidx.room:room-runtime:2.2.6"
    kapt "androidx.room:room-compiler:2.2.6"

    // Kotlin Extensions and Coroutines support for Room
    implementation "androidx.room:room-ktx:2.2.6"

    def coroutines_version = "1.3.5"
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines_version"
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines_version"

    // Coroutine Lifecycle Scopes
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1"
    implementation "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1"

    // Retrofit
    implementation 'com.squareup.retrofit2:retrofit:2.6.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.6.0'
    implementation "com.squareup.okhttp3:logging-interceptor:4.5.0"

    // Navigation Components
    implementation "androidx.navigation:navigation-fragment-ktx:2.3.4"
    implementation "androidx.navigation:navigation-ui-ktx:2.3.4"

    // Glide
    implementation 'com.github.bumptech.glide:glide:4.11.0'
    kapt 'com.github.bumptech.glide:compiler:4.11.0'
