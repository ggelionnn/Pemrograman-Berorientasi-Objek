/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author Zeno
 */
public class Main_Produk {
    public static void main(String[] args) {
        Produk buku1 = new Buku("Pemrograman Java", 100000);
        Produk laptop = new Elektronik("Laptop Gaming", 10000000);
        Produk kaos = new Pakaian("Kaos Polos", 50000);

        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(laptop);
        keranjang.tambahProduk(kaos);

        keranjang.tampilkanDaftarBelanja();
    }
}