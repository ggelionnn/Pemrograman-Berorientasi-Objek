/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author Zeno
 */
public class MainTugas {
    public static void main(String[] args) {
        // Sample harga produk
        double hargaElektronik = 2000000.0; // Rp 2.000.000
        double hargaMakanan = 50000.0;     // Rp 50.000

        Pembayaran produkElektronik = new Elektronik();
        Pembayaran produkMakanan = new Makanan();

        // Hitung Pajak
        double pajakElektronik = produkElektronik.hitungPajak(hargaElektronik);
        double pajakMakanan = produkMakanan.hitungPajak(hargaMakanan);

        System.out.println("=== SISTEM PERHITUNGAN PAJAK TOKO ===");
        System.out.println("Harga Laptop/Elektronik : Rp " + hargaElektronik);
        System.out.println("Pajak Elektronik (10%)  : Rp " + pajakElektronik);
        System.out.println("-------------------------------------");
        System.out.println("Harga Snack/Makanan     : Rp " + hargaMakanan);
        System.out.println("Pajak Makanan (5%)      : Rp " + pajakMakanan);
    }
}
