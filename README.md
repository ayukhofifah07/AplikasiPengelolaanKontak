# AplikasiPengelolaanKontak

## Identitas
Nama: Ayu Atut Khofifah

NPM: 2210010553

## Penjelasan Program

### 1. Deskripsi Program
Aplikasi ini memiliki fungsi utama untuk menyimpan, mengedit, dan menghapus data kontak, serta mengelompokkan kontak berdasarkan kategori seperti keluarga, teman, atau kerja. Pengguna bisa dengan mudah menambah kontak baru, melakukan perubahan, dan menghapus data yang tidak diperlukan. Selain itu, data kontak dapat dipisahkan dalam kategori menggunakan **JComboBox**, sehingga memudahkan pengelolaan berdasarkan hubungan atau jenis kontak.

### 2. Komponen GUI
Antarmuka pengguna dibuat menggunakan beberapa komponen dari **Java Swing**, di antaranya:
- **JFrame**: Komponen utama untuk menampilkan jendela aplikasi.
- **JPanel**: Panel yang digunakan untuk mengatur layout komponen GUI.
- **JLabel**: Label untuk menampilkan teks statis pada GUI, seperti nama kolom.
- **JTextField**: Komponen input untuk memasukkan nama atau nomor telepon.
- **JButton**: Tombol untuk melakukan tindakan seperti menambah, mengedit, dan menghapus kontak.
- **JList dan JComboBox**: Komponen untuk menampilkan daftar kategori kontak.
- **JTable**: Tabel untuk menampilkan data kontak secara terstruktur.
- **JScrollPane**: Digunakan untuk menambahkan scroll bar agar tabel dapat di-scroll jika ada banyak data.

### 3. Logika Program
Aplikasi ini menggunakan database **SQLite** untuk menyimpan data kontak. Aplikasi mendukung operasi dasar **CRUD (Create, Read, Update, Delete)** untuk memanipulasi data kontak. Pengguna dapat menambah data baru, melihat daftar kontak, memperbarui informasi kontak, dan menghapus kontak yang tidak lagi diperlukan.

### 4. Events
Untuk menangani interaksi pengguna, aplikasi menggunakan:
- **ActionListener** untuk menghubungkan tombol dengan aksi seperti Tambah, Edit, Hapus, dan Cari Kontak.
- **ItemListener** digunakan untuk merespon perubahan pilihan pada JComboBox, sehingga tampilan kontak dapat disesuaikan dengan kategori yang dipilih.

### 5. Variasi
Beberapa fitur tambahan yang membuat aplikasi ini lebih fungsional antara lain:
- Fitur pencarian kontak berdasarkan nama atau nomor telepon, dan hasilnya ditampilkan pada JTable.
- Validasi input nomor telepon untuk memastikan hanya angka yang dimasukkan dengan panjang yang sesuai.
- Fitur ekspor dan impor data kontak dari/ke file **CSV**, sehingga memudahkan backup atau pemulihan data.

## Keunggulan Program

### 1. **Mudah Dipakai**
Aplikasi ini simpel dan gampang dipahami, bahkan buat orang yang nggak terlalu ngerti teknologi. Kamu bisa tambah, edit, hapus, dan cari kontak dengan cepat tanpa ribet.

### 2. **Kontak Bisa Dikelompokkan**
Ada fitur buat ngelompokkin kontak berdasarkan kategori seperti keluarga, teman, atau kerja. Jadi, kalau lagi nyari kontak tertentu, tinggal pilih kategorinya, deh. Lebih praktis dan rapi!

### 3. **CRUD Lengkap**
Aplikasi ini bisa tambah, lihat, edit, dan hapus kontak (CRUD). Jadi, kontak kamu selalu bisa di-update sesuai kebutuhan, dan nggak ada kontak yang basi atau nggak terpakai lagi.

### 4. **Input Nggak Sembarangan**
Nomor telepon yang dimasukkin pasti dicek dulu biar bener, cuma bisa masukin angka dan panjangnya juga harus sesuai. Jadi nggak ada deh nomor yang salah masuk atau typo.

### 5. **Cari Kontak Cepat**
Kamu bisa nyari kontak berdasarkan nama atau nomor telepon dengan cepat. Hasilnya langsung muncul di tabel, jadi gampang banget kalau butuh kontak tertentu dalam waktu singkat.

### 6. **Ekspor dan Impor Data Kontak**
Aplikasi ini juga bisa ekspor dan impor data kontak ke format **CSV**. Jadi kalau mau backup data atau pindahin ke aplikasi lain, gampang banget. Nggak perlu input ulang satu-satu.

### 7. **Pakai SQLite, Ringan Banget**
Karena aplikasi ini pakai database **SQLite**, kamu nggak perlu install database tambahan. Aplikasinya jadi ringan, nggak makan banyak memori, dan tetap jalan lancar.

### 8. **Kinerja Cepat**
Meskipun kamu punya banyak data kontak, aplikasi ini tetap berjalan cepat. Penggunaannya nggak lemot, jadi enak dipakai buat sehari-hari.

### 9. **Fleksibel dan Mudah Dikembangkan**
Kalau di masa depan mau ada fitur tambahan atau pengembangan lain, gampang banget. Struktur aplikasi ini jelas dan bisa diubah sesuai keperluan.

### 10. **Bisa Jalan di Mana Saja**
Aplikasi ini dibangun pakai **Java**, jadi bisa dipakai di berbagai sistem operasi, kayak Windows, Mac, atau Linux. Plus, SQLite nggak butuh lisensi berbayar, jadi kamu bisa pakai tanpa harus keluar biaya tambahan.

Intinya, aplikasi pengelolaan kontak ini simple, praktis, dan memudahkan banget buat ngatur kontak sehari-hari!

## Ini dia Screenshot Programnya

**1.** ![ss an AplikasiPengelolaanKontak](https://github.com/user-attachments/assets/70349259-c24a-4892-ac73-33938c75fcec)


**2.** ![ss an AplikasiPengelolaanKontak2](https://github.com/user-attachments/assets/46322305-3034-4570-80e3-7b394c7d2fc4)


**3.** ![ss an AplikasiPengelolaanKontak3](https://github.com/user-attachments/assets/23b3d2d3-1ecc-4e56-8e8c-085499449fd3)



 
