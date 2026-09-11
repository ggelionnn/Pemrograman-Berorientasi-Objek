/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum4;

/**
 *
 * @author Zeno
 */
public class Praktikum_PBO4 {

    public static void main(String[] args) {
        // Membuat objek dari class Mobil (subclass dari Kendaraan)
        Mobil mobil = new Mobil("Toyota Avanza", 180, "Bensin", 5);

        // Menampilkan informasi dari class Kendaraan
        mobil.tampilkanInfoKendaraan();

        System.out.println("-----------------------------");

        // Menampilkan informasi dari class Mobil
        mobil.tampilkanInfoMobil();
    }
}
