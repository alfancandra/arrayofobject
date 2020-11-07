package com.alfan.pbo.arrayOfObject;

public class Main {
    public static void main(String[] args) {
        // Deklarasi
        Konoha[] konoha = new Konoha[3];

        // New Data
        konoha[0] = new Konoha();
        konoha[0].setNoRegistrasi("012606");
        konoha[0].setNama("Uchiha Sasuke");
        konoha[0].setPeringkat("Genin");

        // New Data
        konoha[1] = new Konoha();
        konoha[1].setNoRegistrasi("012607");
        konoha[1].setNama("Uzumaki Naruto");
        konoha[1].setPeringkat("Genin");

        // New Data
        konoha[2] = new Konoha();
        konoha[2].setNoRegistrasi("012601");
        konoha[2].setNama("Haruno Sakura");
        konoha[2].setPeringkat("Chunin");

        // Cetak
        for (Konoha data:konoha) {
            System.out.println("Nomor Registrasi\t:" + data.getNoRegistrasi());
            System.out.println("Nama\t\t\t\t:" + data.getNama());
            System.out.println("Peringkat\t\t\t:" + data.getPeringkat());
            System.out.println();
        }
    }
}
