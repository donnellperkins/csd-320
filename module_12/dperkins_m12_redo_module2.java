/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boilingWater;

/**
 * Calculating the energy needed to heat water from an initial temperature
 * to a final temperature.
 */
import java.util.*;

public class dperkins_m2boilingWater {

    public static void main(String[] args) {
        double Q;
        double initial_temp;
        double final_temp;
        double waterMass;
        double t;
        
        Scanner input = new Scanner(System.in);
        
        // Ask the user for the amount of water 
        System.out.print("\nHow much water, measured in kilograms?:\n");
        waterMass = input.nextDouble();
        
        // Ask the user for the intital temp in Fahrenheit
        System.out.print("What is the inital temperture, measured in fahrenheit?:\n");
        initial_temp = celsius(input.nextDouble());
                
        // Ask the user for the final temp in Fahrenheit
        System.out.print("What is the final temperture, measured in fahrenheit?:\n");
        final_temp = celsius(input.nextDouble());
        t = final_temp - initial_temp;

        // Converting the results into Joules. Q is the energy needed
        // to heat water.
        Q = (waterMass * 4.18 * t);
        
        // Print the equation and results to the user
        System.out.println("\nQ = waterMass x 4.18 x (final_temp - initial_temp)");
        System.out.println("\tQ = " + Q);
                        
    }
    
    // Convert user Fahrenheit input into Celsius
    static double celsius(double f)
    {
        double c;
        // Equation to convert fahrenheit to celsius
        c = (f - 32) * 5/9;
        return c;
    }
}