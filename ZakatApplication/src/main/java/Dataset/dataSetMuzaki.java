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
public class dataSetMuzaki {
    private ArrayList<String> kdMuzaki;
    private ArrayList<String> namaMuzaki;
    private ArrayList<String> tempatLahir;
    private ArrayList<String> tanggalLahir;
    private ArrayList<String> alamatLengkap;
    private ArrayList<String> jenisKelamin;
    private ArrayList<String> nik;
    private ArrayList<String> pekerjaan;
    private ArrayList<String> statusPerkawinan;
    private ArrayList<String> penghasilan;
    private ArrayList<String> noTelp;
    private ArrayList<String> email;
    private ArrayList<String> username;
    private ArrayList<String> password;
    
    public dataSetMuzaki (){
        kdMuzaki = new ArrayList<String>();
        namaMuzaki = new ArrayList<String> ();
        tempatLahir = new ArrayList<String>();
        tanggalLahir = new ArrayList<String> ();
        alamatLengkap = new ArrayList<String> ();
        jenisKelamin = new ArrayList<String> ();
        nik = new ArrayList<String> ();
        pekerjaan = new ArrayList<String> ();
        statusPerkawinan = new ArrayList<String> ();
        penghasilan = new ArrayList<String> ();
        noTelp = new ArrayList<String> ();
        email = new ArrayList<String> ();
        username = new ArrayList<String> ();
        password = new ArrayList<String> ();
    }
    public void insertkdMuzaki(String isi){
        this.kdMuzaki.add(isi);
    }
     public ArrayList<String> getDatasetkdMuzaki(){
        return this.kdMuzaki;
    }
     public void insertnamaMuzaki(String isi){
        this.namaMuzaki.add(isi);
    }
     public ArrayList<String> getDatasetnamaMuzaki(){
        return this.namaMuzaki;
    }
     public void inserttempatLahir(String isi){
        this.tempatLahir.add(isi);
    }
     public ArrayList<String> getDatasettempatLahir(){
        return this.tempatLahir;
    }
     public void inserttanggalLahir(String isi){
        this.tanggalLahir.add(isi);
    }
     public ArrayList<String> getDatasettanggalLahir(){
        return this.tanggalLahir;
    }
     public void insertalamatLengkap(String isi){
        this.alamatLengkap.add(isi);
    }
     public ArrayList<String> getDatasetalamatLengkap(){
        return this.alamatLengkap;
    }
     public void insertjenisKelamin(String isi){
        this.jenisKelamin.add(isi);
    }
     public ArrayList<String> getDatasetjenisKelamin(){
        return this.jenisKelamin;
    }
     public void insertnik(String isi){
        this.nik.add(isi);
    }
     public ArrayList<String> getDatasetnik(){
        return this.nik;
    }
     public void insertpekerjaan(String isi){
        this.pekerjaan.add(isi);
    }
     public ArrayList<String> getDatasetpekerjaan(){
        return this.pekerjaan;
    }
     public void insertstatusPerkawinan(String isi){
        this.statusPerkawinan.add(isi);
    }
     public ArrayList<String> getDatasetstatusPerkawinan(){
        return this.statusPerkawinan;
    }
     public void insertpenghasilan(String isi){
        this.penghasilan.add(isi);
    }
     public ArrayList<String> getDatasetpenghasilan(){
        return this.penghasilan;
    }
     public void insertnoTelp(String isi){
        this.noTelp.add(isi);
    }
     public ArrayList<String> getDatasetnoTelp(){
        return this.noTelp;
    }
     public void insertemail(String isi){
        this.email.add(isi);
    }
     public ArrayList<String> getDatasetemail(){
        return this.email;
    }
     public void insertusername(String isi){
        this.username.add(isi);
    }
     public ArrayList<String> getDatasetusername(){
        return this.username;
    }
    public void insertpassword(String isi){
        this.password.add(isi);
    }
     public ArrayList<String> getDatasetpassword(){
        return this.password;
    }
    
}
