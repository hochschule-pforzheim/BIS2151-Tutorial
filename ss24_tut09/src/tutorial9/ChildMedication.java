/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial9;

/**
 *
 * @author julius
 */
public class ChildMedication extends Medication {
    
    private double weight;

    public ChildMedication(double weight, String name, String description) {
        super(name, description);
        this.weight = weight;
    }
    
    @Override
    public void takeMedication() {
        System.out.println("Yuck that doesnt tast good.");
    }
    
    @Override
    public String toString(){
        return "Name: " + this.name + "\nMedNo: " + this.medNo + "\nDescription: " + this.description + "Weigh: " + this.weight;
    }
}
