/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PasswordCheckMethod;

/**
 * dperkins_m7validPassword
 * For this assignment we are checking that the password follows the password
 * rules/checks. 
 */
import java.util.Scanner;

public class PasswordCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        
        System.out.print("Valid password contains each of the following...\n" +
                "\tat least 8 charaters\n" + "\tboth letters and digits\n" +
                "\tone uppercase charater\n" + "\tone lowercase charater\n");

        System.out.print("Please Enter a password\n");
        password = input.next();
        
        boolean lc = PasswordCheck.lengthCheck(password);
        boolean dc = PasswordCheck.digitsCheck(password);
        boolean uc = PasswordCheck.uppercaseCheck(password);
        boolean lowc = PasswordCheck.lowercaseCheck(password);
        
        // If all checks come back True 
        if (lc && dc && uc && lowc) {
            System.out.printf("This is a VALID Password!\n");
        }
        
       
    }
    // Check the length of the Password
    public static boolean lengthCheck(String pass){
        
        int n = pass.length();
        if (n < 8){
            System.out.printf("Length of password too short\n");
            return false;
        } else {
            return true;
        }
    }
    
    // Check for numbers in the Password
    public static boolean digitsCheck(String pass2){
        
        if (!pass2.matches(".*\\d.*")){
            System.out.print("The password does not have a digit\n");
            return false;
        } else {
            return true;
        } 
    }
    
    // Check for upper case letters in the Password
    public static boolean uppercaseCheck(String pass3){
        if (!pass3.matches("^.*[A-Z].*$")){
            System.out.printf("The password does not have upper case\n");
            return false;
        } else {
            return true;
        } 
    }
    
    // Check for lower case letters in the Password
    public static boolean lowercaseCheck(String pass4){
        if (!pass4.matches("^.*[a-z].*$")){
            System.out.printf("The password does not have lower case\n");
            return false;
        } else {
            return true;
        } 
    }
}
