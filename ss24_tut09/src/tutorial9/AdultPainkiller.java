/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial9;

/**
 *
 * @author juliu
 */
public class AdultPainkiller  extends AdultMedication implements Painkiller{

    public AdultPainkiller(int age, String name, String description) {
        super(age, name, description);
    }

    @Override
    public void relivePain() {
        System.out.println("Doesnt hurt anymore!");
    }
    
}
