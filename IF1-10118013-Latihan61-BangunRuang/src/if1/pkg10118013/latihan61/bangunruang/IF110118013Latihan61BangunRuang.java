/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan61.bangunruang;
import java.util.Scanner;
/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-01
 * NIM : 10118013
 * Deskripsi Program : Menghitung Volume Bola, Tabung dan Kerucut
 */
public class IF110118013Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
		Bola bola = new Bola();
		System.out.print("Jari-Jari Bola\t\t: ");
		bola.setJari(sc.nextInt());
		Tabung tabung = new Tabung();
		System.out.print("Jari-Jari Tabung\t: ");
		tabung.setJari(sc.nextInt());
		System.out.print("Tinggi Tabung\t\t: ");
		tabung.setTinggi(sc.nextInt());
		Kerucut kerucut = new Kerucut();
		System.out.print("Jari-Jari Kerucut\t: ");
		kerucut.setJari(sc.nextInt());
		System.out.print("Tinggi Kerucut\t\t: ");
		kerucut.setTinggi(sc.nextInt());
		System.out.printf("Volume Bola\t: %.1f cm³\nVolume Tabung\t: %.1f cm³\nVolume Kerucut\t: %.1f cm³\t", bola.hitungVolume(), tabung.hitungVolume(), kerucut.hitungVolume());
    }
    
}
