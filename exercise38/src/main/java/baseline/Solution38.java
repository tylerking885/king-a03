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
    private int n;

    // Prompt for a list of numbers, separated by spaces.
    String readUserInput(){
        System.out.print("Enter a list of numbers, separated by spaces: ");

        return in.nextLine();
    }

    public static void main(String[] args) {
        Solution38 app = new Solution38();

        app.numbers = app.readUserInput();

        // Convert the input to an array.
        app.numbersArray = app.numbers.split(" ");

        // Have the program print out a new list containing only the even numbers.
        for (int i = 0; i < app.n; i++) {
            System.out.printf("The even numbers are %s", (Object) app.filterEvenNumbers(app.numbersArray));
        }

    }
    // Use a function called filterEvenNumbers to encapsulate the logic for this.
    // The function takes in the original array and returns the new array.
    int[] filterEvenNumbers(String[] numbersArray){
        Solution38 obj = new Solution38();

        int[] evenList = new int[numbersArray.length];
        int[] printEvenList = new int[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++){

            evenList[i] = Integer.parseInt(numbersArray[i]);
            if (evenList[i] %2 == 0){

                printEvenList[i] = evenList[i];
            }
        }
        obj.n = printEvenList.length;
        return printEvenList;
    }
}
