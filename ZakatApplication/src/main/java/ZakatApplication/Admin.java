/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZakatApplication;

/**
 *
 * @author ACER
 */
public class Admin {
    private int idAdmin;
    private String namaAdmin;
    private String jenisKelamin;
    private String username;
    private String password;
    private String status;
    
    public Admin(int idAdmin, String namaAdmin, String jenisKelamin, String username, String password, String status) {
        this.idAdmin = idAdmin;
        this.namaAdmin = namaAdmin;
        this.jenisKelamin = jenisKelamin;
        this.username = username;
        this.password = password;
        this.status = status;
    }
    
    
    // Setter dan Getter untuk setiap atribut
    
    public int getIdAdmin() {
        return idAdmin;
    }
    
    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }
    
    public String getNamaAdmin() {
        return namaAdmin;
    }
    
    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }
    
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
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
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String Status) {
        this.status = Status;
    }
    
        public void displayinfo(){    
        System.out.println("Informasi Admin:" + idAdmin );
        System.out.println("ID Admin: " + namaAdmin);
        System.out.println("Nama Admin: " + jenisKelamin);
        System.out.println("Jenis Kelamin: " + username);
        System.out.println("Username: " + password);
        System.out.println("Status: " + status);
        
            }
}


