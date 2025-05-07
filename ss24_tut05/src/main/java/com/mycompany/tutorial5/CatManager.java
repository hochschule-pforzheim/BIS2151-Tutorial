/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial5;

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
    
    
    // Deleting a cat using the ID
    public boolean deleteCat(int id) {
        for (int i = 0; i < count; i++) {
            if (cats[i].getId() == id) {
                // Shift the remaining cats to the left
                for (int j = i; j < count - 1; j++) {
                    cats[j] = cats[j + 1];
                }
                cats[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }
    
    // Call a cat using the ID
    public Cat getCatById(int id) {
        for (int i = 0; i < count; i++) {
            if (cats[i].getId() == id) {
                return cats[i];
            }
        }
        return null;
    }

    // Updating a cat using the ID
    public boolean updateCat(int id, String newName, int newAge) {
        for (int i = 0; i < count; i++) {
            if (cats[i].getId() == id) {
                cats[i].setName(newName);
                cats[i].setAge(newAge);
                return true;
            }
        }
        return false;
    }
}


