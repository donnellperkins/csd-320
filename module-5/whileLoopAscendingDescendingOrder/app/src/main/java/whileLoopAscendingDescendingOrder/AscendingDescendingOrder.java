/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whileLoopAscendingDescendingOrder;

/**
 * dperkins_m5whileLoop
 * Creating a while loop to display math operations in ascending and descending
 * order.
 */
import java.util.Scanner;

public class AscendingDescendingOrder {

    public static void main(String[] args) {
        int n = 1;
        double d = 0.0;
        
        Scanner input = new Scanner(System.in);
        
        int count = 1, stop_continue = 1;
        
        while (count < 3 && stop_continue != 0) {
          
            if (d < 3.0) {
                for (d = 3.0; d < 100.0; d +=2.0)
                {
                    double sum = n/d;
                    System.out.println(n+" / "+d+" = "+sum);
                } 
            } else if (d > 99.0) {
                for (d = 99.0; d > 2.0; d -=2.0)
                {
                    double sum = n/d;
                    System.out.println(n+" / "+d+" = "+sum);
                } 
            }
            count++;
            
            if (count > 2) {
                System.out.print("Please Enter 0 to STOP and 1 to Continue: ");
                stop_continue = input.nextInt();
                count = 1;
            }
        }
    }
}
