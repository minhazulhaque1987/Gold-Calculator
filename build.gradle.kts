apply(from = "android/variables.gradle")

plugins {
    // আগের প্লাগইনগুলো থাকবে...
    id("com.google.gms.google-services") version "4.4.4" apply false
    
    // অ্যাপ ডিস্ট্রিবিউশন প্লাগইন যোগ করুন
    id("com.google.firebase.appdistribution") version "5.2.1" apply false
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false
}