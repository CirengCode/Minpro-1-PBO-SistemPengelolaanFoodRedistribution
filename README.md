# Program Food Redistribution System 🥗

Program ini dibuat untuk membantu koordinator komunitas/lembaga dalam mengelola proses food redistribution, mulai dari pencatatan data Donatur, Donasi, Penerima, sampai Penyaluran makanan. Program ini dibuat menggunakan bahasa pemrograman Java dengan menerapkan konsep **Object-Oriented Programming (OOP)** dan sistem **CRUD**. Berikut ini adalah penjelasan mengenai fitur dan alur yang terdapat pada program.

# 1. Main Menu

> Main Menu merupakan tampilan awal yang muncul saat program dijalankan. Pada Main Menu terdapat beberapa pilihan yang digunakan untuk mengelola data dalam sistem Food Redistribution, yaitu Donatur, Donasi, Penerima, dan Penyaluran. Selain itu, terdapat menu Keluar yang digunakan untuk menghentikan program.

[POSISI FOTO MAIN MENU DI SINI]

# 2. Menu Donatur

> Menu Donatur digunakan untuk mengelola data pihak yang memberikan donasi makanan kepada komunitas. Data yang dikelola terdiri dari ID Donatur, Nama Pengelola, Nama Instansi, dan Jenis Instansi. Pada menu ini, pengguna dapat melakukan tiga proses, yaitu Tambah, Update, dan Hapus data. Saat menu Donatur dibuka, data Donatur yang sudah tersimpan akan ditampilkan terlebih dahulu.

[POSISI FOTO MENU DONATUR DI SINI]

# 3. Menu Tambah Donatur

> Menu Tambah Donatur digunakan untuk menambahkan data Donatur baru ke dalam sistem. Pengguna perlu memasukkan ID Donatur, Nama Pengelola, Nama Instansi, dan Jenis Instansi. Setelah itu, program akan mengecek ID Donatur yang dimasukkan. Jika ID tersebut sudah digunakan, data tidak dapat ditambahkan. Jika ID belum digunakan, data Donatur akan berhasil ditambahkan ke dalam daftar.

[POSISI FOTO TAMBAH DONATUR DI SINI]

# 4. Menu Update Donatur

> Menu Update Donatur digunakan untuk mengubah data Donatur yang sudah tersimpan. Pengguna perlu memasukkan ID Donatur yang ingin diubah, kemudian memasukkan data terbaru berupa Nama Pengelola, Nama Instansi, dan Jenis Instansi. Jika ID Donatur ditemukan, data akan diperbarui dengan data terbaru. Namun, jika ID tidak ditemukan, program akan menampilkan pesan bahwa data tersebut tidak tersedia.

[POSISI FOTO UPDATE DONATUR DI SINI]

# 5. Menu Hapus Donatur

> Menu Hapus Donatur digunakan untuk menghapus data Donatur yang sudah tersimpan di dalam daftar. Pengguna hanya perlu memasukkan ID Donatur yang ingin dihapus. Setelah itu, program akan mencari ID tersebut pada daftar data. Jika ID ditemukan, data Donatur akan langsung dihapus. Jika ID tidak ditemukan, program akan menampilkan pesan bahwa data tersebut tidak tersedia.

[POSISI FOTO HAPUS DONATUR DI SINI]

# 6. Menu Donasi

> Menu Donasi digunakan untuk mengelola data makanan yang diberikan oleh Donatur. Data yang dikelola terdiri dari ID Donasi, ID Donatur, Nama Makanan, Jumlah Porsi, dan Status Kelayakan. Status Kelayakan digunakan untuk menunjukkan kondisi donasi dalam proses pengelolaan. Pada menu ini, pengguna dapat melakukan proses Tambah, Update, dan Hapus data Donasi.

[POSISI FOTO MENU DONASI DI SINI]

# 7. Menu Penerima

> Menu Penerima digunakan untuk mengelola data pihak atau lembaga yang menerima makanan dari proses food redistribution. Data yang dikelola terdiri dari ID Penerima, Nama Pengelola, Nama Lembaga, dan Jenis Lembaga. Pada menu ini, pengguna dapat melakukan proses Tambah, Update, dan Hapus data Penerima.

[POSISI FOTO MENU PENERIMA DI SINI]

# 8. Menu Penyaluran

> Menu Penyaluran digunakan untuk mengelola data proses penyaluran donasi makanan kepada pihak Penerima. Data yang dikelola terdiri dari ID Penyaluran, ID Donasi, ID Penerima, Jumlah Porsi, dan Jenis Petugas. Pada menu ini, pengguna dapat melakukan proses Tambah, Update, dan Hapus data Penyaluran.

[POSISI FOTO MENU PENYALURAN DI SINI]

# 9. Alur Program

> Secara keseluruhan, program dimulai dari Main Menu yang menyediakan pilihan untuk mengelola data Donatur, Donasi, Penerima, dan Penyaluran. Setelah pengguna memilih salah satu menu, program akan menampilkan data yang sudah tersimpan. Selanjutnya, pengguna dapat memilih proses Tambah, Update, atau Hapus sesuai dengan kebutuhan.
>
> Setelah proses selesai dilakukan, data akan ditampilkan kembali sehingga pengguna dapat melihat perubahan yang sudah dilakukan. Pengguna dapat memilih menu Keluar untuk kembali ke Main Menu. Jika pengguna memilih menu Keluar pada Main Menu, program akan berhenti.

[POSISI FOTO ALUR PROGRAM DI SINI]

# 10. Kondisi Lainnya

> Selain proses CRUD, program juga memiliki validasi sederhana. Pada saat pengguna menambahkan data, program akan mengecek ID yang dimasukkan untuk memastikan ID tersebut belum digunakan. Jika pengguna memasukkan ID yang sudah digunakan, program akan menampilkan pesan bahwa ID tersebut sudah dipakai.

[POSISI FOTO ID SUDAH DIGUNAKAN DI SINI]

> Pada proses Update dan Hapus, program juga akan mengecek ID yang dimasukkan. Jika pengguna memasukkan ID yang tidak terdapat dalam daftar, program akan menampilkan pesan bahwa ID tersebut tidak tersedia.

[POSISI FOTO ID TIDAK DITEMUKAN DI SINI]
