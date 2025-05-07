/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws24tut9;

/**
 *
 * @author donata
 * superclass Animal
 */
public class Animal {
    
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void displayDetails(){
        //will be overridden in subclass
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
