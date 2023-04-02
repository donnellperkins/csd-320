/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subString;

/**
 * dperkins_m4substrings
 * For this assignment we are reporting to the user if the two given strings are
 * subsets of each other.
 */
import java.util.Scanner;
        
public class subStringAssign {

    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        String os1;
        String os2;
        
        //Ask the user for top 2 Operating Systems
        System.out.print("Of the popular Operating Systems, MacOS, Windows, Linux" +
                ", Which is your number 1 choice?\n");
        os1 = input.nextLine();
        System.out.print("Of the popular Operating Systems, MacOS, Windows, Linux" +
                ", Which is your number 2 choice?" +
                "\nYou can choose the same answer as the 1 choice.\n");
        os2 = input.nextLine();
        
        // The string of letters of os2 can be found in os1
        if (os1.contains(os2)) 
        {
            System.out.printf("The second string: %s is a substring of the" +
                    " first string: %s", os2, os1);
        }
        // The string of letters of os1 can be found in os2
        else if (os2.contains(os1)) 
        {
            System.out.printf("The first string: %s is a substring of the" +
                    " second string: %s", os1, os2);
        }
        // The sting of letters of either string can not be found in each other
        else
        {
            System.out.printf("You chose OS: %s & OS: %s," +
                    " which are not subsets of each other", os2, os1);
        } 
    }
}
