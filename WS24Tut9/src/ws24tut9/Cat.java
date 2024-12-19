/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws24tut9;

/**
 *
 * @author donata
 * Subclass Cat, inherits attributes from Animal
 */
public class Cat extends Animal {

    //own attributes not inherited 
    private int age;
    private int id;

    // Constructor
    public Cat(String name, int age, int id) {
        super(name); //inherited 
        this.age = age;
        this.id = id;
    }

    // Getter and Setter methods
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Method to display cat details, inherited from Animal superclass
    @Override
    public void displayDetails() {
        System.out.println("Cat Details: ");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }

    //toString method inherited from mother of all objects, the super mega class "Object"
    @Override
    public String toString(){
        String catAsString;
        catAsString = "----------------------------------------------"
        + "\nName:    " + this.name
        + "\nAge:     "+ this.age
        + "\nID:      " + this.id 
        + "\n----------------------------------------------";
        return catAsString;
    }
}
