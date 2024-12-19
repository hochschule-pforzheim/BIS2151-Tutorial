/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ws24tut9;

/**
 *
 * @author donata
 * This is the main class
 */
public class WS24Tut9 {

    /**
     * @param args the command line arguments
     * this is the one and only main method 
     */
    public static void main(String[] args) {
        
        Cat myCat = new Cat("Kitty", 3, 101);
        
        //Print Cat details with a method we wrote by ourselves
        myCat.displayDetails();

        // Update details
        myCat.setAge(4);
        myCat.setId(102);
        System.out.println("Updated Cat Details:");
        myCat.displayDetails();
        
        
        //Print cat details Version with overridden toString () method
        
        System.out.println(myCat);

        // Update details
        myCat.setAge(4);
        myCat.setId(102);
        System.out.println("Updated Cat: " + myCat);
        
        
        
    }
    
}
