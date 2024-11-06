/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws24tut4;

import java.util.ArrayList;

/**
 * In this class we practice the ArrayList
 * 
 * @author donata
 */
public class ArrayListExercise {
    
    //task: find the max value in an ArrayList 
    
     public static int findMaxValue(ArrayList<Integer> helloList) {
        
        int max = helloList.get(0); // Assume the first element is the maximum
        for (int i = 1; i < helloList.size(); i++) {
            if (helloList.get(i) > max) 
            {
                max = helloList.get(i); // Update max if a larger value is found
            }
        }
        return max;
    }
     
    // use of some build in methods 
     
     public static void listTraining(){
        ArrayList<Integer> myList = new ArrayList<>();
        
            // use a for loop for adding numbers 
        for (int i = 1; i <= 5; i++) {
            myList.add(i);
        }
        
        System.out.println("size of the array List: " + myList.size());
        
            // multiply index position 3 by 2
        
        myList.set(3, myList.get(3)*2);
        
            //print index position 3 
        
        System.out.println("List indedx position 3: " + myList.get(3));
        
            // print out whole arrayList
        
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        
    }

     
     
     
}
