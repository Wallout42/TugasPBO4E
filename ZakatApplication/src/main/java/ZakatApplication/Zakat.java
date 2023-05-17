/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZakatApplication;

/**
 *
 * @author ACER
 */
public class Zakat {
    private String kdZakat;
    private String namaZakat;
    private String bentuk;
    private double saldo;
    private String keterangan;

    public Zakat(String kdZakat, String namaZakat, String bentuk, double saldo, String keterangan) {
        this.kdZakat = kdZakat;
        this.namaZakat = namaZakat;
        this.bentuk = bentuk;
        this.saldo = saldo;
        this.keterangan = keterangan;
    }

    // Setter dan Getter untuk setiap atribut
    
    public String getKdZakat() {
        return kdZakat;
    }

    public void setKdZakat(String kdZakat) {
        this.kdZakat = kdZakat;
    }

    public String getNamaZakat() {
        return namaZakat;
    }

    public void setNamaZakat(String namaZakat) {
        this.namaZakat = namaZakat;
    }

    public String getBentuk() {
        return bentuk;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    // Metode lainnya sesuai kebutuhan

    public void displayZakatInfo() {
        System.out.println("Kode Zakat: " + kdZakat);
        System.out.println("Nama Zakat: " + namaZakat);
        System.out.println("Bentuk: " + bentuk);
        System.out.println("Saldo: " + saldo);
        System.out.println("Keterangan: " + keterangan);
    }
}

