/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class dataSetZakatMasuk {
    private ArrayList<String> noTransMasuk;
    private ArrayList<String> kdZakat;
    private ArrayList<String> kdMuzaki;
    private ArrayList<String> jumlahMasuk;
    private ArrayList<String> bentuk;
    private ArrayList<String> tanggalMasuk;
    private ArrayList<String> noRek;
    private ArrayList<String> bukti;
    private ArrayList<String> keterangan;
    private ArrayList<String> status;
    private ArrayList<String> idAdmin;
    
    public dataSetZakatMasuk (){
        noTransMasuk = new ArrayList<String>();
        kdZakat = new ArrayList<String> ();
        kdMuzaki = new ArrayList<String>();
        jumlahMasuk = new ArrayList<String> ();
        bentuk = new ArrayList<String> ();
        tanggalMasuk = new ArrayList<String> ();
        noRek = new ArrayList<String> ();
        bukti = new ArrayList<String> ();
        keterangan = new ArrayList<String> ();
        status = new ArrayList<String> ();
        idAdmin = new ArrayList<String> ();
    }
    public void insertnoTransMasuk(String isi){
        noTransMasuk.add(isi);
    }
     public ArrayList<String> getDatasetnoTransMasuk(){
        return this.noTransMasuk;
    }
     public void insertkdZakat(String isi){
        kdZakat.add(isi);
    }
     public ArrayList<String> getDatasetkdZakat(){
        return this.kdZakat;
    }
     public void insertkdMuzaki(String isi){
        kdMuzaki.add(isi);
    }
     public ArrayList<String> getDatasetkdMuzaki(){
        return this.kdMuzaki;
    }
     public void insertjumlahMasuk(String isi){
        jumlahMasuk.add(isi);
    }
     public ArrayList<String> getDatasetjumlahMasuk(){
        return this.jumlahMasuk;
    }
     public void insertbentuk(String isi){
        bentuk.add(isi);
    }
     public ArrayList<String> getDatasetbentuk(){
        return this.bentuk;
    }
     public void inserttanggalMasuk(String isi){
        tanggalMasuk.add(isi);
    }
     public ArrayList<String> getDatasettangalMasuk(){
        return this.tanggalMasuk;
    }
     public void insertnoRek(String isi){
        noRek.add(isi);
    }
     public ArrayList<String> getDatasetnoRek(){
        return this.noRek;
    }
     public void insertbukti(String isi){
        bukti.add(isi);
    }
     public ArrayList<String> getDatasetbukti(){
        return this.bukti;
    }
     public void insertketerangan(String isi){
        keterangan.add(isi);
    }
     public ArrayList<String> getDatasetketerangan(){
        return this.keterangan;
    }
     public void insertstatus(String isi){
        status.add(isi);
    }
     public ArrayList<String> getDatasetstatus(){
        return this.status;
    }
     public void insertidAdmin(String isi){
        idAdmin.add(isi);
    }
     public ArrayList<String> getDatasetidAdmin(){
        return this.idAdmin;
    }
}
