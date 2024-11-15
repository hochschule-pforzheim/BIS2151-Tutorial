/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ws24tut5crud;

/**
 * Task: create a Library Manager that stores books in an ArrayList and to implement the CRUD functions in the Code
 * @author donata
 * This is the Main Class
 */
public class WS24Tut5CRUD {

    //the one and only main method - the control center/ tower at the airport :) 
    
    public static void main(String[] args) {
       
        LibraryManager hsPforzheim = new LibraryManager();
        hsPforzheim.addBook();
        hsPforzheim.addBook();
        hsPforzheim.readAllBooks();
    }
    
}
