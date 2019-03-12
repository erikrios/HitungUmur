package com.erikriosetiawan;
import java.util.Scanner;
import java.util.Calendar;

public class HitungUmur {

    // Membuat Objek dari Library Java yang Telah di Import
    private static Scanner userInput = new Scanner(System.in);
    private static Calendar calendar = Calendar.getInstance();
    private static int thisYear = calendar.getWeekYear();

    public static void main(String[] args) {

        //Memanggil Method tamilkanData()
        tampilkanData();
    }

    // Membuat Method Print
    private static void print(String str) {
        System.out.print(str);
    }

    // Membuat Method Input Tahun Lahir User
    private static int inputTahunLahirUser() {
        int tahunLahir;
        print("Masukkan Tahun Lahir Anda : ");
        tahunLahir = userInput.nextInt();
        return tahunLahir;
    }

    // Membuat Method Input Nama User

    private static String inputNamaUser(){
        String namaUser;
        print("Masukkan Nama Anda : ");
        namaUser = userInput.nextLine();
        return namaUser;
    }

    // Membuat Method Proses Data Umur User
    private static int prosesDataUmur() {
        int umurUser, tahunLahir;
        tahunLahir = inputTahunLahirUser();
        umurUser = thisYear - tahunLahir;
        return umurUser;
    }

    // Membuat Method Untuk Menamilkan Data
    private static void tampilkanData() {
        String namaUser;
        int umurUser;
        namaUser = inputNamaUser();
        umurUser = prosesDataUmur();

        print("Halo " + namaUser + "! Umur Anda adalah " + umurUser + " tahun\n");
        print("Segera tobat ya Broo! ;)");
    }

}
