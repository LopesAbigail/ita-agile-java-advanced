/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author conta
 */
public class Count {
    
    private int currentNumber = 0;
    private String name;
    
    public Count(String name) {
        this.name = name;
    }
    
    public void toCount() {
        currentNumber++;
    }
    
    public String toString() {
        return name + " = " + currentNumber;
    }
}
