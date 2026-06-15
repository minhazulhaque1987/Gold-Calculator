plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
    
    // প্লাগইনটি এখানে অ্যাপ্লাই করুন
    id("com.google.firebase.appdistribution")
}

android {
    // আপনার আগের কনফিগারেশন (compileSdk, bouldTypes ইত্যাদি) এখানে থাকবে
    
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        
        // অ্যাপ ডিস্ট্রিবিউশন সাধারণত টেস্ট বা ডিবাগ বিল্ডের জন্য ব্যবহার করা ভালো
        getByName("debug") {
            firebaseAppDistribution {
                // ইচ্ছা করলে এখান থেকেই টেস্টারদের গ্রুপ বা ইমেইল সেট করে দেওয়া যায়
                artifactType = "APK"
                testers = "tester1@gmail.com, tester2@gmail.com"
            }
        }
    }
}

dependencies {
    // Firebase BoM (Bill of Materials) ব্যবহার করা সবচেয়ে নিরাপদ
    implementation(platform("com.google.firebase:firebase-bom:33.1.0"))
    
    // প্রধান ফায়ারবেস লাইব্রেরি
    implementation("com.google.firebase:firebase-analytics")
    
    // App Distribution SDK যোগ করুন
    implementation("com.google.firebase:firebase-appdistribution")
}