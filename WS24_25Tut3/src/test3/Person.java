/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test3;

/**
 *
 * @author donat
 */
public class Person {
    private int age;
    

    public Person (int age) {
        if (age >= 0) {
            
            this.age = age;
        }
        else{
            System.out.println("wrong age!");
            System.exit(0);
        }
    }
    
    
}
