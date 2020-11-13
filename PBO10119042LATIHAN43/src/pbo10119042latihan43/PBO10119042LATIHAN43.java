/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan43;

/**
 *
 * @author 
 *  Nama     :Muhammad Rifqu Abdillah
 * Kelas    :IF-1
 * NIM      :10119042
 * Deskripsi : Program ini berisi program untuk menampilkan GAJI PEGAWAI
 */
public class PBO10119042LATIHAN43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       GajiPeg gajiPeg = new GajiPeg();
       
       gajiPeg.setUangTunjangan(250000);
       int uangTunjangan = gajiPeg.getUangTunjangan();
       
       gajiPeg.setUangTransport(300000);
       int uangTransport = gajiPeg.getUangTransport();
       
       gajiPeg.setGajiPokok(4500000);
       int gajiPokok = gajiPeg.getGajiPokok();
       
       int jumlah = gajiPeg.totalGaji(uangTunjangan,uangTransport,gajiPokok);
       gajiPeg.setTotalGaji(jumlah);
       int totalGaji = gajiPeg.getTotalGaji();
       
       gajiPeg.tampilData("Rizki Adam Kurniawan", "Jalan Semar dlm 4 No. 77/66", uangTunjangan,uangTransport,gajiPokok,totalGaji);
       
    }
    
}
