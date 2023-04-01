/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rockPaperScissors;

/**
 * dperkins_m3RockPaperScissors
 * For this assignment we are generating random numbers and asking the user 
 * to enter a number to be compared to the random number generated to see who
 * won the game of Rock, Paper, Scissors.
 */
import java.util.Scanner;

public class rockPaperScissorAssign {
    
    public static String getShape() {
        String shape;
        
        switch((int)(Math.random() * 2 + 1)) {
            case 1 -> shape = "Rock";

            case 2 -> shape = "Paper";
            
            case 3 -> shape = "Scissor";
            
            default -> shape = "try_again";
        } 
        return shape;
    }
    
    public static String userResponse() {
        int userInput;
        String shape;
        Scanner input = new Scanner(System.in);
        
        System.out.println("\t1 is Rock\n\t2 is Paper\n\t3 is Scissors\n" +
                            "Please enter a NUMBER from the list above.");
        userInput = input.nextInt();
        
        switch(userInput){
            case 1 -> shape = "Rock";

            case 2 -> shape = "Paper";
            
            case 3 -> shape = "Scissor";
            
            default -> shape = "incorrect entry";
        }
        return shape;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to my version of Rock, Paper, Scissors");
        boolean tie_game;
        
        // Computer chooses a shape
        String computer_shuffle = getShape();
        // If the computer guesses try again we shufle one more time
        if (computer_shuffle == "try_again") {
             computer_shuffle = getShape();
        }
        // Ask the Player to make a guess
        String user = userResponse();
        
        // If the computer and user choose the same shape tie_game will be set to true 
        tie_game = computer_shuffle == user;

        if ((computer_shuffle == "Rock" && user == "Scissor") || 
            (computer_shuffle == "Scissor" && user == "Paper") ||
            (computer_shuffle == "Paper" && user == "Rock"))
        { // The Computer wins
            System.out.printf("You entered: %s and the computer entered: %s."+
                    " The Computer won the game", user, computer_shuffle);
        } else if (tie_game) { // Tie Game
            System.out.printf("You entered: %s and the computer entered: %s."+
                            " This is a tie game",user, computer_shuffle);
        } else if (user == "incorrect entry") { // Try to catch errors
            System.out.printf("Incorrect Entry, Automatic Loss");
        } else { // Player won the game
            System.out.printf("You entered: %s and the computer entered: %s."+
                      " The You WON the game!!", user, computer_shuffle);
        }  
    }
}
