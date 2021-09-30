/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution24
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.String.valueOf;

public class Solution24 {
    private static final Scanner in = new Scanner(System.in);

    private char[] string1, string2;
    private String n1, n2;

    // Reads in two strings from the user.
    private char[] readStringFromUser(String prompt) {
        System.out.print(prompt);
        return in.next().toCharArray();
    }

    // Takes in two character array parameters and determines if they are anagrams.
    public boolean isAnagram(char[] string1, char[] string2) {

        // First the function will compare the lengths of the strings.
        int l1 = string1.length;
        int l2 = string2.length;

        // If they are not the same length then they can't be anagrams of each other.
        if (l1 != l2) return false;

        // Next both arrays are sorted.
        Arrays.sort(string1);
        Arrays.sort(string2);

        // Run through the array indexes in a for loop comparing each index.
        for (int i = 0; i < l1; i++) {
            if (string1[i] != string2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution24 app = new Solution24();

        app.string1 = app.readStringFromUser("Enter the first string: ");
        app.n1 = valueOf(app.string1);
        app.string2 = app.readStringFromUser("Enter the second string: ");
        app.n2 = valueOf(app.string2);

        // An if statement will use the function call isAnagram
        if (app.isAnagram(app.string1, app.string2))

            // which will print the two anagram strings if true.
            System.out.printf("%s and %s are anagrams.", app.n1, app.n2);

        // Else will handle the false case.
        else
            System.out.printf("%s and %s are not anagrams.", app.n1, app.n2);
    }
}
