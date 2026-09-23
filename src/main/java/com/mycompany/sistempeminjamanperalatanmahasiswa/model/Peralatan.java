package com.mycompany.sistempeminjamanperalatanmahasiswa.model;

public class Peralatan {
    
    private String kodePeralatan;
    private String namaPeralatan;
    private String kondisi;
    private String status;
    
    public Peralatan(String kodePeralatan, String namaPeralatan, String kondisi, String status) {
        this.kodePeralatan = kodePeralatan;
        this.namaPeralatan = namaPeralatan;
        this.kondisi = kondisi;
        this.status = status;
    }
    
    public String getKodePeralatan() {
        return kodePeralatan;
    }

    public void setKodePeralatan(String kodePeralatan) {
        this.kodePeralatan = kodePeralatan;
    }

    public String getNamaPeralatan() {
        return namaPeralatan;
    }

    public void setNamaPeralatan(String namaPeralatan) {
        this.namaPeralatan = namaPeralatan;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }  
    
    public void pinjam() {
        if (status.equals("Tersedia")) {
            status = "Dipinjam";
            System.out.println(namaPeralatan + " berhasil dipinjam.");
        } else {
            System.out.println(namaPeralatan + " sedang tidak tersedia.");
        }
    }
    
    public void kembalikan() {
        if (status.equals("Dipinjam")) {
            status = "Tersedia";
            System.out.println(namaPeralatan + " berhasil dikembalikan.");
        } else {
           System.out.println(namaPeralatan + " belum sedang dipinjam.");
        }
    }
    public void tampilkanInfo() {
        System.out.println("Kode     : " + kodePeralatan);
        System.out.println("Nama     : " + namaPeralatan);
        System.out.println("Kondisi  : " + kondisi);
        System.out.println("Status   : " + status);
    }
}

