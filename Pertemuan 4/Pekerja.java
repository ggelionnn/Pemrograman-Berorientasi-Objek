/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Zeno
 */

public class Pekerja extends Manusia {
    // Atribut tambahan dengan akses modifier private
    private double gaji;

    // Constructor untuk menginisialisasi nama, usia, pekerjaan, dan gaji
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan); // Memanggil constructor dari kelas induk (Manusia)
        this.gaji = gaji;
    }

    // Getter dan Setter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString() untuk menampilkan seluruh data pekerja
    @Override
    public String toString() {
        return "Nama      : " + getNama() +
             "\nUsia      : " + usia + " tahun" +
             "\nPekerjaan : " + pekerjaan +
             "\nGaji      : Rp " + gaji;
    }
}