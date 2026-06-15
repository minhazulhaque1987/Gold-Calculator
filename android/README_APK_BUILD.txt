Gold Calculator → APK (Android Studio/Capacitor) build

This folder is a helper for keeping all required build-ready files together.

Recommended build:
1) Open e:/Apps Project/bbsplatform/android in Android Studio
2) Ensure you sync/persist web assets:
   cd e:/Apps Project/bbsplatform
   npm run build:apk:debug   (or build:apk:release)

Why bbsplatform:
- bbsplatform is already a Capacitor + Android Gradle project.
- The APK bundles web assets from bbsplatform/www.

To use Gold Calculator web UI inside APK:
- Replace/merge bbsplatform/www/index.html with an integrated Gold Calculator view (route) OR replace it fully.

This README only documents the existing build pipeline; content is implemented by modifying bbsplatform/www/index.html.
