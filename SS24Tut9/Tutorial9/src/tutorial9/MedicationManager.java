/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial9;

import java.util.ArrayList;

/**
 *
 * @author julius
 */
public class MedicationManager {
    private ArrayList<Medication> medList = new ArrayList<>();
    
    public void printMeds(){
        for (int i = 0; i < medList.size(); i++) {
            System.out.println(medList.get(i).toString());      //  with overriden toString methode  
        }
    }
    
    public void addBaseValues(){
        Medication e = new ChildPainkiller(0, "i", "jfsndf");
        medList.add(e);
        Medication f = new AdultMedication(3, "nown", "idnfasi");
        medList.add(f);
        Medication r = new ChildMedication(0, "dfhas", "dhfsaifei");
        medList.add(r);
        Medication k = new AdultPainkiller(0, "17", "hfie");
        medList.add(k);
    }
}
