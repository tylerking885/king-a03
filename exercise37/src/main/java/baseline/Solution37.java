/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution37
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.security.SecureRandom;
import java.util.Scanner;

public class Solution37 {
    private static final Scanner in = new Scanner(System.in);

    private int n, j, numSpecial, numNumber, numLetters;

    // Store set of special characters in a string array list.
    static char[] SYMBOLS = "^$*.[]{}()?-\"!@#%&/\\,><':;|_~`".toCharArray();

    // Store set of letters in a string array list.
    static char[] LETTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    // Store set of numbers in a string array list.
    static char[] NUMBERS = "0123456789".toCharArray();

    static SecureRandom rand = new SecureRandom();

    public static void main(String[] args) {
        Solution37 app = new Solution37();

        // Prompt the user for a minimum password length.
        app.n = app.readIntFromUser("What's the minimum length? ");
        System.out.printf("Your password is %s", getPassword(app.n));
    }

    public static String getPassword(int length) {
        Solution37 obj = new Solution37();

        // Prompt the user for number of special characters.
        obj.numSpecial = obj.readIntFromUser("How many special characters? ");

        // Prompt the user for number of numbers.
        obj.numNumber = obj.readIntFromUser("How many numbers? ");

        // Ensure that there are at least as many letters are there are special characters and number.
        obj.numLetters = Math.max(obj.numSpecial, obj.numNumber);

        assert length >= obj.n - obj.numSpecial - obj.numNumber - obj.numLetters;
        char[] password = new char[length];

        // Place required amount special characters in array.
        for (int i = 0; i < obj.numSpecial + 1; i++){
            password[i] = SYMBOLS[rand.nextInt(SYMBOLS.length)];
            obj.j = i;
        }
        // Place required amount of numbers in array.
        for (int i = 0; i < obj.numNumber; i++){
            password[obj.j] = NUMBERS[rand.nextInt(NUMBERS.length)];
            obj.j ++;
        }
        // Place required amount letters in array.
        for (int i = 0; i < obj.numLetters; i++){
            password[obj.j] = LETTERS[rand.nextInt(LETTERS.length)];
            obj.j ++;
        }
        // Populate rest of the password with random chars
        for (int i = obj.j; i < length; i++) {
            password[i] = LETTERS[rand.nextInt(LETTERS.length)];
        }
        // Shuffle up password elements.
        for (int i = 0; i < password.length; i++) {
            int randomPosition = rand.nextInt(password.length);
            char temp = password[i];
            password[i] = password[randomPosition];
            password[randomPosition] = temp;
        }
        return new String(password);
    }

    private int readIntFromUser(String prompt){
        System.out.print(prompt);
        return in.nextInt();
    }
}
