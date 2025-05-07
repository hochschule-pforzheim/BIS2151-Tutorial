/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws24tut5crud;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author donata
 */
public class LibraryManager {
    //this ArrayList stores objects of type Book and has the name "Library"
    private ArrayList<Book> Library = new ArrayList<>();
    // a scanner with the name "sc" to take user input
    private Scanner sc = new Scanner(System.in);
    
    
    // first CRUD functionality: Create
    public void addBook(){
        String author, isbn, title;
        System.out.println("Input books Author: ");
        author = sc.nextLine();
        System.out.println("Input books isbn: ");
        isbn = sc.nextLine();
        System.out.println("Input books title: ");
        title = sc.nextLine();
        
        Book mobyDick = new Book(author, isbn, title);
        Library.add(mobyDick);
    }
    // Second CRUD functionality: Read
    public void readAllBooks(){
        for (int i = 0; i < Library.size(); i++) {
            Book mobyDick = Library.get(i);
            System.out.println("---------------------------");
            System.out.println("Autor: " + mobyDick.getAuthor());
            System.out.println("Isbn : " + mobyDick.getIsbn());
            System.out.println("title: " + mobyDick.getTitle());
        }
    }
    
    // Third CRUD functionality: Update
    public void updateBook(){
        // code to be completed next tutorial
    }
    
    // Fourth CRUD functionality: Delete
    public void deleteBook(){
        // code to be completed next tutorial
        
    }
}
