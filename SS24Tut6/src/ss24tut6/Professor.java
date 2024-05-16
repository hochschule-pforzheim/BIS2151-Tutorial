package ss24tut6;


/**
 * 
 * @author donata
 * This Class represents a professor with an ID and a name and serves as a blueprint 
 */
public class Professor {
    /**
     * The ID of the professor.
     */
    private int ID;

    /**
     * The name of the professor.
     */
    private String name;

    /**
     * Constructs a new Professor with the given ID and name.
     * @param ID The ID of the professor.
     * @param name The name of the professor.
     */
    public Professor(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    /**
     * Returns the ID of the professor.
     * @return The ID of the professor.
     */
    public int getID() {
        return ID;
    }

    /**
     * Sets the ID of the professor.
     * @param ID The new ID of the professor.
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Returns the name of the professor.
     * @return The name of the professor.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the professor.
     * @param name The new name of the professor.
     */
    public void setName(String name) {
        this.name = name;
    }
}

    
  /*
    // unnecessary, just an example
    @Override
    public String toString(){
        String s;
        s = "Professor ID: " + this.ID +"\nProfessor name: " + this.name;
        return s;
    }
*/

