# Program Food Redistribution System 🥗

Program ini dibuat untuk membantu koordinator komunitas/lembaga dalam mengelola proses food redistribution, mulai dari pencatatan data Donatur, Donasi, Penerima, sampai Penyaluran makanan. Program ini dibuat menggunakan bahasa pemrograman Java dengan menerapkan konsep **Object-Oriented Programming (OOP)** dan sistem **CRUD**. Berikut ini adalah penjelasan mengenai fitur dan alur yang terdapat pada program.

# 1. Main Menu

> Main Menu merupakan tampilan awal yang muncul saat program dijalankan. Pada Main Menu terdapat beberapa pilihan yang digunakan untuk mengelola data dalam sistem Food Redistribution, yaitu Donatur, Donasi, Penerima, dan Penyaluran. Selain itu, terdapat menu Keluar yang digunakan untuk menghentikan program.
<img width="538" height="413" alt="image" src="https://github.com/user-attachments/assets/b70df649-6034-4025-8738-1a79e855d548" />

# 2. Menu Donatur

> Menu Donatur digunakan untuk mengelola data pihak yang memberikan donasi makanan kepada komunitas. Data yang dikelola terdiri dari ID Donatur, Nama Pengelola, Nama Instansi, dan Jenis Instansi. Pada menu ini, pengguna dapat melakukan tiga proses, yaitu Tambah, Update, dan Hapus data. Saat menu Donatur dibuka, data Donatur yang sudah tersimpan akan ditampilkan terlebih dahulu.
<img width="478" height="642" alt="image" src="https://github.com/user-attachments/assets/ca168cfc-d79e-4630-ab61-91bcc36a585e" />

# 3. Menu Tambah Donatur

> Menu Tambah Donatur digunakan untuk menambahkan data Donatur baru ke dalam sistem. Pengguna perlu memasukkan ID Donatur, Nama Pengelola, Nama Instansi, dan Jenis Instansi. Setelah itu, program akan mengecek ID Donatur yang dimasukkan. Jika ID tersebut sudah digunakan, data tidak dapat ditambahkan. Jika ID belum digunakan, data Donatur akan berhasil ditambahkan ke dalam daftar.
<img width="306" height="623" alt="image" src="https://github.com/user-attachments/assets/dd1a16b9-5b05-4f23-85d7-9d276c2f8c88" />

# 4. Menu Update Donatur

> Menu Update Donatur digunakan untuk mengubah data Donatur yang sudah tersimpan. Pengguna perlu memasukkan ID Donatur yang ingin diubah, kemudian memasukkan data terbaru berupa Nama Pengelola, Nama Instansi, dan Jenis Instansi. Jika ID Donatur ditemukan, data akan diperbarui dengan data terbaru. Namun, jika ID tidak ditemukan, program akan menampilkan pesan bahwa data tersebut tidak tersedia.
<img width="311" height="718" alt="image" src="https://github.com/user-attachments/assets/38c6594d-894c-498e-a040-ee65811ab195" />

# 5. Menu Hapus Donatur

> Menu Hapus Donatur digunakan untuk menghapus data Donatur yang sudah tersimpan di dalam daftar. Pengguna hanya perlu memasukkan ID Donatur yang ingin dihapus. Setelah itu, program akan mencari ID tersebut pada daftar data. Jika ID ditemukan, data Donatur akan langsung dihapus. Jika ID tidak ditemukan, program akan menampilkan pesan bahwa data tersebut tidak tersedia.
<img width="312" height="662" alt="image" src="https://github.com/user-attachments/assets/5a5805d1-5961-490a-a44f-c254bf67cf66" />

# 6. Menu Donasi

> Menu Donasi digunakan untuk mengelola data makanan yang diberikan oleh Donatur. Data yang dikelola terdiri dari ID Donasi, ID Donatur, Nama Makanan, Jumlah Porsi, dan Status Kelayakan. Status Kelayakan digunakan untuk menunjukkan kondisi donasi dalam proses pengelolaan. Pada menu ini, pengguna dapat melakukan proses Tambah, Update, dan Hapus data Donasi.
<img width="322" height="523" alt="image" src="https://github.com/user-attachments/assets/8dc3ae00-3964-40ed-8ae2-057633f6dcb6" />

# 7. Menu Penerima

> Menu Penerima digunakan untuk mengelola data pihak atau lembaga yang menerima makanan dari proses food redistribution. Data yang dikelola terdiri dari ID Penerima, Nama Pengelola, Nama Lembaga, dan Jenis Lembaga. Pada menu ini, pengguna dapat melakukan proses Tambah, Update, dan Hapus data Penerima.
<img width="330" height="525" alt="image" src="https://github.com/user-attachments/assets/6d6c7272-c521-459e-b68b-b7f1c08faf54" />

# 8. Menu Penyaluran

> Menu Penyaluran digunakan untuk mengelola data proses penyaluran donasi makanan kepada pihak Penerima. Data yang dikelola terdiri dari ID Penyaluran, ID Donasi, ID Penerima, Jumlah Porsi, dan Jenis Petugas. Pada menu ini, pengguna dapat melakukan proses Tambah, Update, dan Hapus data Penyaluran.
<img width="332" height="526" alt="image" src="https://github.com/user-attachments/assets/bb378b83-71fa-43be-bd9d-038e316c9d7a" />

# 9. Alur Program

> Secara keseluruhan, program dimulai dari Main Menu yang menyediakan pilihan untuk mengelola data Donatur, Donasi, Penerima, dan Penyaluran. Setelah pengguna memilih salah satu menu, program akan menampilkan data yang sudah tersimpan. Selanjutnya, pengguna dapat memilih proses Tambah, Update, atau Hapus sesuai dengan kebutuhan.
>
> Setelah proses selesai dilakukan, data akan ditampilkan kembali sehingga pengguna dapat melihat perubahan yang sudah dilakukan. Pengguna dapat memilih menu Keluar untuk kembali ke Main Menu. Jika pengguna memilih menu Keluar pada Main Menu, program akan berhenti.

# 10. Kondisi Lainnya

> Selain proses CRUD, program juga memiliki validasi sederhana. Pada saat pengguna menambahkan data, program akan mengecek ID yang dimasukkan untuk memastikan ID tersebut belum digunakan. Jika pengguna memasukkan ID yang sudah digunakan, program akan menampilkan pesan bahwa ID tersebut sudah dipakai.
<img width="306" height="527" alt="image" src="https://github.com/user-attachments/assets/4fbc57e8-0019-4efd-a2d7-76ccadb97c3d" />

> Pada proses Update dan Hapus, program juga akan mengecek ID yang dimasukkan. Jika pengguna memasukkan ID yang tidak terdapat dalam daftar, program akan menampilkan pesan bahwa ID tersebut tidak tersedia.
<img width="307" height="522" alt="image" src="https://github.com/user-attachments/assets/a137f02b-3e53-4a87-ac02-be4bb51bff50" />

