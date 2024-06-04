/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial9;

/**
 *
 * @author julius
 */
abstract class Medication {
    protected static int nextMedNo = 0;     //static counter Variable 
    protected int medNo;
    protected String name;
    protected String description;

    public Medication(String name, String description) {
        this.name = name;
        this.description = description;
        this.medNo = nextMedNo ++;      //counter incremented whenever new item addem
    }
    
    public abstract void takeMedication();

    public int getMedNo() {
        return medNo;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
