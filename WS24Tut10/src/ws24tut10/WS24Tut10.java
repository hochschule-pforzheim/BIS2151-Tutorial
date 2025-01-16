/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ws24tut10;

import java.util.ArrayList;

/**
 *
 * @author donata
 */
//This is the (one and only) main Class 
public class WS24Tut10 {

    /**
     * @param args the command line arguments
     */
    
    //this is the (one and only) main method
     public static void main(String[] args) {
         
        Cat myCat = new Cat("Kitty", 3, 101);   // call constructor of Cat

        System.out.println(myCat);

        /*
        myCat.displayDetails();

        // Update details
        myCat.setAge(4);
        myCat.setId(102);
        System.out.println("Updated Cat Details:");
        myCat.displayDetails();
        
        //Version with toString method
        
        System.out.println(myCat);

        myCat.setAge(4);
        myCat.setId(102);
        System.out.println("Updated Cat: " + myCat);
        */
        
        RobotCat robotCat = new RobotCat("RoboKitty", 5, 202, 50); // call constructor of RobotCat 

        // Display details of RobotCat
        robotCat.displayDetails();

        // Charge the robotCat
        robotCat.charge();
        
        //Array List that stores differet types of objects. this is possible due to POLYMORPHISM
        // every Cat is also an Animal. And a RobotCat is also a Cat which is an animal  
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(myCat);
        animalList.add(robotCat);
        
        // a little for loop to iterate thourgh all elements of the array list and access their makesound methods. 
        // until now there are only two elemtns in the arrayList: myCat and robotCat 
         for (Animal animal : animalList) {
             animal.makeSound();
         }
    }

}
