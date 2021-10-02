/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution33
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution33 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution33 app = new Solution33();

        // An array will be used to hold 4 responses.
        ArrayList<String> responses = new ArrayList<>();
        responses.add("Yes,");
        responses.add("No,");
        responses.add("Maybe,");
        responses.add("Ask again later.");

        // A random number generator responds with 1 - 4.
        Random rand = new Random();
        int choice = rand.nextInt(3);

        app.readUserInput();
        System.out.println();

        // Based on the response in an array a choice will be issued to the user.
        System.out.println(responses.get(choice));

    }
    // Asks user a question.
     void readUserInput(){
        System.out.println("What's your question? ");
         in.nextLine();
     }
}
