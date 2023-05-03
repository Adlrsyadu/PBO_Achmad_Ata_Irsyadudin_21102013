package com.Achmad.PBO.Pertemuan2;

import java.util.Scanner; //

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// variable

        System.out.print("Masukan nama anda : "); //print(tdk ada baris kosong dibwhnya, println(baris kosong setelahnya)
        String nama = scanner.nextLine(); //nextline : untuk membaca tipe data string

        System.out.println("Selamat pagi " + nama);
    }
}
