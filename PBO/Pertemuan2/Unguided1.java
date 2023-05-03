package com.Achmad.PBO.Pertemuan2;

import java.util.Scanner;

public class Unguided1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // meminta pengguna untuk memasukan batas bilangan
        System.out.println("Achmad Ata");
        System.out.println("21102013");
        System.out.print("Masukan batas bilangan :");
        int batas = input.nextInt();

        // menampilkan bilangan genap antara 0 dan batas
        for (int i = 0; i <= batas; i++){
            if (i % 2 == 0){
                System.out.println("Bilangan genap : "+i);
            }
        }
    }
}
