/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Module9Arrays;

/**
 * dperkins_m9Arrays
 * For this assignment we are taking an array with 20 values and displaying the 
 * highest value, the lowest value, the avg of the values, and the sum of 
 * the values. 
 */
import java.util.Scanner;

public class ArrayDisplayMinMaxAvgSum {

    public static void main(String[] args) {
        double [] numbers = new double [20];
        double total = 0;
        double max = numbers[0];
        double min;
        double avg;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + numbers.length + " numbers to be calculated:\n");
        
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
            
            // Finding the sum of the numbers entered
            total += numbers[i];
            
            // Finding the largest number entered
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        // Initial min variable now that the numbers array has values.
        min = numbers[0];
        for (int j = 0; j < numbers.length; j++){
            // Finding the smallest number entered
            if (numbers[j] < min ) {
                min = numbers[j];
            }
        }
        // Finding the average of the numbers entered
        avg = total / 20;
        
        System.out.printf("The highest value entered: " + max + "\n");
        System.out.printf("The lowest value entered: " + min + "\n");
        System.out.printf("The average of values entered: " + avg + "\n");
        System.out.printf("The sum of the numbers entered: " + total + "\n");
    }
}
