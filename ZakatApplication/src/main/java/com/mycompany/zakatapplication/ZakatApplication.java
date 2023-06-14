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
import java.util.ArrayList;
import forms.FrameUtama;

/**
 *
 * @author ACER
 */
import java.util.Date;


public class ZakatApplication {
    public static void main(String[] args) {
        // Membuat objek Admin
       /* Admin Admin = new Admin(001, "Mohammad Rizky Aulia", "Male", "admin", "admin123");
        Admin.displayinfo();
        ArrayList<String> status=new ArrayList<String>();
        System.out.print("status :");
        
        status.add("active");
        status.add("non active");
        status.add("active");
        System.out.println(status.get(1));
        
        System.out.println("--------------------------------------------------"); 
        
        
                
        // Membuat objek Muzaki
        Muzaki muzaki = new Muzaki("M001", "Farah Aufa", "Marabahan", new Date(), "Jl. Raya No. 123",
                "Male", "1234567890", "Employee", "Married", 5000000, "08123456789", "john.smith@example.com",
                "muzaki");
        muzaki.displayMuzakiInfo();
        ArrayList<String> password=new ArrayList<String>();
        System.out.print("password :");
        
        password.add("muzaki123");
        password.add("muzaki098");
        password.add("muzaki1818");
        System.out.println(password.get(2));
        
        System.out.println("--------------------------------------------------"); 
        
        

        // Membuat objek Mustahik
        Mustahik mustahik = new Mustahik("H001", "Dea Afrizal", "1234567890", "Bandung", new Date(),
                "Jl. Melati No. 456", "Female");
        mustahik.displayMustahikInfo();
        ArrayList<String> golongan=new ArrayList<String>();
        System.out.print("golongan :");
        
        golongan.add("1");
        golongan.add("2");
        golongan.add("3");
        System.out.println(golongan.get(1));
        
        System.out.println("--------------------------------------------------"); 

        // Membuat objek Zakat
        Zakat zakat = new Zakat("Z001", "Zakat Fitrah", 0, "Zakat Fitrah untuk bulan Ramadhan");
        zakat.displayZakatInfo();
        ArrayList<String> bentuk=new ArrayList<String>();
        System.out.print("bentuk :");
        
        bentuk.add("Tunai");
        bentuk.add("Non Tunai");
        bentuk.add("Non Tunai");
        System.out.println(bentuk.get(1));
        
        System.out.println("--------------------------------------------------"); 

        // Membuat objek ZakatMasuk
        ZakatMasuk zakatMasuk = new ZakatMasuk("M001Z001", "Z001", "M001", 100000, "Tunai",
                new Date(), "1234567890", "Bukti Transfer", "Masuk", "Paid");
        zakatMasuk.displayZakatMasukInfo();
        ArrayList<String> idAdmin=new ArrayList<String>();
        System.out.print("idAdmin :");
        
        idAdmin.add("A001");
        idAdmin.add("A002");
        idAdmin.add("A003");
        System.out.println(idAdmin.get(1));
        
        System.out.println("--------------------------------------------------"); 

        // Membuat objek ZakatKeluar
        ZakatKeluar zakatKeluar = new ZakatKeluar("K001", "Z001", "H001", 50000, "Tunai",
                new Date(), "A001");
        zakatKeluar.displayZakatKeluarInfo();
        ArrayList<String> keterangan=new ArrayList<String>();
        System.out.print("keterangan :");
        
        keterangan.add("Untuk keperluan pendidikan");
        keterangan.add("Untuk keperluan Operasional");
        keterangan.add("Untuk Keperluan Masyarakat Miskin");
        System.out.println(keterangan.get(1));
        
        System.out.println("--------------------------------------------------"); 

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
        zakatKeluar.displayZakatKeluarInfo();*/
       
       FrameUtama myFrame = new FrameUtama();
       myFrame.setVisible(true);
    }
}

