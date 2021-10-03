/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution35
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {
    private static final Scanner in = new Scanner(System.in);

    private String name;
    private int n;

    public static void main(String[] args) {
        Solution35 app = new Solution35();

        ArrayList<String> contestants = new ArrayList<>();

        do {

            // Prompt for names of contestants until the user leaves the entry blank.
            app.name = app.readUserInput();

            // Store the names in an ArrayList. Not including the blank entry.
            if (!app.name.isEmpty()){

                contestants.add(app.name);
            }
            app.n = contestants.size();

        } while (!(app.name.equals("")));


        // Create a random number generator that will pick a winner from the array List.
        Random rand = new Random();
        int winner = rand.nextInt(app.n);

        System.out.printf("The winner is... %s", contestants.get(winner));
    }

    String readUserInput(){
        System.out.print("Enter a name: ");

        return in.nextLine();
    }
}
