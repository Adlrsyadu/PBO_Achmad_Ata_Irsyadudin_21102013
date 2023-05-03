package com.Achmad.PBO.Pertemuan3;

public class Main {
    public static void main(String[] args) {
        // Pembuatan class
        SepedaMotor suzuki = new SepedaMotor("Suzuki","GSX 150R",20000000);
        SepedaMotor yamaha = new SepedaMotor("Yamaha","YZF R15",25000000);
        SepedaMotor honda = new SepedaMotor("Honda","CBR 150R",23500000);

        // Menjalankan method showInfo
        suzuki.showInfo();
        yamaha.showInfo();
        honda.showInfo();

        // Uji coba Getter & Setter
        System.out.println("Motor merk "+suzuki.getMerk()+" dengan tipe (before) :"+suzuki.getTipe());
        suzuki.setTipe("Satria FU");
        System.out.println("Motor merk "+suzuki.getMerk()+" dengan tipe (after) :"+suzuki.getTipe());
    }
}
