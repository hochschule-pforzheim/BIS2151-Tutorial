package test3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author donat
 */
public class ArrayTraining {
    public static void array(){
        int [] numbers = {1,2,3,4,5};
        
        numbers[0]=8;
        
        System.out.println("Array Length: " + numbers.length);
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    
    public static void lettersArray(){
        char[] letters = {'H','A','L','L','O'};
        //                 0   1   2   3   4 
        
        for (int i = letters.length-1; i >= 0; i--) {
            System.out.println(letters[i]);
        }
    }
    
}
