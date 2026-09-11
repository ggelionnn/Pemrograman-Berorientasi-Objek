/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Zeno
 */

public class Main {
    public static void main(String[] args) {
        // 1. Buat objek dari kelas Pekerja dan isi data awal
        Pekerja pekerja1 = new Pekerja("Euaggelion", 19, "Software Engineer", 10000000);

        // 2. Tampilkan informasi pekerja menggunakan metode toString()
        System.out.println("=== INFORMASI PEKERJA AWAL ===");
        System.out.println(pekerja1.toString());

        // 3. Ubah nama pekerja menggunakan metode setter
        pekerja1.setNama("Euaggelion Purnomo");

        // Tampilkan ulang informasi pekerja setelah diubah
        System.out.println("\n=== INFORMASI PEKERJA SETELAH UBAH NAMA ===");
        System.out.println(pekerja1.toString());

        // 4. Pengujian Akses Langsung
        System.out.println("\n=== UJI AKSES LANGSUNG ===");
        System.out.println("Usia (Protected) : " + pekerja1.usia);
    }
}