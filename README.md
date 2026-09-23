# Sistem Peminjaman Peralatan Mahasiswa

## Identitas

- Nama: Muhammad Farel Awaluddin
- NIM: 2509116055

## Tentang Program

Program ini merupakan aplikasi sederhana berbasis console untuk mengelola peminjaman peralatan yang dapat digunakan oleh mahasiswa.

Program dibuat menggunakan bahasa Java dengan menerapkan konsep Pemrograman Berorientasi Objek (PBO), seperti class, object, constructor, encapsulation, inheritance, dan collection.

## Studi Kasus

Studi kasus yang digunakan adalah Sistem Peminjaman Peralatan Mahasiswa.

Beberapa peralatan yang terdapat dalam program antara lain:

- Proyektor
- Tripod
- Laptop
- Peralatan pendukung lainnya

Setiap peralatan memiliki kode, nama, kondisi, dan status. Status peralatan dapat berubah ketika peralatan dipinjam atau dikembalikan.

## Struktur Class

Program memiliki class utama sebagai berikut:

```text
Peralatan
├── Elektronik
│   └── Laptop
└── Pendukung
```

`Peralatan` merupakan class induk yang menyimpan data umum dari setiap peralatan.

`Elektronik` dan `Pendukung` merupakan turunan dari `Peralatan`.

Kemudian class `Laptop` merupakan turunan dari `Elektronik` dan memiliki atribut tambahan berupa sistem operasi.

## Inheritance

Inheritance digunakan untuk membuat hubungan antarclass berdasarkan jenis peralatan.

Class `Elektronik` dan `Pendukung` mewarisi atribut dan method dari class `Peralatan`.

Kemudian class `Laptop` mewarisi class `Elektronik`.

Contohnya:

```java
public class Elektronik extends Peralatan
```

dan:

```java
public class Laptop extends Elektronik
```

Dengan inheritance tersebut, class turunan dapat menggunakan atribut dan method yang berasal dari class induknya serta dapat memiliki atribut tambahan sesuai kebutuhannya.

## Constructor

Constructor digunakan untuk memberikan nilai awal pada object ketika object tersebut dibuat.

Pada program ini, constructor digunakan pada class `Peralatan` dan class turunannya seperti `Elektronik`, `Pendukung`, dan `Laptop`.

Contohnya pada saat membuat object `Laptop`:

```java
Laptop laptop = new Laptop(
    "P003",
    "Laptop",
    "Baik",
    "Tersedia",
    65,
    "Windows"
);
```

Data yang diberikan saat object dibuat akan diterima oleh constructor `Laptop`. Constructor tersebut kemudian menggunakan `super()` untuk meneruskan data yang dimiliki oleh class induknya.

Dengan menggunakan constructor, setiap object dapat langsung memiliki nilai awal seperti kode peralatan, nama peralatan, kondisi, status, daya listrik, dan sistem operasi ketika object dibuat.

## Polymorphism

Polymorphism diterapkan melalui penggunaan method overriding pada method `tampilkanInfo()`.

Class `Elektronik`, `Pendukung`, dan `Laptop` memiliki method `tampilkanInfo()` yang merupakan pengembangan dari method pada class induknya.

Contohnya pada class turunan:

```java
@Override
public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("OS       : " + sistemOperasi);
}
```
Object dari class `Elektronik`, `Pendukung`, dan `Laptop` dapat disimpan ke dalam `ArrayList<Peralatan>` karena ketiga class tersebut merupakan turunan dari `Peralatan`.

Ketika method `tampilkanInfo()` dipanggil melalui object yang disimpan dalam `ArrayList`, Java akan menjalankan method sesuai dengan class object tersebut. Dengan demikian, method yang sama dapat menghasilkan informasi yang berbeda sesuai dengan jenis object yang digunakan.

## Condition

Percabangan `if-else` digunakan untuk menentukan proses berdasarkan kondisi tertentu dalam program.

Salah satu penggunaannya terdapat pada menu tambah peralatan. Program memeriksa pilihan jenis peralatan yang dimasukkan pengguna untuk menentukan object yang akan dibuat.

Contohnya:

```java
if (jenis == 1) {
    // membuat object Elektronik
} else if (jenis == 2) {
    // membuat object Pendukung
} else if (jenis == 3) {
    // membuat object Laptop
} else {
    // jenis tidak tersedia
}
```

## Looping

Perulangan digunakan untuk menjalankan proses yang dilakukan berulang kali selama program berjalan.

Program menggunakan `do-while` untuk menampilkan menu utama secara berulang. Menu akan terus ditampilkan sampai pengguna memilih menu `4. Keluar`.

Selain itu, `for` digunakan untuk melakukan pencarian dan menampilkan data peralatan yang terdapat di dalam `ArrayList`.

Contohnya:

```java
for (Peralatan peralatan : daftarPeralatan) {
    peralatan.tampilkanInfo();
}
```

## Encapsulation

Encapsulation diterapkan dengan membuat atribut pada class menggunakan access modifier `private`.

Atribut tersebut kemudian diakses menggunakan method getter dan setter.

Contohnya pada class `Peralatan`:

```java
private String kodePeralatan;
private String namaPeralatan;
private String kondisi;
private String status;
```

## Fitur Program

Program memiliki beberapa menu utama:

### 1. Lihat Daftar Peralatan

Menampilkan seluruh peralatan yang terdapat di dalam sistem beserta informasi masing-masing peralatan.

### 2. Pinjam Peralatan

Digunakan untuk meminjam peralatan berdasarkan kode. Jika peralatan tersedia, status akan berubah menjadi `Dipinjam`.

### 3. Kembalikan Peralatan

Digunakan untuk mengembalikan peralatan yang sedang dipinjam sehingga statusnya kembali menjadi `Tersedia`.

### 4. Keluar

Digunakan untuk mengakhiri program.

### 5. Tambah Peralatan

Digunakan untuk menambahkan peralatan baru ke dalam sistem.

Pengguna dapat memilih jenis peralatan yang ingin ditambahkan, termasuk elektronik, pendukung, atau laptop.

## Program Flow

Alur program dimulai ketika pengguna menjalankan aplikasi dan sistem menampilkan menu utama.

Pengguna dapat memilih beberapa menu yang tersedia, yaitu:

1. Melihat daftar peralatan.
2. Meminjam peralatan berdasarkan kode peralatan.
3. Mengembalikan peralatan berdasarkan kode peralatan.
4. Keluar dari program.
5. Menambahkan peralatan baru.

Jika pengguna memilih menu peminjaman atau pengembalian, sistem akan mencari peralatan berdasarkan kode yang dimasukkan.

Jika kode ditemukan, sistem akan menjalankan proses sesuai pilihan pengguna. Jika kode tidak ditemukan, sistem akan menampilkan pesan bahwa peralatan tidak ditemukan.

Pada menu tambah peralatan, pengguna dapat memilih jenis peralatan yang ingin ditambahkan, yaitu Elektronik, Pendukung, atau Laptop. Data yang dimasukkan kemudian dibuat menjadi object dan disimpan ke dalam `ArrayList`.

Program akan terus menampilkan menu utama selama pengguna belum memilih menu keluar.

## Collection

Program menggunakan `ArrayList` untuk menyimpan daftar peralatan.

```java
ArrayList<Peralatan> daftarPeralatan = new ArrayList<>();
```

Dengan menggunakan `ArrayList`, peralatan dapat ditambahkan ke dalam daftar selama program berjalan.

## Screenshot Program

### Tampilan Daftar Peralatan

Pada tampilan ini, program menampilkan seluruh peralatan yang tersimpan di dalam sistem. Setiap peralatan memiliki informasi berupa kode peralatan, nama peralatan, kondisi, dan status.

Selain informasi umum tersebut, masing-masing jenis peralatan juga memiliki informasi tambahan. Pada peralatan elektronik ditampilkan daya listrik, sedangkan pada peralatan pendukung ditampilkan jenis penggunaan. Untuk objek `Laptop`, selain daya listrik juga ditampilkan sistem operasi.

Data pada daftar berasal dari beberapa object dengan jenis class yang berbeda, yaitu `Elektronik`, `Pendukung`, dan `Laptop`. Semua object tersebut disimpan dalam satu `ArrayList<Peralatan>` sehingga dapat diproses melalui referensi dari class induknya.

Ketika method `tampilkanInfo()` dipanggil, setiap object akan menjalankan implementasi method sesuai dengan class masing-masing. Hal ini menunjukkan penggunaan method overriding dan polymorphism dalam program.

<img width="306" height="437" alt="image" src="https://github.com/user-attachments/assets/275a474a-593b-4c54-949a-3c6e9aa2e80a" />

### Proses Peminjaman

Pada tampilan ini, pengguna memilih menu `2. Pinjam Peralatan` untuk melakukan proses peminjaman.

Program meminta pengguna memasukkan kode peralatan yang ingin dipinjam. Setelah kode dimasukkan, program melakukan perulangan untuk mencari object yang memiliki kode sesuai dengan input pengguna.

Jika kode peralatan ditemukan, program akan menjalankan method `pinjam()` pada object tersebut. Sebelum mengubah status, program akan memeriksa kondisi status peralatan menggunakan percabangan `if`.

Jika peralatan memiliki status `Tersedia`, maka status akan berubah menjadi `Dipinjam` dan program menampilkan pesan bahwa peralatan berhasil dipinjam. Jika peralatan tidak tersedia atau kode tidak ditemukan, program akan memberikan pesan yang sesuai.

Screenshot berikut menunjukkan proses ketika laptop dengan kode tertentu berhasil dipinjam dan status peralatan berubah dari `Tersedia` menjadi `Dipinjam`.

<img width="293" height="642" alt="image" src="https://github.com/user-attachments/assets/9e3c35a9-d8f7-430a-8d45-bd812fef60be" />

### Proses Pengembalian

Pada tampilan ini, pengguna memilih menu `3. Kembalikan Peralatan` untuk mengembalikan peralatan yang sebelumnya telah dipinjam.

Program meminta kode peralatan yang akan dikembalikan. Setelah kode dimasukkan, program melakukan perulangan untuk mencari peralatan berdasarkan kode tersebut.

Jika peralatan ditemukan, method `kembalikan()` akan dijalankan. Program kemudian memeriksa status peralatan menggunakan percabangan untuk memastikan proses pengembalian dapat dilakukan.

Setelah proses berhasil, status peralatan yang sebelumnya `Dipinjam` akan berubah kembali menjadi `Tersedia`. Dengan demikian, peralatan tersebut dapat dipinjam kembali oleh pengguna.

Screenshot berikut menunjukkan proses pengembalian laptop setelah sebelumnya dilakukan peminjaman.

<img width="306" height="631" alt="image" src="https://github.com/user-attachments/assets/74850f7d-a7a7-4ff0-98bf-bdd19901f2e3" />

### Keluar dari Program

Pada tampilan ini, pengguna memilih menu `4. Keluar` untuk mengakhiri penggunaan program.

Ketika pilihan menu `4` dipilih, program akan menjalankan proses keluar dan menampilkan pesan `Program selesai.`.

Menu keluar juga menjadi kondisi akhir dari perulangan `do-while` yang digunakan pada menu utama. Selama pengguna belum memilih menu `4`, program akan terus menampilkan menu utama. Setelah menu `4` dipilih, kondisi perulangan tidak lagi terpenuhi sehingga program berhenti.

Screenshot berikut menunjukkan tampilan ketika pengguna memilih menu keluar dan program selesai dijalankan.

<img width="523" height="262" alt="image" src="https://github.com/user-attachments/assets/d7263049-97f6-4c93-917e-527d04cbce6b" />

### Menambahkan Peralatan

Pada menu ini, pengguna dapat menambahkan peralatan baru ke dalam sistem. Pengguna terlebih dahulu memilih jenis peralatan yang ingin ditambahkan, kemudian memasukkan data yang diperlukan sesuai dengan jenis peralatan tersebut.

Terdapat tiga jenis peralatan yang dapat ditambahkan, yaitu `Elektronik`, `Pendukung`, dan `Laptop`. Setiap pilihan akan menjalankan proses yang berbeda sesuai dengan class yang digunakan.

Data peralatan yang berhasil dibuat akan dimasukkan ke dalam `ArrayList<Peralatan>`, sehingga object baru dapat langsung tersimpan dan ditampilkan bersama dengan peralatan lainnya selama program masih berjalan.

### Menambahkan Peralatan Elektronik

Pada tampilan ini, pengguna memilih menu `5. Tambah Peralatan`, kemudian memilih jenis `1. Elektronik`.

Program meminta pengguna memasukkan kode peralatan, nama peralatan, kondisi, dan daya listrik. Setelah seluruh data dimasukkan, program membuat object dari class `Elektronik`.

Object tersebut kemudian dimasukkan ke dalam `ArrayList<Peralatan>`, sehingga peralatan yang baru ditambahkan dapat digunakan dan ditampilkan bersama dengan data peralatan lainnya.

Proses ini menggunakan percabangan `if` untuk menentukan bahwa pilihan pengguna adalah jenis Elektronik.

Screenshot berikut menunjukkan proses penambahan peralatan elektronik baru ke dalam sistem.

<img width="307" height="328" alt="image" src="https://github.com/user-attachments/assets/473d8b7c-c5f0-487a-97c3-9666630146e4" />

### Menambahkan Peralatan Pendukung

Pada tampilan ini, pengguna memilih menu `5. Tambah Peralatan`, kemudian memilih jenis `2. Pendukung`.

Program meminta pengguna memasukkan kode peralatan, nama peralatan, kondisi, dan jenis penggunaan. Setelah data dimasukkan, program membuat object dari class `Pendukung`.

Object tersebut kemudian dimasukkan ke dalam `ArrayList<Peralatan>` sehingga dapat disimpan dan ditampilkan bersama dengan peralatan lainnya.

Proses ini menggunakan percabangan `if-else` untuk menentukan object yang dibuat berdasarkan pilihan jenis peralatan dari pengguna.

Screenshot berikut menunjukkan proses penambahan peralatan pendukung baru ke dalam sistem.

<img width="307" height="172" alt="image" src="https://github.com/user-attachments/assets/e1a8c74d-2310-49fc-8582-f1d1df196819" />

### Menambahkan Laptop

Pada tampilan ini, pengguna memilih menu `5. Tambah Peralatan`, kemudian memilih jenis `3. Laptop`.

Program meminta pengguna memasukkan kode peralatan, nama peralatan, kondisi, daya listrik, dan sistem operasi. Setelah seluruh data dimasukkan, program membuat object dari class `Laptop`.

Class `Laptop` merupakan turunan dari class `Elektronik`, sehingga proses ini juga menunjukkan penerapan inheritance bertingkat. Setelah object `Laptop` berhasil dibuat, object tersebut dimasukkan ke dalam `ArrayList<Peralatan>`.

Dengan demikian, laptop yang baru ditambahkan dapat langsung digunakan dan ditampilkan bersama dengan peralatan lainnya. Atribut tambahan berupa sistem operasi juga akan ditampilkan ketika informasi laptop ditampilkan.

Screenshot berikut menunjukkan proses ketika pengguna menambahkan peralatan baru dengan memilih jenis Laptop.

<img width="301" height="353" alt="image" src="https://github.com/user-attachments/assets/9256d0cc-8250-40db-8185-4f8304fec853" />

### Validasi Input

Program memiliki validasi input sederhana untuk memastikan input pengguna sesuai dengan kebutuhan program.

#### Validasi Input Menu

Program mengecek apakah input menu utama berupa angka. Jika pengguna memasukkan input selain angka, program akan menampilkan pesan kesalahan.

<img width="305" height="185" alt="image" src="https://github.com/user-attachments/assets/1926f336-6b8c-4769-b9bb-54222063bad1" />

#### Validasi Jenis Peralatan

Pada menu tambah peralatan, program mengecek apakah jenis peralatan yang dipilih tersedia. Jika pengguna memasukkan pilihan selain 1, 2, atau 3, program akan menampilkan pesan `Jenis peralatan tidak tersedia.`.

<img width="302" height="312" alt="image" src="https://github.com/user-attachments/assets/e66a4edd-5916-4be7-a46f-08bdfe4244bf" />
