/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author Zeno
 */
public class Elektronik implements Pembayaran {
    @Override
    public double hitungPajak(double harga) {
        // Pajak Elektronik 10% (0.10)
        return harga * 0.10;
    }
}
