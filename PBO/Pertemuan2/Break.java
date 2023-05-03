package com.Achmad.PBO.Pertemuan2;

public class Break {
    public static void main(String[] args) {
        int p = 0; //variable p dengan sign nilai 0
        while (p <= 100){
            System.out.println("Perulangan ke- "+ p); //p 0 + 10 setiap perulangan
            if (p == 50){
                System.out.println("Capek broo !");
                break; //untuk menghentikan perulangannya
            }
            p += 10; //iterasi setiap lipatan 10
        }

    }
}
