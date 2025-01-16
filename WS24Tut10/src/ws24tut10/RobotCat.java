/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws24tut10;

/**
 *
 * @author donata
 */
public class RobotCat extends Cat implements Robot {

    private int batteryLevel;

    //Constructor of Robotcat, includes inherited attributes of super class cat and new attribute battery level 
    public RobotCat(String name, int age, int id, int batteryLevel) {
        super(name, age, id);
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    
    @Override   //implemented abstract method inherited from Animal 
    public String getName() {
        return name;
    }

    @Override   // implemented abstract method inherited from Animal 
    public void setName(String name) {
        this.name = name;
    }

    // implemented abstract method from Robot interface
    @Override
    public void charge() {
        System.out.println(getName() + " is charging...");
        batteryLevel = 100;
        System.out.println("Battery fully charged.");
    }

    // implemented the abstract method inherited from Animal 
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
    
    //overridden method inherited from Cat
     @Override
    public void makeSound() {
        System.out.println("robo meow");
    }
}
