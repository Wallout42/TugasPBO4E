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
public class dataSetZakat {
    private ArrayList<String> kdZakat;
    private ArrayList<String> namaZakat;
    private ArrayList<String> bentuk;
    private ArrayList<String> saldo;
    private ArrayList<String> keterangan;
    
    public dataSetZakat (){
        kdZakat = new ArrayList<String>();
        namaZakat = new ArrayList<String> ();
        bentuk = new ArrayList<String>();
        saldo = new ArrayList<String> ();
        keterangan = new ArrayList<String> ();
    }
    public void insertkdZakat(String isi){
        this.kdZakat.add(isi);
    }
     public ArrayList<String> getDatasetkdZakat(){
        return this.kdZakat;
    }
     public void insertnamaZakat(String isi){
        this.namaZakat.add(isi);
    }
     public ArrayList<String> getDatasetnamaZakat(){
        return this.namaZakat;
    }
     public void insertbentuk(String isi){
        this.bentuk.add(isi);
    }
     public ArrayList<String> getDatasetbentuk(){
        return this.bentuk;
    }
    public void insertsaldo(String isi){
        this.saldo.add(isi);
    }
     public ArrayList<String> getDatasetsaldo(){
        return this.saldo;
    }
     public void insertketerangan(String isi){
        this.keterangan.add(isi);
    }
     public ArrayList<String> getDatasetketerangan(){
        return this.keterangan;
    }
}
