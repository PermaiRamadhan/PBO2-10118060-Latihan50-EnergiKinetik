/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg50.energikinetik;

/**
 *
 * @author Synxsaints
 */
public class EnergiKinetik {
    private double massa;
    private double kec;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKec() {
        return kec;
    }

    public void setKec(double kec) {
        this.kec = kec;
    }
    
    public double hitungEK(){
        return 0.5 * massa * (kec*kec);
    }
    
    public double hitungUsaha(){
        //Energi Kinetik = Usaha karena tidak ada perubahan kecepatan.
        return hitungEK();
    }
    
}
