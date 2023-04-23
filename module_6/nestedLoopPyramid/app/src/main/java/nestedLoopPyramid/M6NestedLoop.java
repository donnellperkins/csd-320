/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nestedLoopPyramid;

/**
 * dperkins_m6nestedLoops
 * 
 * Using nested loops to create a pyramid of numbers.
 */
public class M6NestedLoop {
    
    public static void main(String[] args) {
                
        int t = 0, row = 7;
        
        for (int i = 1; i <= 64; i += i) {
            // Spaces at the beginning of each line
            for (int s = 0; s < row; s++) {
                System.out.print("    ");
            }
            // Left rows of pyramid
            for (int j = 1; j <= i; j += j) {
                System.out.printf("%4d", (j));
            }
            // Right rows of pyramid
            for (int x = t; x > 0; x /= 2) {
                System.out.printf("%4d", (x));
            }
            // Space at the end before @
            for (int v = 0; v < row; v++){
                System.out.print("    ");
            }
            
            System.out.print("@");

            
            t = i;
            --row;
            System.out.println();
        } 
    }
}
