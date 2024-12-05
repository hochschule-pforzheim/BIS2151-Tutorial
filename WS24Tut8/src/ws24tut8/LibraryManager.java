/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws24tut8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author donata
 */
public class LibraryManager {

    //this ArrayList stores objects of type Book and has the name "Library"
    private ArrayList<Book> Library = new ArrayList<>();
    // a scanner object with the name "sc" to take user input
    private Scanner sc = new Scanner(System.in);
    
    // Adds a base set of predefined book objects to the library. This is useful for initializing the library with some sample data
    public void addBase(){
        Book e = new Book("Dostojewski", "123456", "Crime and Punishment");
        Library.add(e);
        Book d = new Book("Jane Austin", "437675" , "Pride and Prejudice");
        Library.add(d);
        Book f = new Book("J. K. Rowling", "345687", "Harry Potter");
        Library.add(f);
    }

    //Constructor for the LibraryManager class. Automatically calls the addBase() method from above to initialize the library with predefined books.
     
    public LibraryManager() {
        addBase();
    }

    // first CRUD functionality: Create - Adds a new book to the library
    public void addBook() {

        // Declare variables to hold the book details which will be put in by the user
        String author, isbn, title;

        // Prompt user to put the book's detailsin the console  
        System.out.println("Input books Author: ");
        author = sc.nextLine();
        System.out.println("Input books isbn: ");
        isbn = sc.nextLine();
        System.out.println("Input books title: ");
        title = sc.nextLine();

        // Create a new Book object with the provided details
        Book mobyDick = new Book(author, isbn, title);

        // Add the Book object to the library
        Library.add(mobyDick);
    }

    // Second CRUD functionality: Read - Displays all books in the library
    public void readAllBooks() {

        // Iterate through each Book in the Library ArrayList
        for (int i = 0; i < Library.size(); i++) {

            // Get the current Book object
            Book mobyDick = Library.get(i);

            // Print details of the current Book
            System.out.println("---------------------------");
            System.out.println("Autor: " + mobyDick.getAuthor());
            System.out.println("Isbn : " + mobyDick.getIsbn());
            System.out.println("title: " + mobyDick.getTitle());
        }
    }

    // Third CRUD functionality: Update - Updates details of a specific book
    public void updateBook() {

        int i;
        System.out.println("input interger for index of book to be changed: ");  // Prompt user for the index of the book to update

        // Handle possible user input errors with exception handling 
        try {
            i = sc.nextInt(); // Get index from user
            //important:
            sc.nextLine(); // Move down one line. Important !!! after having used .nextInt()!!!
        } catch (Exception e) {
            System.out.println("An error has occured !!!");
            System.out.println(e);

            i = 0; // Default to the first book if input fails
        }

        Book mobyDick = Library.get(i);

        System.out.println("Autor: " + mobyDick.getAuthor());
        System.out.println("Isbn : " + mobyDick.getIsbn());
        System.out.println("title: " + mobyDick.getTitle());

        // Prompt user for new details
        System.out.println("Input new Author: ");
        String newAuthor = sc.nextLine();
        mobyDick.setAuthor(newAuthor);

        System.out.println("Input new ISBN: ");
        String newIsbn = sc.nextLine();
        mobyDick.setIsbn(newIsbn);

        System.out.println("Input new Title: ");
        String newTitle = sc.nextLine();
        mobyDick.setTitle(newTitle);

        // Display updated details of the book
        System.out.println("Updated Book: ");
        System.out.println("");

        System.out.println("Autor: " + mobyDick.getAuthor());
        System.out.println("Isbn : " + mobyDick.getIsbn());
        System.out.println("title: " + mobyDick.getTitle());
    }

    // Fourth CRUD functionality: Delete
    public void deleteBook() {

        int index;

        System.out.println("Input index of book to be deleted: ");
        try {
            index = sc.nextInt(); // Get index from user
            //important
            sc.nextLine();  // Move down one line. Important !!! after having used .nextInt()!!!
        } catch (Exception e) {
            System.out.println("Error ocured!!!");
            System.out.println(e);
            index = -1;     // Set index to invalid value if input fails
        }
         // Check if the index is valid, i.e. if book at that position even exists 
        if (index >= 0 && index < Library.size()) {
            Library.remove(index);
        }
        // Display all remaining books in the library by calling the method that we implemented above 
        readAllBooks();
    }
    
    // Sort the ArrayList with the name Library by the author name in ascending order
    public void sortByAuthor(){
        
        /**
         * Collections.sort() 
         * is a utility method from the java.util.Collections class which we had to import s.o. 
         * It sorts the elements of a list (in this case, the Library ArrayList) based on a specified comparator.
         */
        
        /**
         * Comparator.comparing()
         * is a static method from the Comparator interface in java.util.Comparator  which we had to import s.o.
         * It creates a Comparator object that compares objects based on a specific key 
         * In this case, the key is the title attribute of the Book object
         */
        
        /**
         * Book::getTitle -> the two Colon punctuation marks are like a "fancy for loop". 
         * It iterates through all the book objects stored in our ArrayList and uses the getTitle() method from the book class
         * and retrieves the title of every book stored.
         */
        
        Collections.sort(Library, Comparator.comparing(Book::getAuthor));
        System.out.println("The list has been sorted by Author: ");
        this.readAllBooks();            // Call the readAllBooks() method to display the sorted list
    }
    
    public void sortByTitle(){
        Collections.sort(Library, Comparator.comparing(Book::getTitle));
        System.out.println("The list has been sorted by Title: ");
        readAllBooks();
    }
    
    public void sortByIsbn(){
        Collections.sort(Library, Comparator.comparing(Book::getIsbn).reversed());
        System.out.println("Sorted by Isbn");
        readAllBooks();
    }
}
