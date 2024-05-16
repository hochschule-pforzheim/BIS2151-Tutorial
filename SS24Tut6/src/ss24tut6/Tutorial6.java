
package ss24tut6;


/**
 * 
 * @author donata
 * This is the main class 
 */
public class Tutorial6 {

    /**
     * The main methods calls every other methods
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        
        ProfessorManager myManager = new ProfessorManager();    // object of Professor Manager class is created here
        
        myManager.quickSort();                                  // quickSort() method is called 
        
    }
}
