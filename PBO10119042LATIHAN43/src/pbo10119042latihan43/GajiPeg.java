/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan43;

/**
 *
 * @author 
 *  Nama    :Muhammad Rifqu Abdillah
 * Kelas    :IF-1
 * NIM      :10119042
 * Deskripsi : Program ini berisi program untuk menampilkan GAJI PEGAWAI
 */
public class GajiPeg {
    private String nama, alamat;
    private int uangTunjangan, uangTransport,gajiPokok,totalGaji;
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public int getUangTunjangan(){
        return this.uangTunjangan;
    }
    public void setUangTunjangan(int uangTunjangan){
        this.uangTunjangan = uangTunjangan;
    }
    
    public int getUangTransport(){
        return this.uangTransport;
    }
    
    public void setUangTransport(int uangTransport){
        this.uangTransport = uangTransport;
    }
    
    public int getGajiPokok(){
        return this.gajiPokok;
    }
    
    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok; 
    }
    
    public int getTotalGaji(){
        return this.totalGaji;
    }
    
    public void setTotalGaji(int totalGaji){
        this.totalGaji=totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        return uangTunjangan + uangTransport + gajiPokok;
    }
    
    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji){
    System.out.println("### Data Gaji Karyawan PT.KAKATU###");
    System.out.println("-----------------------------------");
    System.out.println("Nama Karyawan : " + nama);
    System.out.println("Alamat        : " + alamat);
    System.out.println("Uang Tunjangan: " + uangTunjangan);
    System.out.println("Uang Transport: " + uangTransport);
    System.out.println("Gaji Pokok    : " + gajiPokok);
    System.out.println("Total Gaji    : " + totalGaji);
    }
}
