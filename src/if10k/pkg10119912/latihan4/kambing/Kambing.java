/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan4.kambing;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 * Deskripsi Program : Program ini berisi proses input output
 * 
 */
public class Kambing {

    public void tambahKambing() {
    // Deklarasi variabel lokal
    int jumlahKambing = 0;

    jumlahKambing = jumlahKambing + 5;
    System.out.println("Jumlah Kambing setelah di tambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
