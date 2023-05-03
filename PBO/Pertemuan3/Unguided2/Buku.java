package com.Achmad.PBO.Pertemuan3.Unguided2;

public class Buku {
    private int noBuku;
    private String judulBuku;
    private String pengarang;
    private int tahunTerbit;
    private int harga;

    public Buku(int noBuku, String judulBuku, String pengarang, int tahunTerbit, int harga) {
        this.noBuku = noBuku;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
    }

    public int getNoBuku() {
        return noBuku;
    }

    public void setNoBuku(int noBuku) {
        this.noBuku = noBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void tampilDetailBuku() {
        System.out.println("No. Buku\t: " + noBuku);
        System.out.println("Judul Buku\t: " + judulBuku);
        System.out.println("Pengarang\t: " + pengarang);
        System.out.println("Tahun Terbit\t: " + tahunTerbit);
        System.out.println("Harga\t\t: " + harga);
        System.out.println();
    }
}

