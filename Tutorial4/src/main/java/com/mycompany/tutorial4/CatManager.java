/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial4;

/**
 *
 * @author Daniela
 */
public class CatManager {
    private Cat[] cats;
    private int count;

    public CatManager(int size) {
        cats = new Cat[size];
        count = 0;
    }

    // Adding a new cat to the array
    public boolean addCat(String name, int age) {
        if (count < cats.length) {
            cats[count] = new Cat(name, age, count+1);
            count++;
            return true;
        }
        return false;
    }

    // Call all cats with their information
    public void getAllCats() {
        System.out.println("All Cats:");
        for (int i = 0; i < count; i++) {
            System.out.println(cats[i].getName());
        }
    }
    
    
    
}


