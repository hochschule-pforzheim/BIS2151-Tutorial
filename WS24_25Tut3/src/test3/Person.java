
package test3;
/**
* Taks: 
* Create a new class called Person.
* A Person has an instance variable: an integer called age. 
* In the constructor a Person gets its  age. Age has to be bigger than 0. 
* Within the constructor, check if the provided age is correct. 
* Hint: what are control flows?

* If yes-> assign it:  this.age= age; 
* else-> print out an error message and use “System.exit(0); “
*/

/**
 *
 * @author donata
 */

public class Person {
    private int age;
    

    public Person (int age) {
        if (age >= 0) {
            
            this.age = age;
        }
        else{
            System.out.println("wrong age!");
            System.exit(0);
        }
    }
    
    
}
