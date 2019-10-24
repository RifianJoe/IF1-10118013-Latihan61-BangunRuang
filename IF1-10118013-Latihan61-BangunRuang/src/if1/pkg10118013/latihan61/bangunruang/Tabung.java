/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan61.bangunruang;

/**
 *
 * @author Rifian
 */
public class Tabung implements BangunRuang {
    private int jari;
    private int tinggi;
    private final double phi = 3.14;

    public int getJari() {
        return jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return (this.tinggi*(this.phi*this.jari*this.jari));
    }
    
    
}
