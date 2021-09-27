/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution25
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.util.Scanner;

public class Solution25 {
    private static final Scanner in = new Scanner(System.in);

    private String str1;

    // In function readStringFromUser:
    private String readStringFromUser() {

        // Contains a prompt for user to enter a password.
        System.out.print("Enter a password: ");

        // Reads in a string from the user.
        return in.nextLine();
    }

    // In function public int passwordValidator:
    public int passwordValidator(String str1) {
    /*  Separate approach:
        char ch;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        for(int i = 0; i < str1.length(); i++) {
                ch = str1.charAt(i);
                if( Character.isDigit(ch)) {
                    numberFlag = true;
                }
                else if (Character.isUpperCase(ch)) {
                    capitalFlag = true;
                } else if (Character.isLowerCase(ch)) {
                    lowerCaseFlag = true;
                }
                if(numberFlag && capitalFlag && lowerCaseFlag)
                    return true;
            }
            return false;
        } */
    int strength = 0;

    // If string length is less than 8 and contains only numbers, strength is 1.
    if (str1.length() < 8 && str1.matches("[0-9]+"))
        return strength + 1;
    // If string length is less than 8 and contains only letters, strength is 2.
    else if (str1.length() < 8 && str1.matches("[a-zA-Z]+"))
        return strength + 2;
    // If string length is at least 8, contains at least one number and contains letters, strength is 3.
    else if (str1.length() >= 8 && str1.matches("[a-zA-Z]+") && str1.matches("[0-9]+"))
        return strength + 3;
    // If string length is at least 8, contains numbers, contains letters and special characters, strength is 4.
    else if (str1.length() >= 8 && str1.matches("[a-zA-Z]+") && str1.matches("[0-9]+") && str1.matches("[`~!@#$%^&*()_+=]+"))
        return strength + 4;
    return strength;
    }

    // In main:
    public static void main(String[] args) {
        Solution25 app = new Solution25();

        app.str1 = app.readStringFromUser();

        // If function passwordValidator returned a 0
        if (app.passwordValidator(app.str1) == 1)
            System.out.printf("The password '%s' is a very weak password.", app.str1);

        // If function passwordValidator returned a 1
        if (app.passwordValidator(app.str1) == 2)
            System.out.printf("The password '%s' is a weak password.", app.str1);

        // If function passwordValidator returned a 2
        if (app.passwordValidator(app.str1) == 3)
            System.out.printf("The password '%s' is a strong password.", app.str1);

        // If function passwordValidator returned a 3
        if (app.passwordValidator(app.str1) == 4)
            System.out.printf("The password '%s' is a very strong password.", app.str1);
    }
}


