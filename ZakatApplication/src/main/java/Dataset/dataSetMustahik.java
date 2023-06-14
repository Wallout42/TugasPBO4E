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
public class dataSetMustahik {
    private ArrayList<String> kdMustahik;
    private ArrayList<String> namaMustahik;
    private ArrayList<String> nik;
    private ArrayList<String> tempatLahir;
    private ArrayList<String> tanggalLahir;
    private ArrayList<String> alamat;
    private ArrayList<String> jenisKelamin;
    private ArrayList<String> golongan;
    
    public dataSetMustahik (){
        kdMustahik = new ArrayList<String>();
        namaMustahik = new ArrayList<String> ();
        nik = new ArrayList<String>();
        tempatLahir = new ArrayList<String> ();
        tanggalLahir = new ArrayList<String> ();
        alamat = new ArrayList<String> ();
        jenisKelamin = new ArrayList<String> ();
        golongan = new ArrayList<String> ();
    }
    
    public void insertkdMustahik(String isi){
        kdMustahik.add(isi);
    }
     public ArrayList<String> getDatasetkdMustahik(){
        return this.kdMustahik;
    }
     public void insertnamaMustahik(String isi){
        namaMustahik.add(isi);
    }
     public ArrayList<String> getDatasetnamaMustahik(){
        return this.namaMustahik;
    }
     public void insertnik(String isi){
        nik.add(isi);
    }
     public ArrayList<String> getDatasetnik(){
        return this.nik;
    }
     public void inserttempatLahir(String isi){
        tempatLahir.add(isi);
    }
     public ArrayList<String> getDatasettempatLahir(){
        return this.tempatLahir;
    }
     public void inserttanggalLahir(String isi){
        tanggalLahir.add(isi);
    }
     public ArrayList<String> getDatasettanggalLahir(){
        return this.tanggalLahir;
    }
     public void insertalamat(String isi){
        alamat.add(isi);
    }
     public ArrayList<String> getDatasetalamat(){
        return this.alamat;
    }
    public void insertjenisKelamin(String isi){
        jenisKelamin.add(isi);
    }
     public ArrayList<String> getDatasetjenisKelamin(){
        return this.jenisKelamin;
    }
     public void insertgolongan(String isi){
        golongan.add(isi);
    }
     public ArrayList<String> getDatasetgolongan(){
        return this.golongan;
    }
}
