/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zakatapplication;

import ZakatApplication.Admin;
import ZakatApplication.Mustahik;
import ZakatApplication.Muzaki;
import ZakatApplication.Zakat;
import ZakatApplication.ZakatKeluar;
import ZakatApplication.ZakatMasuk;


/**
 *
 * @author ACER
 */
import java.util.Date;


public class ZakatApplication {
    public static void main(String[] args) {
        // Membuat objek Admin
        Admin Admin = new Admin(001, "Mohammad Rizky Aulia", "Male", "admin", "admin123", "Active");

        // Membuat objek Muzaki
        Muzaki muzaki = new Muzaki("M001", "Farah Aufa", "Marabahan", new Date(), "Jl. Raya No. 123",
                "Male", "1234567890", "Employee", "Married", 5000000, "08123456789", "john.smith@example.com",
                "muzaki", "muzaki123");

        // Membuat objek Mustahik
        Mustahik mustahik = new Mustahik("H001", "Dea Afrizal", "1234567890", "Bandung", new Date(),
                "Jl. Melati No. 456", "Female", "Poor");

        // Membuat objek Zakat
        Zakat zakat = new Zakat("Z001", "Zakat Fitrah", "Tunai", 0, "Zakat Fitrah untuk bulan Ramadhan");

        // Membuat objek ZakatMasuk
        ZakatMasuk zakatMasuk = new ZakatMasuk("M001Z001", "Z001", "M001", 100000, "Tunai",
                new Date(), "1234567890", "Bukti Transfer", "Masuk", "Paid", "A001");

        // Membuat objek ZakatKeluar
        ZakatKeluar zakatKeluar = new ZakatKeluar("K001", "Z001", "H001", 50000, "Tunai",
                new Date(), "A001", "Untuk keperluan pendidikan");

        // Menampilkan informasi objek Admin
        System.out.println("Informasi Admin:");
        Admin.displayinfo();

        System.out.println();

        // Menampilkan informasi objek Muzaki
        System.out.println("Informasi Muzaki:");
        muzaki.displayMuzakiInfo();

        System.out.println();

        // Menampilkan informasi objek Mustahik
        System.out.println("Informasi Mustahik:");
        mustahik.displayMustahikInfo();

        System.out.println();

        // Menampilkan informasi objek Zakat
        System.out.println("Informasi Zakat:");
        zakat.displayZakatInfo();

        System.out.println();

        // Menampilkan informasi objek ZakatMasuk
        System.out.println("Informasi Zakat Masuk:");
        zakatMasuk.displayZakatMasukInfo();

        System.out.println();

        // Menampilkan informasi objek ZakatKeluar
        System.out.println("Informasi Zakat Keluar:");
        zakatKeluar.displayZakatKeluarInfo();
    }
}

