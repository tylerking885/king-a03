/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution38
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.util.Scanner;

public class Solution38 {
    private static final Scanner in = new Scanner(System.in);

    private String numbers;
    private String[] numbersArray;
    private int[] printEvenList;
    int n;

    public static void main(String[] args) {
        Solution38 app = new Solution38();

        // Prompt for a list of numbers, separated by spaces.
        app.numbers = app.readUserInput();

        // Convert the input to an array eliminating spaces.
        app.numbersArray = app.numbers.split(" ");

        // Setting printEvenList to filterEvenNumbers return value.
        app.printEvenList = app.filterEvenNumbers(app.numbersArray);

        System.out.print("The even numbers are");

        // Iterate through new array and print each value.
        for (int i = 0; i < app.n; i++){
            System.out.printf(" %d", app.printEvenList[i]);
        }

        System.out.print(".");
    }

    String readUserInput(){
        System.out.print("Enter a list of numbers, separated by spaces: ");

        return in.nextLine();
    }

    // The function takes in the original array.
    int[] filterEvenNumbers(String[] numbersArray){

        int[] evenList = new int[numbersArray.length];
        int[] printEvenList = new int[numbersArray.length];
        int j = 0;

        // Iterate through original array.
        for (int i = 0; i < numbersArray.length; i++) {

            // Parse the string values into integers.
            evenList[i] = Integer.parseInt(numbersArray[i]);

            // The if statement checks for even numbers.
            if (evenList[i] %2 == 0) {

                // When found store the even value in index j.
                printEvenList[j] = evenList[i];

                // Increment index after storing.
                j++;
            }
        }
        // Set global variable n to j the number of even elements.
        n = j;

        // Return the new array.
        return printEvenList;
    }
}