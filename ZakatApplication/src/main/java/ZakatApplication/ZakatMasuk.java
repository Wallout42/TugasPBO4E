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

public class ZakatMasuk {
    private String noTransMasuk;
    private String kdZakat;
    private String kdMuzaki;
    private String jumlahMasuk;
    private String bentuk;
    private String tanggalMasuk;
    private String noRek;
    private String bukti;
    private String keterangan;
    private String status;
    private String idAdmin;
    

    public ZakatMasuk(String noTransMasuk, String kdZakat, String kdMuzaki, String jumlahMasuk,
                      String bentuk, String tanggalMasuk, String noRek, String bukti,
                      String keterangan, String status, String idAdmin) {
        this.noTransMasuk = noTransMasuk;
        this.kdZakat = kdZakat;
        this.kdMuzaki = kdMuzaki;
        this.jumlahMasuk = jumlahMasuk;
        this.bentuk = bentuk;
        this.tanggalMasuk = tanggalMasuk;
        this.noRek = noRek;
        this.bukti = bukti;
        this.keterangan = keterangan;
        this.status = status;
        this.idAdmin = idAdmin;
        
    }

    // Setter dan Getter untuk setiap atribut
    
    public String getNoTransMasuk() {
        return noTransMasuk;
    }

    public void setNoTransMasuk(String noTransMasuk) {
        this.noTransMasuk = noTransMasuk;
    }

    public String getKdZakat() {
        return kdZakat;
    }

    public void setKdZakat(String kdZakat) {
        this.kdZakat = kdZakat;
    }

    public String getKdMuzaki() {
        return kdMuzaki;
    }

    public void setKdMuzaki(String kdMuzaki) {
        this.kdMuzaki = kdMuzaki;
    }

    public String getJumlahMasuk() {
        return jumlahMasuk;
    }

    public void setJumlahMasuk(String jumlahMasuk) {
        this.jumlahMasuk = jumlahMasuk;
    }

    public String getBentuk() {
        return bentuk;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public String getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(String tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public String getNoRek() {
        return noRek;
    }

    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }

    public String getBukti() {
        return bukti;
    }

    public void setBukti(String bukti) {
        this.bukti = bukti;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getidAdmin() {
        return idAdmin;
    }

    public void setidAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    
        public void displayZakatMasukInfo() {
        System.out.println("No. Transaksi Masuk: " + noTransMasuk);
        System.out.println("Kode Zakat: " + kdZakat);
        System.out.println("Kode Muzaki: " + kdMuzaki);
        System.out.println("Jumlah Masuk: " + jumlahMasuk);
        System.out.println("Bentuk: " + bentuk);
        System.out.println("Tanggal Masuk: " + tanggalMasuk);
        System.out.println("Keterangan: " + keterangan);
        System.out.println("idAdmin: " + idAdmin);
        
}
}

