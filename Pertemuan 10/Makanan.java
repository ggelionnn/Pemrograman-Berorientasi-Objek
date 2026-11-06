/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author Zeno
 */
public class Makanan implements Pembayaran {
    @Override
    public double hitungPajak(double harga) {
        // Pajak Makanan 5% (0.05)
        return harga * 0.05;
    }
}

