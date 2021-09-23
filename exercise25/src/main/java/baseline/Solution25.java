/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution25
 *  Copyright 2021 Tyler King
 */

package baseline;

public class Solution25 {
    // In function readStringFromUser:
    // Contains a prompt for user to enter a password.
    // Reads in a string from the user.

    // In function public int passwordValidator:
    // The function is used to determine the strength of the entered password from user.
    // The function takes in the string entered by the user as a parameter.
    // The function will initially take a string length and if the length is
    // less than or equal to 5 then add 1 to a strength counter.
    // Next check for numbers in the string. If the string contains numbers add 1 again to strength counter.
    // Finally, check for special characters in the string. If this comes back true then add 1 more to strength counter.

    // In main:
    // If function passwordValidator returned a 0 then print the string entered by user with message "is a very weak password."
    // If function passwordValidator returned a 1 then print the string entered by user with message "is a weak password."
    // If function passwordValidator returned a 2 then print the string entered by user with message "is a strong password."
    // If function passwordValidator returned a 3 then print the string entered by user with message "is a very weak password."
}
