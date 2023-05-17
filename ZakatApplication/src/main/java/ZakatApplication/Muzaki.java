/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZakatApplication;

/**
 *
 * @author ACER
 */
import java.util.Date;

public class Muzaki {
    private String kdMuzaki;
    private String namaMuzaki;
    private String tempatLahir;
    private Date tanggalLahir;
    private String alamatLengkap;
    private String jenisKelamin;
    private String nik;
    private String pekerjaan;
    private String statusPerkawinan;
    private double penghasilan;
    private String noTelp;
    private String email;
    private String username;
    private String password;

    public Muzaki(String kdMuzaki, String namaMuzaki, String tempatLahir, Date tanggalLahir,
                  String alamatLengkap, String jenisKelamin, String nik, String pekerjaan,
                  String statusPerkawinan, double penghasilan, String noTelp, String email,
                  String username, String password) {
        this.kdMuzaki = kdMuzaki;
        this.namaMuzaki = namaMuzaki;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.alamatLengkap = alamatLengkap;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.pekerjaan = pekerjaan;
        this.statusPerkawinan = statusPerkawinan;
        this.penghasilan = penghasilan;
        this.noTelp = noTelp;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    // Setter dan Getter untuk setiap atribut
    
    public String getKdMuzaki() {
        return kdMuzaki;
    }

    public void setKdMuzaki(String kdMuzaki) {
        this.kdMuzaki = kdMuzaki;
    }

    public String getNamaMuzaki() {
        return namaMuzaki;
    }

    public void setNamaMuzaki(String namaMuzaki) {
        this.namaMuzaki = namaMuzaki;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAlamatLengkap() {
        return alamatLengkap;
    }

    public void setAlamatLengkap(String alamatLengkap) {
        this.alamatLengkap = alamatLengkap;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public void setStatusPerkawinan(String statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
                }
    public double getPenghasilan() {
        return penghasilan;
    }

    public void setPenghasilan(double penghasilan) {
        this.penghasilan = penghasilan;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Metode lainnya sesuai kebutuhan

    public void displayMuzakiInfo() {
        System.out.println("Kode Muzaki: " + kdMuzaki);
        System.out.println("Nama Muzaki: " + namaMuzaki);
        System.out.println("Tempat Lahir: " + tempatLahir);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Alamat Lengkap: " + alamatLengkap);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("NIK: " + nik);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Status Perkawinan: " + statusPerkawinan);
        System.out.println("Penghasilan: " + penghasilan);
        System.out.println("Nomor Telepon: " + noTelp);
        System.out.println("Email: " + email);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
