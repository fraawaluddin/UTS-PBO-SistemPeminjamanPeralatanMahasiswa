package com.mycompany.sistempeminjamanperalatanmahasiswa.model;

public class Elektronik extends Peralatan {

    private int dayaListrik;
    
    public Elektronik(String kodePeralatan, String namaPeralatan, String kondisi, String status, int dayaListrik) {
        super(kodePeralatan, namaPeralatan, kondisi, status);
        this.dayaListrik = dayaListrik;
    }
    
    public int getDayaListrik() {
        return dayaListrik;
    }

    public void setDayaListrik(int dayaListrik) {
        this.dayaListrik = dayaListrik;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Daya     : " + dayaListrik + " Watt");
    }
}

    

