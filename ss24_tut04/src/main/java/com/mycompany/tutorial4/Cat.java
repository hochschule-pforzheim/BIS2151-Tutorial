/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial4;

/**
 *
 * @author Daniela
 */
class Cat {
    private String name;
    private int age;
    private int id;

    // Constructor
    public Cat(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

  
    // Getter and Setter methodes
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Katze{" +
                "name='" + name + '\'' +
                ", alter=" + age +
                ", id=" + id +
                '}';
    }

}
