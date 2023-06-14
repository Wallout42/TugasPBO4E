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
public class dataSetZakatKeluar {
    private ArrayList<String> noTransKeluar;
    private ArrayList<String> kdZakat;
    private ArrayList<String> kdMustahik;
    private ArrayList<String> jumlahKeluar;
    private ArrayList<String> bentuk;
    private ArrayList<String> tanggalKeluar;
    private ArrayList<String> idAdmin;
    private ArrayList<String> Keterangan;
    
    public dataSetZakatKeluar (){
        noTransKeluar = new ArrayList<String>();
        kdZakat = new ArrayList<String> ();
        kdMustahik = new ArrayList<String>();
        jumlahKeluar = new ArrayList<String> ();
        bentuk = new ArrayList<String> ();
        tanggalKeluar = new ArrayList<String> ();
        idAdmin = new ArrayList<String> ();
        Keterangan = new ArrayList<String> ();
    }
    public void insertnoTransKeluar(String isi){
        noTransKeluar.add(isi);
    }
     public ArrayList<String> getDatasetnoTransKeluar(){
        return this.noTransKeluar;
    }
     public void insertkdZakat(String isi){
        kdZakat.add(isi);
    }
     public ArrayList<String> getDatasetkdZakat(){
        return this.kdZakat;
    }
     public void insertkdMustahik(String isi){
        kdMustahik.add(isi);
    }
     public ArrayList<String> getDatasetkdMustahik(){
        return this.kdMustahik;
    }
     public void insertjumlahKeluar(String isi){
        jumlahKeluar.add(isi);
    }
     public ArrayList<String> getDatasetjumlahKeluar(){
        return this.jumlahKeluar;
    }
     public void insertbentuk(String isi){
        bentuk.add(isi);
    }
     public ArrayList<String> getDatasetbentuk(){
        return this.bentuk;
    }
     public void inserttanggalKeluar(String isi){
        tanggalKeluar.add(isi);
    }
     public ArrayList<String> getDatasettanggalKeluar(){
        return this.tanggalKeluar;
    }
     public void insertidAdmin(String isi){
        idAdmin.add(isi);
    }
     public ArrayList<String> getDatasetidAdmin(){
        return this.idAdmin;
    }
     public void insertKeterangan(String isi){
        Keterangan.add(isi);
    }
     public ArrayList<String> getDatasetKeterangan(){
        return this.Keterangan;
    }
}
