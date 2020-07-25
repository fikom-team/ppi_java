/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paccul;

/**
 *
 * @author luck_noo
 */
public class Main {

    public static void main(String[] args) {
       
        Hanan hanan = new Hanan();
        
        hanan.setNama("Hanan Asyrawi Rivai");
        
        hanan.setAlamat("Tomoni");
        
        System.out.println("Get nama : " + hanan.getnama());
        
    }

}

class Hanan extends Orang {}

class Paccul extends Orang {}
