package com.mycompany.sistempeminjamanperalatanmahasiswa.model;

public class Pendukung extends Peralatan {

    private String jenisPenggunaan;

    public Pendukung(String kodePeralatan, String namaPeralatan, String kondisi, String status, String jenisPenggunaan) {
        super(kodePeralatan, namaPeralatan, kondisi, status);
        this.jenisPenggunaan = jenisPenggunaan;
    }

    public String getJenisPenggunaan() {
        return jenisPenggunaan;
    }

    public void setJenisPenggunaan(String jenisPenggunaan) {
        this.jenisPenggunaan = jenisPenggunaan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis    : " + jenisPenggunaan);
    }
}