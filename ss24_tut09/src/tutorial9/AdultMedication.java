/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial9;

/**
 *
 * @author julius
 */
public class AdultMedication extends Medication{
    
    private int age;

    public AdultMedication(int age, String name, String description) {
        super(name, description);
        this.age = age;
    }
    

    @Override
    public void takeMedication() {
        System.out.println("Its better now.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "Name: " + this.name + "\nMedNo: " + this.medNo + "\nDescription: " + this.description + "Age: " + this.age;
    }
}
