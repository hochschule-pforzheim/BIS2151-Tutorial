package test3;

/*
* Tasks: 
* Create a static method with an Array which only consists of single integers holding the values {1, 2, 3, 4, 5}.
* Replace the value 1 with value 8,  adressing this change by using the index.
* How long is the Array? Hint: What is its length? 
* Print the Array as console output by using a loop.
 */

/**
 *
 * @author donata
 */
public class ArrayTraining {
    public static void array(){
        int [] numbers = {1,2,3,4,5};
        
        numbers[0]=8;        //change value
        
        System.out.println("Array Length: " + numbers.length);    //find out length 

        //print array
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    //print out array in reverse
    
    public static void lettersArray(){
        char[] letters = {'H','A','L','L','O'};
        //                 0   1   2   3   4     index positions
        
        for (int i = letters.length-1; i >= 0; i--) {
            System.out.println(letters[i]);
        }
    }
    
}
