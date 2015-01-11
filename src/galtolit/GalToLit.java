/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galtolit;

/**
 *
 * @author Debbi
 */
public class GalToLit {

    /**
    *Try This 1-1
    *This program converts gallons to liters.
    *Call this program GalToLit.java.
     */
    public static void main(String[] args) {
        double gallons; //contains number of gallons
        double liters; //cpontains number of liters
       
        gallons=10; //initializes number of gallons
        liters = gallons * 3.8754; //initializes number of liters
       
        //outputs the conversion to the screen
        System.out.println(gallons + " gallons is " + liters + " liters " );
    }
    
}
