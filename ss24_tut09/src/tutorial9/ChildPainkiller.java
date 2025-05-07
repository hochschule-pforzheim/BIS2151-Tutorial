/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial9;

/**
 *
 * @author juliu
 */
public class ChildPainkiller extends ChildMedication implements Painkiller{

    public ChildPainkiller(double weight, String name, String description) {
        super(weight, name, description);
    }
    
    public void relivePain() {
        System.out.println("Stops crying.");
    }
    
}
