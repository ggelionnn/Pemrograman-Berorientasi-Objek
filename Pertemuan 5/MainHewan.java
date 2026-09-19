/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Zeno
 */
public class MainHewan {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Gembul";
        kucing.jenis = "Persia";
        kucing.tampilkanInfo();
    
        Anjing anjing = new Anjing();
        anjing.nama = "Hank";
        anjing.jenis = "Pomeranian";
        anjing.tampilkanInfo();
    }
}
 