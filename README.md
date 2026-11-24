# Classora — Personal Academic OS

Classora is a personal school organizer with a neon HUD interface. It runs as an installable PWA and has an Android WebView wrapper.

## Included modules
- Dashboard and weekly timetable
- Subjects and teacher/room details
- Assignments with due dates, priority and completion status
- Exams and school events
- Grade records and percentage average
- Personal attendance log
- Study notes
- Academic calendar and progress overview
- Profile and academic-year settings
- Add, edit, delete and complete records
- JSON backup and restore
- Offline app-shell caching for the PWA
- Android APK build workflow

## Run as a PWA
Open the GitHub Pages site over HTTPS, then use your browser's install/add-to-home-screen option. The app shell is cached for offline reopening after the first successful load.

## Data and privacy
Records are stored locally on the current browser or Android WebView using localStorage. There is no account, cloud sync or server database. PWA and APK data stores are separate. Export a JSON backup regularly; clearing app/browser storage can erase local records.

## Android APK
The Android WebView wrapper is in `android/`. A debug APK is built by GitHub Actions when app or Android source files change on `development`. Open the repository's Actions tab, select the latest successful **Build Classora APK** run, and download the `Classora-debug-apk` artifact. This is a debug build, not a Play Store release.

## Known limitations
- Data remains on one device; there is no cloud sync.
- Notifications are not implemented.
- Data is stored in localStorage rather than IndexedDB.
- No automated browser interaction suite is included yet.
- Test the app on your own device and keep a backup before clearing browser/app data.

## Branches
Development work is kept on `development`; `main` remains untouched.
