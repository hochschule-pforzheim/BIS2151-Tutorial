/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ws24tut4;

import java.util.ArrayList;

/**
 *
 * @author donata
 */
public class WS24Tut4 {

    /**
     * this is the Main class
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // refers to ArrayList exercsie 
        ArrayListExercise.listTraining();      

        //refers to Max Value exercise 
        ArrayList<Integer> helloList = new ArrayList<>();
        helloList.add(3);
        helloList.add(7);
        helloList.add(2);
        helloList.add(9);
        helloList.add(5);

        int maxValue = ArrayListExercise.findMaxValue(helloList);
        System.out.println("The maximum value in the array List  is: " + maxValue);
    }

}
