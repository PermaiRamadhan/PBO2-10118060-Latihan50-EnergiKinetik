/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg50.energikinetik;

/**
 *
 * @author 
 * Nama     : Permai Ramadhan
 * Kelas    : PBO2
 * NIM      : 10118060
 * Latihan ini berisi tentang bagaimana menghitung energi kinetik dan usaha
 * dalam sebuah program.
 */
public class PBO210118060LatihanKe50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnergiKinetik ek = new EnergiKinetik();
        ek.setMassa(145);
        ek.setKec(25);
        System.out.println("======Hitung Energi Kinetik Bola Baseball======\n");
        System.out.println("Massa bola : " + ek.getMassa() + " gram");
        System.out.println("Kecepatan bola : " + ek.getKec() + " m/s\n");
        System.out.println("a. Energi Kinetik : " + ek.hitungEK() + " joule");
        System.out.println("b. Usaha : " + ek.hitungUsaha() + " joule");
    }
    
}
