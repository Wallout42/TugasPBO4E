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
public class dataSetAdmin {
    private ArrayList<Integer> idAdmin;
    private ArrayList<String>namaAdmin;
    private ArrayList<String> jenisKelamin;
    private ArrayList<String> username;
    private ArrayList<String> password;
    private ArrayList<String> status;
    
    //constructor
    public dataSetAdmin (){
        idAdmin = new ArrayList<Integer>();
        namaAdmin = new ArrayList<String> ();
        jenisKelamin = new ArrayList<String>();
        username = new ArrayList<String> ();
        password = new ArrayList<String> ();
        status = new ArrayList<String> ();
    }
    
     public void insertIdAdmin(Integer isi){
        this.idAdmin.add(isi);
    }
     public ArrayList<Integer> getrecordidAdmin(){
        return this.idAdmin;
    }
     
     public void insertNamaAdmin(String isi){
        this.namaAdmin.add(isi);
    }
     public ArrayList<String> getDatasetNamaAdmin(){
        return this.namaAdmin;
    }
     
     public void insertjenisKelamin(String isi){
        this.jenisKelamin.add(isi);
    }
     public ArrayList<String> getDatasetjenisKelamin(){
        return this.jenisKelamin;
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
     public void insertstatus(String isi){
       this.status.add(isi);
    }
     public ArrayList<String> getDatasetstatus(){
        return this.status;
    }
}
