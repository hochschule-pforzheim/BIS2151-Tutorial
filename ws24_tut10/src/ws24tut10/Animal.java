/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws24tut10;

/**
 *
 * @author donat
 */
public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Getter and Setter methodes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //abstract method will be completed in the sub class that implements it 
    public abstract void displayDetails();
    
    public abstract void makeSound();
    
}




/**
    @Override
    public String toString() {
        return "Cat{"
                + "name='" + getName() + '\''
                + ", age=" + age
                + ", id=" + id
                + '}';
    }
    * 
    **/