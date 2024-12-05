/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ws24tut8;

import java.util.Scanner;

/**
 * Continued the CRUD Task: create a Library Manager that stores books in an
 * ArrayList and to implement the CRUD functions in the Code
 *
 * @author donata This is the Main Class
 */
public class WS24Tut8 {

    //the one and only main method - the control center/ tower at the airport :)
    public static void main(String[] args) {

        // Create a object of LibraryManager and name it hsPforzheim 
        LibraryManager hsPforzheim = new LibraryManager();
        
        // Infinite loop to continuously show the menu until the user decides to exit
        while (true) {
            libraryMenu(hsPforzheim);   // Call the menu method and pass the LibraryManager
        }
    }

    // Method to display the menu and perform actions based on user input
    public static void libraryMenu(LibraryManager hsPforzheim) {
        
        int i;  // Variable to store user input
        Scanner sc = new Scanner(System.in);    // Scanner object for user input

        System.out.println("Menu: "
                + "\naddBook            0"
                + "\nreadAllBooks       1"
                + "\nupdateBook         2"
                + "\ndeleteBook         3"
                + "\nsortByAuthor       4"
                + "\nsortByTitle        5"
                + "\nsortByIsbn         6"
                + "\nexit               default");
        System.out.println("Put an integer: ");
        try {
            i = sc.nextInt();        // Get the user's choice as an integer
            sc.nextLine();           // Move down one line. Important !!! after having used .nextInt()!!!
        } catch (Exception e) {      // Exception e = "Mother of all Exceptions", superclass of all Exceptions
            
            // Handle possible invalid input
             
            System.out.println(e);
            System.out.println("There has been an error!!!");
            i = -1;                 // Assign a default invalid value to trigger the default case
        }

         // Switch statement to handle user input and perform the corresponding action by calling the respective method depending on the users choice
        switch (i) {
            case 0:
                hsPforzheim.addBook();
                break;
            case 1:
                hsPforzheim.readAllBooks();
                break;
            case 2:
                hsPforzheim.updateBook();
                break;
            case 3:
                hsPforzheim.deleteBook();
                break;
            case 4:
                hsPforzheim.sortByAuthor();
                break;
            case 5:
                hsPforzheim.sortByTitle();
                break;
            case 6:
                hsPforzheim.sortByIsbn();
                break;
            default:
                System.out.println("Bye, see you soon!!!");
                System.exit(0);         // Terminate the program
        }
    }

}
