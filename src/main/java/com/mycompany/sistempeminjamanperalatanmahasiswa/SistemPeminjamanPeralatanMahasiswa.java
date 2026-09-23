package com.mycompany.sistempeminjamanperalatanmahasiswa;

import com.mycompany.sistempeminjamanperalatanmahasiswa.model.Elektronik;
import com.mycompany.sistempeminjamanperalatanmahasiswa.model.Laptop;
import com.mycompany.sistempeminjamanperalatanmahasiswa.model.Pendukung;
import com.mycompany.sistempeminjamanperalatanmahasiswa.model.Peralatan;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemPeminjamanPeralatanMahasiswa {

    public static void main(String[] args) {

        Elektronik proyektor = new Elektronik(
            "P001",
            "Proyektor",
            "Baik",
            "Tersedia",
            300
        );

        Pendukung tripod = new Pendukung(
            "P002",
            "Tripod",
            "Baik",
            "Tersedia",
            "Dokumentasi"
        );

        Laptop laptop = new Laptop(
            "P003",
            "Laptop",
            "Baik",
            "Tersedia",
            65,
            "Windows"
        );

        ArrayList<Peralatan> daftarPeralatan = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        daftarPeralatan.add(proyektor);
        daftarPeralatan.add(tripod);
        daftarPeralatan.add(laptop);

        int pilihan;

        do {
            System.out.println();
            System.out.println("========================================");
            System.out.println(" SISTEM PEMINJAMAN PERALATAN MAHASISWA");
            System.out.println("========================================");
            System.out.println("1. Lihat Daftar Peralatan");
            System.out.println("2. Pinjam Peralatan");
            System.out.println("3. Kembalikan Peralatan");
            System.out.println("4. Keluar");
            System.out.println("5. Tambah Peralatan");
            System.out.println("========================================");
            System.out.print("Pilih menu: ");

            if (input.hasNextInt()) {
                pilihan = input.nextInt();
            } else {
                System.out.println("Input harus berupa angka.");
                input.next();
                pilihan = 0;
            }

            switch (pilihan) {

                case 1:
                    for (Peralatan peralatan : daftarPeralatan) {
                        peralatan.tampilkanInfo();
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Masukkan kode peralatan: ");
                    String kodePinjam = input.next();

                    boolean ditemukanPinjam = false;

                    for (Peralatan peralatan : daftarPeralatan) {
                        if (peralatan.getKodePeralatan().equalsIgnoreCase(kodePinjam)) {
                            peralatan.pinjam();
                            ditemukanPinjam = true;
                            break;
                        }
                    }

                    if (!ditemukanPinjam) {
                        System.out.println("Peralatan tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan kode peralatan: ");
                    String kodeKembali = input.next();

                    boolean ditemukanKembali = false;

                    for (Peralatan peralatan : daftarPeralatan) {
                        if (peralatan.getKodePeralatan().equalsIgnoreCase(kodeKembali)) {
                            peralatan.kembalikan();
                            ditemukanKembali = true;
                            break;
                        }
                    }

                    if (!ditemukanKembali) {
                        System.out.println("Peralatan tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                case 5:
                    System.out.println();
                    System.out.println("=== TAMBAH PERALATAN ===");
                    System.out.println("1. Elektronik");
                    System.out.println("2. Pendukung");
                    System.out.println("3. Laptop");
                    System.out.print("Pilih jenis: ");

                    int jenis = input.nextInt();

                    System.out.print("Kode peralatan: ");
                    String kodeBaru = input.next();

                    System.out.print("Nama peralatan: ");
                    String namaBaru = input.next();

                    System.out.print("Kondisi: ");
                    String kondisiBaru = input.next();

                    if (jenis == 1) {

                        System.out.print("Daya listrik (Watt): ");
                        int dayaBaru = input.nextInt();

                        Elektronik elektronikBaru = new Elektronik(
                            kodeBaru,
                            namaBaru,
                            kondisiBaru,
                            "Tersedia",
                            dayaBaru
                        );

                        daftarPeralatan.add(elektronikBaru);

                        System.out.println("Peralatan elektronik berhasil ditambahkan.");

                    } else if (jenis == 2) {

                        System.out.print("Jenis penggunaan: ");
                        String jenisPenggunaanBaru = input.next();

                        Pendukung pendukungBaru = new Pendukung(
                            kodeBaru,
                            namaBaru,
                            kondisiBaru,
                            "Tersedia",
                            jenisPenggunaanBaru
                        );

                        daftarPeralatan.add(pendukungBaru);

                        System.out.println("Peralatan pendukung berhasil ditambahkan.");

                    } else if (jenis == 3) {

                        System.out.print("Daya listrik (Watt): ");
                        int dayaLaptop = input.nextInt();

                        System.out.print("Sistem operasi: ");
                        String sistemOperasiBaru = input.next();

                        Laptop laptopBaru = new Laptop(
                            kodeBaru,
                            namaBaru,
                            kondisiBaru,
                            "Tersedia",
                            dayaLaptop,
                            sistemOperasiBaru
                        );

                        daftarPeralatan.add(laptopBaru);

                        System.out.println("Laptop berhasil ditambahkan.");

                    } else {
                        System.out.println("Jenis peralatan tidak tersedia.");
                    }

                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 4);
    }
}