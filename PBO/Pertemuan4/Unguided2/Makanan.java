package com.Achmad.PBO.Pertemuan4.Unguided2;

public class Makanan {
    private int noMakanan;
    private String namaMakanan;
    private int harga;
    private int stock;

    public Makanan(int noMakanan, String namaMakanan, int harga, int stock) {
        this.noMakanan = noMakanan;
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.stock = stock;
    }

    public int getNoMakanan() {
        return noMakanan;
    }

    public void setNoMakanan(int noMakanan) {
        this.noMakanan = noMakanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void detailMakanan() {
        System.out.println(noMakanan + " | " + namaMakanan + " | " + harga + " | " + stock);
    }

    public int totalHarga(int jumlah) {
        return harga * jumlah;
    }
}
