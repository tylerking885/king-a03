/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution32
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.util.Random;
import java.util.Scanner;

public class Solution32 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        Solution32 app = new Solution32();

        // Print out welcome statement.
        System.out.printf("Let's play Guess the Number!%n%n");

        String choice;

        do{
            int difficulty, answer, guess, max = 0, counter = 0;

            // Prompt the user to enter a difficulty. (ranges from 1 to 3).
            difficulty = app.readDifficultyFromUser();

            // If user chooses 1 generate a number from a set of values between 1 and 10.
            if (difficulty == 1){
                max = 10;
            }
            // If user chooses 2 generate a number from a set of values between 1 and 100.
            else if (difficulty == 2){
                max = 100;
            }
            // If user chooses 3 generate a number from a set of values between 1 and 1000.
            else if (difficulty == 3){
                max = 1000;
            }
            Random rand = new Random();

            boolean correct = false;

            answer = rand.nextInt(max) + 1;

            System.out.print("I have my number. What's your guess? ");

            while (!correct) {

                guess = in.nextInt();

                // If guess is higher than actual.
                if (guess > answer) {
                    System.out.print("Too high, try again: ");

                    counter++;
                }

                // If guess is less than actual
                else if (guess < answer) {
                    System.out.print("Too low, try again: ");

                    counter++;
                }

                // Guess is equal to actual value
                else {
                    // When the user enters the correct value display how many tries this took.
                    System.out.printf("You got it in %d guesses!%n", counter);
                    correct = true;
                }
            }
            // Prompt the user if they wish to play again.
            System.out.println("Do you wish to play again (Y/N)?");
            choice = in.next();

        } while ((choice.equals("y") || choice.equals("Y")));
    }

    int readDifficultyFromUser(){

        System.out.print("Enter the difficulty level (1, 2, or 3): ");

        return in.nextInt();
    }

}
