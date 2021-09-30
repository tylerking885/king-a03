/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution28
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.util.Scanner;

public class Solution28 {
    private static final Scanner in = new Scanner(System.in);

    private String Number;
    private int number;

    // Prompts user for number and returns said number.
    private int getNumber(){
        Solution28 application = new Solution28();
        System.out.print("Enter a number: ");

        // Inputs a string.
        application.Number = in.nextLine();

        // Parses the string into an integer.
        application.number = Integer.parseInt(application.Number);

        return application.number;
        }

    // Calculates and returns a sum.
    public double calcSum(){
        Solution28 app = new Solution28();
        double sum = 0;

        // Loops through the 5 numbers.
        for (int i = 0; i < 5; i++){

            // Each loop the user will be prompted for a number.
           sum += app.getNumber();

        }
        return sum;
    }
    // The total will be printed at the end in main.
    public static void main(String[] args) {
        Solution28 obj = new Solution28();

        System.out.printf("The total is %.0f.", obj.calcSum());
    }
}
