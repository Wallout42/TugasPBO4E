/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZakatApplication;
/**
 *
 * @author ACER
 */

public class ZakatKeluar {
    private String noTransKeluar;
    private String kdZakat;
    private String kdMustahik;
    private String jumlahKeluar;
    private String bentuk;
    private String tanggalKeluar;
    private String idAdmin;
    private String Keterangan;
    

    public ZakatKeluar(String noTransKeluar, String kdZakat, String kdMustahik, String jumlahKeluar,
                       String bentuk, String tanggalKeluar, String idAdmin, String Keterangan) {
        this.noTransKeluar = noTransKeluar;
        this.kdZakat = kdZakat;
        this.kdMustahik = kdMustahik;
        this.jumlahKeluar = jumlahKeluar;
        this.bentuk = bentuk;
        this.tanggalKeluar = tanggalKeluar;
        this.idAdmin = idAdmin;
        this.Keterangan = Keterangan;
        
    }

    // Setter dan Getter untuk setiap atribut

    public String getNoTransKeluar() {
        return noTransKeluar;
    }

    public void setNoTransKeluar(String noTransKeluar) {
        this.noTransKeluar = noTransKeluar;
    }

    public String getKdZakat() {
        return kdZakat;
    }

    public void setKdZakat(String kdZakat) {
        this.kdZakat = kdZakat;
    }

    public String getKdMustahik() {
        return kdMustahik;
    }

    public void setKdMustahik(String kdMustahik) {
        this.kdMustahik = kdMustahik;
    }

    public String getJumlahKeluar() {
        return jumlahKeluar;
    }

    public void setJumlahKeluar(String jumlahKeluar) {
        this.jumlahKeluar = jumlahKeluar;
    }

    public String getBentuk() {
        return bentuk;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public String getTanggalKeluar() {
        return tanggalKeluar;
    }

    public void setTanggalKeluar(String tanggalKeluar) {
        this.tanggalKeluar = tanggalKeluar;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }
    
    public String Keterangan() {
        return Keterangan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

    

    // Metode lainnya sesuai kebutuhan

    public void displayZakatKeluarInfo() {
        System.out.println("No. Transaksi Keluar: " + noTransKeluar);
        System.out.println("Kode Zakat: " + kdZakat);
        System.out.println("Kode Mustahik: " + kdMustahik);
        System.out.println("Jumlah Keluar: " + jumlahKeluar);
        System.out.println("Bentuk: " + bentuk);
        System.out.println("Tanggal Keluar: " + tanggalKeluar);
        System.out.println("ID Admin: " + idAdmin);
        System.out.println("Keterangan: " + Keterangan);
    }
}

