/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author Zeno
 */
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> listProduk;

    public KeranjangBelanja() {
        this.listProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        listProduk.add(produk);
    }

    public double hitungTotalHarga() {
        double total = 0;
        for (Produk p : listProduk) {
            total += p.getHargaSetelahDiskon();
        }
        return total;
    }

    public void tampilkanDaftarBelanja() {
        System.out.println("=== DAFTAR BELANJA ===");
        for (Produk p : listProduk) {
            System.out.println("- " + p.getNama() + 
                               " | Harga Asli: Rp" + p.getHarga() + 
                               " | Diskon: Rp" + p.hitungDiskon() + 
                               " | Harga Akhir: Rp" + p.getHargaSetelahDiskon());
        }
        System.out.println("----------------------------------------");
        System.out.println("Total Bayar Setelah Diskon: Rp" + hitungTotalHarga());
    }
}
