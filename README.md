# Classora — Personal Academic OS

A personal, offline-first school organizer with a sci-fi / neon HUD interface.

## Current features
- Dashboard with today's timetable, pending tasks, upcoming events and grade average
- Personal subjects library
- Weekly timetable
- Assignments with due dates, priority and completion status
- Exams and school events
- Grade records with score validation and average calculation
- Personal attendance log
- Study notes
- Academic calendar
- Progress overview
- Profile and academic-year settings
- JSON backup and restore
- PWA manifest and service worker for offline shell caching

## Run locally
Open `index.html` in a local web server. For PWA installation and service-worker support, serve over HTTPS (GitHub Pages works) or localhost.

## Data & privacy
Classora stores records in browser localStorage on the current device. There is no account, cloud sync, or server database. PWA and Android WebView storage are separate. Export JSON backups regularly.

## Android APK
The web app is designed to be wrapped in an Android WebView. APK packaging is a separate build step and is not included in this first web foundation.

## Roadmap
- IndexedDB migration
- Timetable day/time conflict detection
- Editing existing records
- Local notification scheduling
- More detailed grade weighting and semester reports
- Android WebView wrapper and APK build workflow
- Automated browser tests

## Branches
Work is maintained in `development`; `main` remains untouched until release approval.
