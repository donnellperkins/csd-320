/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Module11locatofBigSmall;

/**
 * dperkins_m11
 * 
 * Working with one-dimensional array
 * 
 */
public class LocationOfBigSmallElement {

    public static void main(String[] args) {
        double [][] percentage = {{1.2, 2.3},{5.2, 4.1}, {8.6, 10.3}};
        int [][] numbers = {{1, 3}, {4, 2}, {6, 5}, {9,0}};
        
        // Finding The location of the largest using a double array
        int [] array_loc = locateLargest(percentage);
        System.out.printf("Location of largest Index(double) is: (%d, %d)%n%n", array_loc[0], array_loc[1]);
        // Finding The location of the largest using a int array
        int [] array_loc1 = locateLargest(numbers);
        System.out.printf("Location of largest Index(int) is: (%d, %d)%n%n", array_loc1[0], array_loc1[1]);
        
        // Finding The location of the smallest using a double array
        int [] array_loc2 = locateSmallest(percentage);
        System.out.printf("Location of smallest Index(double) is: (%d, %d)%n%n", array_loc2[0], array_loc2[1]);
        // Finding The location of the smallest using a int array
        int [] array_loc3 = locateSmallest(numbers);
        System.out.printf("Location of smallest Index(int) is: (%d, %d)%n", array_loc3[0], array_loc3[1]);
    }
    
    public static int [] locateLargest (double[][] arrayParam) {
        int  [] lrg_array_loc = new int [] {0, 0};
        double max = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int k = 0; k < arrayParam[i].length; k++) {
                if ( max < arrayParam[i][k]) {
                    max = arrayParam[i][k] ;
                    lrg_array_loc[0] = i;
                    lrg_array_loc[1] = k;
                    
                }
            }
        }
        return lrg_array_loc;
    }
    
    public static int [] locateLargest (int[][] arrayParam) {
        int  [] lrg_array_loc1 = new int [] {0, 0};
        int max1 = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int k = 0; k < arrayParam[i].length; k++) {
                if ( max1 < arrayParam[i][k]) {
                    max1 = arrayParam[i][k] ;
                    lrg_array_loc1[0] = i;
                    lrg_array_loc1[1] = k;
                    
                }
            }
        }
        return lrg_array_loc1;
    }
    
    public static int [] locateSmallest (double[][] arrayParam) {
        int  [] sml_array_loc = new int [] {0, 0};
        double min = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int k = 0; k < arrayParam[i].length; k++) {
                if ( min > arrayParam[i][k]) {
                    min = arrayParam[i][k] ;
                    sml_array_loc[0] = i;
                    sml_array_loc[1] = k;
                    
                }
            }
        }
        return sml_array_loc;
    }
    
    public static int [] locateSmallest (int[][] arrayParam) {
        int  [] sml_array_loc1 = new int [] {0, 0};
        int min1 = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int k = 0; k < arrayParam[i].length; k++) {
                if ( min1 > arrayParam[i][k]) {
                    min1 = arrayParam[i][k] ;
                    sml_array_loc1[0] = i;
                    sml_array_loc1[1] = k;
                    
                }
            }
        }
        return sml_array_loc1;
    }
}
