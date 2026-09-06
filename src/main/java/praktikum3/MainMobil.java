/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author Zeno
 */
public class MainMobil {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2022, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2023, "Putih");
        
        mobil1.displayInfo();
        System.out.println();
        
        mobil2.displayInfo();
        
        mobil1.ubahWarna("Merah");
        mobil1.displayInfo();
    }
}
