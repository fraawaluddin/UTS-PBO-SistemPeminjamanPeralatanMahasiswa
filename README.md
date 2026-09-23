# Sistem Peminjaman Peralatan Mahasiswa

## Identitas

- Nama: Muhammad Farel Awaluddin
- NIM: 2509116055

## Deskripsi

Sistem Peminjaman Peralatan Mahasiswa merupakan aplikasi berbasis console yang dibuat untuk mengelola peralatan yang dapat dipinjam oleh mahasiswa.

Program ini memiliki beberapa fitur, seperti melihat daftar peralatan, meminjam peralatan, mengembalikan peralatan, dan menambahkan peralatan baru.

## Studi Kasus

Studi kasus yang digunakan adalah peminjaman peralatan mahasiswa.

Peralatan dalam program ini dibagi menjadi dua jenis:

1. Elektronik
2. Pendukung

Contoh peralatan elektronik yang digunakan adalah proyektor dan laptop. Sedangkan untuk peralatan pendukung contohnya adalah tripod dan kabel.

Setiap peralatan memiliki kode, nama, kondisi, dan status. Selain itu, setiap jenis peralatan memiliki atribut tambahan masing-masing.

## Struktur Class

Program ini memiliki tiga class utama, yaitu `Peralatan`, `Elektronik`, dan `Pendukung`.

Class `Peralatan` menyimpan data umum seperti kode, nama, kondisi, dan status. Class `Elektronik` dan `Pendukung` merupakan turunan dari class `Peralatan`.

Class `Elektronik` memiliki atribut tambahan berupa `dayaListrik`, sedangkan class `Pendukung` memiliki atribut `jenisPenggunaan`.

## Inheritance

Inheritance digunakan pada class `Elektronik` dan `Pendukung` yang merupakan turunan dari class `Peralatan`.

Pada class `Elektronik`, atribut yang ditambahkan adalah `dayaListrik`. Sedangkan pada class `Pendukung`, atribut yang ditambahkan adalah `jenisPenggunaan`.

Dengan inheritance, kedua class tersebut tetap dapat menggunakan data dan method yang ada pada class `Peralatan`.

## Encapsulation

Encapsulation diterapkan dengan menggunakan access modifier `private` pada atribut yang ada di dalam class.

Contohnya pada class `Peralatan`, atribut seperti `kodePeralatan`, `namaPeralatan`, `kondisi`, dan `status` dibuat `private`.

Untuk mengakses atribut tersebut, program menggunakan getter dan setter yang sudah disediakan di dalam class.

## Fitur Program

Program memiliki beberapa menu yang dapat digunakan untuk mengelola peralatan.

### 1. Lihat Daftar Peralatan

Menu ini digunakan untuk melihat semua peralatan yang tersedia di dalam program. Informasi yang ditampilkan meliputi kode, nama, kondisi, status, dan atribut tambahan sesuai jenis peralatan.

### 2. Pinjam Peralatan

Menu ini digunakan untuk meminjam peralatan berdasarkan kode peralatan. Jika peralatan masih tersedia, statusnya akan berubah menjadi `Dipinjam`.

### 3. Kembalikan Peralatan

Menu ini digunakan untuk mengembalikan peralatan yang sedang dipinjam. Jika status peralatan adalah `Dipinjam`, statusnya akan berubah kembali menjadi `Tersedia`.

### 4. Keluar

Menu ini digunakan untuk mengakhiri program.

### 5. Tambah Peralatan

Menu ini digunakan untuk menambahkan peralatan baru. Pengguna dapat memilih jenis peralatan, yaitu `Elektronik` atau `Pendukung`, kemudian memasukkan data peralatan.

## Collection

Program menggunakan `ArrayList` untuk menyimpan daftar peralatan.

```java
ArrayList<Peralatan> daftarPeralatan = new ArrayList<>();
```

Dengan `ArrayList`, peralatan yang baru ditambahkan dapat langsung dimasukkan ke dalam daftar tanpa menentukan jumlah data dari awal.

## Screenshot Program

Berikut adalah screenshot saat program dijalankan.

