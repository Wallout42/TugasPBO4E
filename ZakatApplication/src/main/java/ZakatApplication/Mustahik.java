/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZakatApplication;

/**
 *
 * @author ACER
 */

public class Mustahik {
    private String kdMustahik;
    private String namaMustahik;
    private String nik;
    private String tempatLahir;
    private String tanggalLahir;
    private String alamat;
    private String jenisKelamin;
    private String golongan;

    public Mustahik(String kdMustahik, String namaMustahik, String nik, String tempatLahir,
                    String tanggalLahir, String alamat, String jenisKelamin, String golongan) {
        this.kdMustahik = kdMustahik;
        this.namaMustahik = namaMustahik;
        this.nik = nik;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.golongan = golongan;
        
    }

    // Setter dan Getter untuk setiap atribut
    
    public String getKdMustahik() {
        return kdMustahik;
    }

    public void setKdMustahik(String kdMustahik) {
        this.kdMustahik = kdMustahik;
    }

    public String getNamaMustahik() {
        return namaMustahik;
    }

    public void setNamaMustahik(String namaMustahik) {
        this.namaMustahik = namaMustahik;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String jenisKelamin) {
        this.golongan = golongan;
    }

    // Metode lainnya sesuai kebutuhan

    public void displayMustahikInfo() {
        System.out.println("Kode Mustahik: " + kdMustahik);
        System.out.println("Nama Mustahik: " + namaMustahik);
        System.out.println("NIK: " + nik);
        System.out.println("Tempat Lahir: " + tempatLahir);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Golongan: " + golongan);
        
    }
}

