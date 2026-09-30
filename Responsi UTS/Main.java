/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.responsiuts.euaggelion;

/**
 *
 * @author Zeno
 */
public class Main {

    public static void main(String[] args) {
        Produk laptop = new Elektronik("Laptop", 15000000, 2);
        Pegawai pegawaiTetap = new PegawaiTetap("Euaggelion", 5000000, 1000000);
        
        Produk snack = new Makanan("Snack", 15000, "2026-09-29");
        Pegawai pegawaiKontrak = new PegawaiKontrak("Andi", 3000000, 12);
        
        laptop.tampilkanInfo();
        System.out.println();
        
        pegawaiTetap.tampilkanInfo();
        System.out.println();
        
        snack.tampilkanInfo();
        System.out.println();
        
        pegawaiKontrak.tampilkanInfo();
    }
}
