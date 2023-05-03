package com.Achmad.PBO.Pertemuan4;

public class Main {
    public static void main(String[] args) {
        Manajer manajer = new Manajer();
        Pegawai pegawai= new Pegawai();

        manajer.nip = 191220031;
        manajer.nama = "Basuki";

        pegawai.nip = 181910024;
        pegawai.nama = "Achmad";


        manajer.showInfo();
        manajer.extraInfo();
        manajer.bonus(1000000);
        manajer.bonus();

        pegawai.showInfo();
        pegawai.extraInfo();
    }
}
