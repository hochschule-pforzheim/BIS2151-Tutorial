/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tutorial5;

/**
 *
 * @author Daniela
 */
public class Tutorial5 {

    public static void main(String[] args) {
        
        CatManager cm = new CatManager(6);
        
        cm.addCat("Katze1", 10);
        cm.addCat("Katze2", 30);
        cm.addCat("Katze3", 4);
        
        cm.getAllCats();
        
        cm.deleteCat(2);
        cm.updateCat(1, "Katze1_2.0", 11);
        cm.getAllCats();
        
        cm.getCatById(3);
    }
}
