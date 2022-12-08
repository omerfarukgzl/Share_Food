package com.example.yemekpaylasma

class Notes {

    /*


-----------------------------    FireBase  ---------------------------------------

    1) FireBase sitesinden bir proje oluşturulur ve bu projeyle android proje birbirine bağlanır.
    2) Uygulama packet name girilir ve indirilen download-service.json doysası uygulamada app klasoru içine koyulur.( gorunumu proje gorunumune gec)
    3) build gradle larda ilgiili bağımlılıklar eklenir


-- (<project>/build.gradle)
        buildscript {
      repositories {
        // Make sure that you have the following two repositories
        google()  // Google's Maven repository

        mavenCentral()  // Maven Central repository

      }
      dependencies {
        ...
        // Add the dependency for the Google services Gradle plugin
        classpath 'com.google.gms:google-services:4.3.13'

      }
    }

    allprojects {
      ...
      repositories {
        // Make sure that you have the following two repositories
        google()  // Google's Maven repository

        mavenCentral()  // Maven Central repository

      }
    }

-- (<project>/<app-module>/build.gradle):
        plugins {
      id 'com.android.application'

      // Add the Google services Gradle plugin
      id 'com.google.gms.google-services'

      ...
    }

    dependencies {
      // Import the Firebase BoM
      implementation platform('com.google.firebase:firebase-bom:31.1.0')

      // When using the BoM, don't specify versions in Firebase dependencies
      // https://firebase.google.com/docs/android/setup#available-libraries
    }



-----------------------------    FireBase  ---------------------------------------








000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000


 */




}