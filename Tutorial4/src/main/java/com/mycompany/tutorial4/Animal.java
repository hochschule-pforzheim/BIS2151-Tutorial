/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial4;

/**
 *
 * @author Daniela
 */
public abstract class Animal {
  protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeNoise();
    
    // Getter and Setter methodes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}