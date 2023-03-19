/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dperkins_m1compareLogic;

/**
 *dperkins_m1assignment
 * 
 * Writing a program will display the results of an equation, 
 * with and without decimals.
 */
public class compareLogic {
    // Returns the equations with decimals so the user can understand it
    public String withDecimal() {
        return "\nWith Decimals:\n4 x ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / "
                + "7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 ) =";
    }
    // Returns the equations without decimals so the user can understand it
    public String withoutDecimal() {
        return "\nWithout Decimals:\n4 x ( 1 - 1 / 3 + 1 / 5 - 1 / "
                + "7 + 1 / 9 - 1 / 11 + 1 / 13 ) =";
    }

    public static void main(String[] args) {
        // Prints the equation to the user
        System.out.println(new compareLogic().withDecimal());
        // Print the results of the equation 
        System.out.println(4 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 
                            9.0 - 1.0 / 11.0 + 1.0 / 13.0));
        
        // Prints the equation to the user
        System.out.println(new compareLogic().withoutDecimal());
        // Print the results of the equation
        System.out.println(4 * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 
                            1 / 13 ));
    }
}
