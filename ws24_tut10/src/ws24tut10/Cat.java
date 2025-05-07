/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws24tut10;

/**
 *
 * @author donat
 */
class Cat extends Animal {

    private int age;
    private int id;

    // Constructor
    public Cat(String name, int age, int id) {
        super(name);
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

    // Method to display cat details
    //implelement abstract method inherited from abstract animal superclass 
    @Override
    public void displayDetails() {
        System.out.println("Cat Details: ");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }

    //Override toString () method
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

    @Override
    public void makeSound() {
        System.out.println("meow");
    }
}
