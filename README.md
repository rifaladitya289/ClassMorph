# Classora — Sistem Belajar Pribadi

Classora adalah aplikasi pengelola kegiatan belajar pribadi dengan antarmuka Neon Cyberpunk. Aplikasi tersedia sebagai PWA dan pembungkus Android WebView.

## Modul saat ini
- Ringkasan kegiatan dan statistik belajar
- Jadwal pelajaran mingguan
- Mata pelajaran dan data guru/ruang
- Tugas, tenggat, prioritas, dan status penyelesaian
- Ujian dan penilaian
- Rekap nilai dan rata-rata
- Catatan kehadiran pribadi
- Catatan belajar
- Kalender dan agenda
- Kuis: pencatatan hasil latihan
- Dompet Koin X: pencatatan pemasukan, pengeluaran, dan saldo
- Jurnal Makan Bergizi
- Ruang RPL: catatan materi dan proyek
- Koleksi kode batang berbasis teks
- Profil, pengaturan akademik, ekspor dan pemulihan cadangan JSON
- Penyimpanan lokal dan dukungan penggunaan luring setelah pemuatan pertama

## Menjalankan PWA
Buka situs GitHub Pages melalui HTTPS. Gunakan menu browser untuk memasang atau menambahkan Classora ke layar utama.

## Data dan privasi
Data disimpan secara lokal pada browser atau aplikasi Android melalui localStorage. Belum ada sinkronisasi awan. Data PWA dan APK terpisah. Ekspor cadangan secara berkala; menghapus data aplikasi/browser dapat menghilangkan catatan.

## APK Android
Pembungkus Android berada di folder `android/`. GitHub Actions membangun APK debug setiap ada perubahan pada sumber aplikasi di cabang `development`. Unduh artefak `Classora-debug-apk` dari proses Build Classora APK terbaru. APK ini merupakan versi debug, bukan rilis Play Store.

## Catatan audit
- Kuis saat ini berupa pencatatan hasil latihan, belum berupa mesin soal interaktif.
- Koleksi kode batang saat ini menyimpan teks/nomor, belum melakukan pemindaian kamera atau membuat gambar barcode.
- Dompet Koin X adalah pencatat transaksi lokal, bukan layanan pembayaran.
- Belum ada login akun, sinkronisasi awan, notifikasi pengingat, atau pengujian otomatis browser menyeluruh.
- Uji langsung pada perangkat Android sebelum mengandalkan data penting.

## Cabang
Pengembangan dilakukan pada `development`. Cabang `main` tidak diubah.
