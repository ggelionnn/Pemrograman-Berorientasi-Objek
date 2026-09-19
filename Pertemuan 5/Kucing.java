/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Zeno
 */
public class Kucing extends Hewan {
     
    @Override
     public void bersuara() {
         System.out.println("Suara: Meow Meow");
     }
     
     @Override
     public void tampilkanInfo() {
         super.tampilkanInfo();
         bersuara();
     }
}
