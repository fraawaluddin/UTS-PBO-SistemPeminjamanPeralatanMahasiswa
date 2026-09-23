package com.mycompany.sistempeminjamanperalatanmahasiswa.model;

public class Laptop extends Elektronik {

    private String sistemOperasi;

    public Laptop(String kodePeralatan, String namaPeralatan, String kondisi, String status, int dayaListrik, String sistemOperasi) {
        super(kodePeralatan, namaPeralatan, kondisi, status, dayaListrik);
        this.sistemOperasi = sistemOperasi;
    }

    public String getSistemOperasi() {
        return sistemOperasi;
    }

    public void setSistemOperasi(String sistemOperasi) {
        this.sistemOperasi = sistemOperasi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("OS       : " + sistemOperasi);
    }
}