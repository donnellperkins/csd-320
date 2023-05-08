/**
 *  dperkins_m10
 *  Creating multiple functions to calculate the average.
 *  
 */
public class Module10OverloadMethods {
    
    public static void main(String[] args) {
        double [] numbers = { 89.2, 45.1, 23.9, 20.2, 33.0, 45.6 };
    
        short avg1 = (short) (Module10OverloadMethods.average( numbers));
        int avg2 = (int) (Module10OverloadMethods.average( numbers));
        long avg3 = (long) (Module10OverloadMethods.average( numbers));
        double avg4 = (double) (Module10OverloadMethods.average( numbers));
        
        System.out.printf("The average of short: %d%n", avg1);
        System.out.printf("The average of int: %d%n", avg2);
        System.out.printf("The average of long: %d%n", avg3);
        System.out.printf("The average of double: %f%n", avg4);
        
    }
    
    public static short average (short [] array) {
            short total = 0;
            short avg;
            for (int i = 0; i < array.length; i++) {

                // Finding the sum of the numbers entered
                total += array[i];
            }
            avg = (short) (total / array.length);
            return avg;
    }

    public static int average (int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {

            // Finding the sum of the numbers entered
            total += array[i];
        }
        total = (int) (total / array.length);
        return total;
    }

    public static long average (long[] array) {
        long total = 0;
        for (int i = 0; i < array.length; i++) {

            // Finding the sum of the numbers entered
            total += array[i];
        }
        total = (long) (total / array.length);
        return total;
    }

    public static double average (double[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {

            // Finding the sum of the numbers entered
            total += array[i];
        }
        total = (double) (total / array.length);
        return total;
    }
}