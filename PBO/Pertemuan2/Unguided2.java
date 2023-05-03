package com.Achmad.PBO.Pertemuan2;

import java.util.Scanner;

public class Unguided2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan menu pilihan program studi
        System.out.print("Masukan nama anda : ");
        String Nama = input.nextLine();
        System.out.print("Masukan umur anda : ");
        int Umur = input.nextInt();
        System.out.println("Pilih Program Studi:");
        System.out.println("1. Teknik Informatika");
        System.out.println("2. Sistem Informasi");
        System.out.println("3. Rekayasa perangkat Lunak");

        // Meminta pengguna untuk memilih program studi
        System.out.print("Masukkan pilihan Anda (1/2/3): ");
        int pilihan = input.nextInt();

        // Meminta pengguna untuk memasukkan nama dan umur
        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine(); // membaca input newline setelah input integer sebelumnya
        nama = input.nextLine(); // membaca input string

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        // Memeriksa apakah pengguna telah memasukkan nama lengkap
        if (nama.isEmpty()) {
            System.out.println("Error: Nama tidak boleh kosong!");
        }
        // Memeriksa apakah pengguna memiliki umur minimal 17 tahun
        else if (umur < 17) {
            System.out.println("Error: Umur anda belum cukup!");
        }
        // Jika pengguna telah memasukkan nama lengkap dan memiliki umur minimal 17 tahun, maka menampilkan informasi pendaftaran
        else {
            String programStudi;
            if (pilihan == 1) {
                programStudi = "Teknik Informatika";
            } else if (pilihan == 2) {
                programStudi = "Sistem Informasi";
            } else if (pilihan == 3) {
                programStudi = "Rekayasa Perangkat Lunak";
            } else {
                System.out.println("Error: Pilihan program studi tidak tersedia.");
                return;
            }

            System.out.println("== Data Pendaftaran ==");
            System.out.println("Nama: " + nama);
            System.out.println("Umur: " + umur + " tahun");
            System.out.println("Program Studi: " + programStudi);
        }
    }
}