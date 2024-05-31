
package ss24tut6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Donata & Julius
 * feel free to write us an email if you have questions: 
 * 
 * Julius: troegele@hs-pforzheim.de
 * Donata: zwickdon@hs-pforzheim.de
 * 
 * this class manages a list of professors.
 */

public class ProfessorManager {

    /**
     * List of professors.
     */
    private ArrayList<Professor> profList = new ArrayList();

    /** 
     * Scanner object created for user input. 
     * Can be used within the class when instantiated at the beginning and not within a method. 
     */
    private Scanner sc = new Scanner(System.in);

    /** Constructor that calls method to add some base values.*/
    public ProfessorManager() {
        addBaseValues();
    }

    /**
     * Gets an integer from user input. Already includes Exception handling.
     * @return The integer input from the user.
     */
    public int getInt() {
        int i = -1;                                     // default value
        try {
            i = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong input format.");
        }
        return i;
    }

    /**
     * Gets a string from user input.
     * @return The string input from the user.
     */
    public String getString() {
        String s = null;                                // default value
        try {
            s = sc.next();
        } catch (Exception e) {
            System.out.print("Wrong input format.");
        }
        return s;
    }

    /**
     * Adds some default values to the list of professors.
     */
    public void addBaseValues() {
        addProf(1, "Burkard");
        addProf(9, "Schuler");
        addProf(4, "Schuster");
    }

    /**
     * Adds a professor object to the ArrayList.
     * @param profID The ID of the professor.
     * @param name The name of the professor.
     */
    public void addProf(int profID, String name) {
        Professor p = new Professor(profID, name);
        profList.add(p);
    }

    /**
     * Adds a professor to the ArrayList via user input. <p> Calls getInt() und getString() methods that perform exception handling. 
     */
    public void addProfWithUserInput() {
        System.out.print("Enter ID: ");
        int id = getInt();
        System.out.print("Enter Name: ");
        String name = getString();
        addProf(id, name);
        printAllProfs();
    }

    /**
     * Prints the details of one professor object.
     * @param index The index of the professor in the list.
     */
    public void printOneProf(int index) {
        Professor p = profList.get(index);
        int iD = p.getID();
        String name = p.getName();

        System.out.println("Professor ID: " + iD + "\nProfessor name: " + name);
    }

    /**
     * Prints the details of all professor objects in the list.
     */
    public void printAllProfs() {
        System.out.println("ArrayList contains:");
        for (int i = 0; i < profList.size(); i++) {
            printOneProf(i);
        }
    }

    /**
     * Updates the details of a professor object. <p> Calls getInt() und getString() methods that perform exception handling.
     * @param index The index of the professor in the list.
     */
    public void update(int index) {
        Professor p = profList.get(index);
        System.out.print("New ID: ");
        int id = getInt();
        System.out.print("New Name: ");
        String name = getString();
        profList.set(index, p);
    }

    /**
     * Removes a professor object from the list.
     * @param index The index of the professor in the list.
     */
    public void removeProf(int index) {
        profList.remove(index);
    }

    /**
     * Sorts the list of professors by ID. Import of java.util.Collections and java.util.Comparator necessary
     */
    public void quickSort() {
        Collections.sort(profList, Comparator.comparing(Professor::getID));
        System.out.println("The ArrayList has been sorted according to their ID!");
        printAllProfs();
    }
        public void sortByJava(){
        ProfComparator comp = new ProfComparator();                               // create a comparator object
        profList.sort(comp);
        System.out.println("The ArrayList has been sorted according to the Stalls' rating!");
        printAllProfs(); 
    }
}
}
