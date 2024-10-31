
package ws24tut2;
/**
*Taks: 
* Write a method that prints out the following result: (Pyramid made from stars) 
    *
    **
    ***
    ****
*/

/**
 *
 * @author donat
 */
public class WS24Tut2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        // one approach to create the pyramid
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // another approach to create the pyramid
        
        String s = "";
        for (int i = 0; i < 5; i++) {
            System.out.println(s);
            s = s + "*";
        }
    }
}
