/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution25
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.util.Scanner;

public class Solution25 {
    private static final Scanner in = new Scanner(System.in);

    private String str1;

    // Returns a string.
    private String readStringFromUser() {

        // Contains a prompt for user to enter a password.
        System.out.print("Enter a password: ");

        // Reads in a string from the user.
        return in.nextLine();
    }
    // Determines the strength of a given password and returns an integer accordingly.
    public int passwordValidator(String str1) {

        char ch;
        int capitalFlag = 0;
        int lowerCaseFlag = 0;
        int numberFlag = 0;
        int strength = 0;
        int specialFlag = 0;
        String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";
        String[] str2 = str1.split("");

    // Loop through each character in the string.
    for(int i = 0; i < str1.length(); i++) {

        // returns a character at a specific position in string and sets it in ch.
        ch = str1.charAt(i);

        // Checks for a number, and flags when it finds one.
        if (Character.isDigit(ch)) {
            numberFlag = 1;

        }
        // Checks for an uppercase letter, and flags when it finds one.
        else if (Character.isUpperCase(ch)) {
            capitalFlag = 1;
        }
        // Checks for a lowercase letter, and flags when it finds one.
        else if (Character.isLowerCase(ch)) {
            lowerCaseFlag = 1;
        }
        // Checks for a special character, and flags when it finds one.
        else if (specialChars.contains(str2[i])) {
            specialFlag = 1;
        }
    }

    // If string length is less than 8 and contains only numbers, strength is 1.
    if ((str1.length() < 8) && numberFlag == 1)
        return strength + 1;

    // If string length is less than 8 and contains only letters, strength is 2.
    else if ((str1.length() < 8) && (capitalFlag == 1 || lowerCaseFlag == 1))
        return strength + 2;

    // If string length is at least 8, contains at least one number and contains letters, strength is 3.
    else if ((str1.length() >= 8) && (capitalFlag == 1 || lowerCaseFlag == 1) && (numberFlag == 1) && (specialFlag == 0))
        return strength + 3;

    // If string length is at least 8, contains numbers, contains letters and special characters, strength is 4.
    else if ((str1.length() >= 8) && (numberFlag == 1) && (specialFlag == 1) && (capitalFlag == 1 || lowerCaseFlag == 1) )
        return strength + 4;

    return strength;
    }

    public static void main(String[] args) {
        Solution25 app = new Solution25();

        app.str1 = app.readStringFromUser();

        // If function passwordValidator returned a 1
        if (app.passwordValidator(app.str1) == 1)
            System.out.printf("The password '%s' is a very weak password.", app.str1);

        // If function passwordValidator returned a 2
        if (app.passwordValidator(app.str1) == 2)
            System.out.printf("The password '%s' is a weak password.", app.str1);

        // If function passwordValidator returned a 3
        if (app.passwordValidator(app.str1) == 3)
            System.out.printf("The password '%s' is a strong password.", app.str1);

        // If function passwordValidator returned a 4
        if (app.passwordValidator(app.str1) == 4)
            System.out.printf("The password '%s' is a very strong password.", app.str1);
    }
}