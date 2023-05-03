package com.Achmad.PBO.Pertemuan4.Unguided2;

import java.awt.*;

public class WarungMakanan extends Menu {
    private String namaWarung;
    private String alamatWarung;
    private String noTelp;

    public WarungMakanan(String namaWarung, String alamatWarung, String noTelp) {
        this.namaWarung = namaWarung;
        this.alamatWarung = alamatWarung;
        this.noTelp = noTelp;
    }

    public String getNamaWarung() {
        return namaWarung;
    }

    public void setNamaWarung(String namaWarung) {
        this.namaWarung = namaWarung;
    }

    public String getAlamatWarung() {
        return alamatWarung;
    }

    public void setAlamatWarung(String alamatWarung) {
        this.alamatWarung = alamatWarung;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public void detailWarung() {
        System.out.println("Nama Warung: " + namaWarung);
        System.out.println("Alamat Warung: " + alamatWarung);
        System.out.println("No. Telp Warung: " + noTelp);
    }
    private String getNamaMakanan(int noMakanan) {
        return null;
    }

    private void kurangiStock(int noMakanan, int jumlahPembelian) {
    }

    private int getHarga(int noMakanan) {
        return 0;
    }
    private int cekStock(int noMakanan) {
        return 0;
    }

    private int getNoMakanan(int i) {
        return 0;
    }

    public void beliMakanan(int noMakanan, int jumlahPembelian) {
        if (jumlahPembelian <= cekStock(noMakanan)) {
            int harga = getHarga(noMakanan);
            int totalHarga = harga * jumlahPembelian;
            kurangiStock(noMakanan, jumlahPembelian);
            System.out.println("Anda telah membeli " + jumlahPembelian + " " + getNamaMakanan(noMakanan));
            System.out.println("Total harga: Rp" + totalHarga);
        } else {
            System.out.println("Maaf, stok makanan tidak cukup!");
        }
        System.out.println("Stok saat ini: " + cekStock(noMakanan));
    }

    public void cekStockMakanan() {
        System.out.println("Stok Makanan:");
        for (int i = 1; i <= 3; i++) {
            System.out.println(getNoMakanan(i) + ". " + getNamaMakanan(i) + ": " + cekStock(i));
        }
    }
}
