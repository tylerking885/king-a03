/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution29
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution29 {

    // Demonstrates throwing an exception when a division by 0 occurs.
    public static int InvestmentCalc(int r)
        throws ArithmeticException{

        // Here is where the possible incorrect inputs will occur.
        return 72 / r;

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        boolean continueLoop = true;

        do{
            try{   // Prompt User for the rate.
                System.out.print("What is the rate of return? ");

                // Set r to user input.
                int r = in.nextInt();

                // Set years to InvestmentCalc method return.
                int years = InvestmentCalc(r);
                System.out.printf("It will take %d years to double your initial investment.", years);

                // This will break the loop.
                continueLoop = false;
            }
            // Handles a case where user enters anything other than integers.
            catch (InputMismatchException inputMismatchException){
                System.out.printf("Sorry. That's not a valid input.%n");

                // This discards user input.
                in.nextLine();
            }
            // Handles a case where user enters 0.
            catch (ArithmeticException arithmeticException){
                System.out.printf("Sorry. That's not a valid input.%n");
            }
        } while (continueLoop);
    }
}