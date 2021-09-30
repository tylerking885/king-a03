/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution27
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.util.Scanner;

public class Solution27 {
    private static final Scanner in = new Scanner(System.in);

    private String str1, str2, str3, str4;

    // Function() that returns a string which will prompt user for certain entries.
    private String readStringFromUser(String prompt) {

        // Contains a prompt for user to enter a password.
        System.out.print(prompt);

        // Returns a string from the user.
        return in.nextLine();
    }

    // Function to determine if a character was entered for first name.
    public boolean validateFirstNameFill(String str1){
        if (str1.length() == 0){
            System.out.print("The first name must be filled in.");
            return true;
        }
        return false;
    }

    // Function to determine if a character was entered for last name.
    public boolean validateLastNameFill(String str2){
        if (str2.length() == 0) {
            System.out.print("The last name must be filled in.");
            return true;
        }
        return false;
    }

    // Function() to determine if the length of the first name is at least 2.
    public boolean validateMinLengthFirstName(String str1){
        if (str1.length() == 1) {
            System.out.print("The first name must be at least 2 characters long.");
            return true;
        }
        return false;
    }

    // Function() to determine if the length of the first name is at least 2.
    public boolean validateMinLengthLastName(String str2){
        if (str2.length() == 1) {
            System.out.print("The last name must be at least 2 characters long.");
            return true;
        }
    return false;
    }

    public boolean validateZipCode(String str3){
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean specialFlag = false;
        char ch;
        String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";
        String[] str3Array = str3.split("");

        for(int i = 0; i < str3.length(); i++) {

            // Returns a character at a specific position in string and sets it in ch.
            ch = str1.charAt(i);

            // Checks string for uppercase letters. If found sets flag to true.
            if (Character.isUpperCase(ch)){
                capitalFlag = true;
            }

            // Checks string for lowercase letters. If found sets flag to true.
            else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            }

            // Checks string array for special characters. If found sets flag to true.
            else if (specialChars.contains(str3Array[i])) {
                specialFlag = true;
            }
        }
        // If any flags were true then print error message.
        if ((capitalFlag || lowerCaseFlag) || specialFlag){
            System.out.print("%nThe zipcode must be a number.");
            return true;
        }
    return false;
    }

    public boolean validateID(String str4){

        boolean errorFlag1;
        boolean errorFlag2;
        boolean errorFlag3 = false;
        boolean errorFlag4 = false;
        boolean errorFlag5 = false;
        boolean errorFlag6 = false;
        boolean errorFlag7 = false;

        String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";
        String[] str3Array = str3.split("");

        if ( (Character.isDigit(str4.charAt(0))) || (Character.isLowerCase(str4.charAt(0))) || (specialChars.contains(str3Array[0])));
            errorFlag1 = true;

        if ( (Character.isDigit(str4.charAt(1))) || (Character.isLowerCase(str4.charAt(1))) || (specialChars.contains(str3Array[1])));
            errorFlag2 = true;

        if (str4.charAt(2) != '-')
            errorFlag3 = true;

        if ((Character.isLowerCase(str4.charAt(3))) || (Character.isUpperCase(str4.charAt(3))) || (specialChars.contains(str3Array[3])))
            errorFlag4 = true;

        if ((Character.isLowerCase(str4.charAt(4))) || (Character.isUpperCase(str4.charAt(4))) || (specialChars.contains(str3Array[4])))
            errorFlag5 = true;

        if ((Character.isLowerCase(str4.charAt(5))) || (Character.isUpperCase(str4.charAt(5))) || (specialChars.contains(str3Array[5])))
            errorFlag6 = true;

        if ((Character.isLowerCase(str4.charAt(6))) || (Character.isUpperCase(str4.charAt(6))) || (specialChars.contains(str3Array[6])))
            errorFlag7 = true;

        if (errorFlag1 || errorFlag2 || errorFlag3 || errorFlag4 || errorFlag5 || errorFlag6 || errorFlag7){
            System.out.print("%nThe employee ID must be in the format of AA-1234.");
            return true;}
    return false;
    }

    public void validateInput(String str1, String str2, String str4, String str3){
        Solution27 obj = new Solution27();

        obj.validateFirstNameFill(obj.str1);

        obj.validateMinLengthFirstName(obj.str1);

        obj.validateLastNameFill(obj.str2);

        obj.validateMinLengthLastName(obj.str2);

        obj.validateID(obj.str4);

        obj.validateZipCode(obj.str3);

        if( !(obj.validateFirstNameFill(obj.str1)) || !(obj.validateMinLengthFirstName(obj.str1)) ||
        !(obj.validateLastNameFill(obj.str2)) || !(obj.validateMinLengthLastName(obj.str2)) || !(obj.validateID(obj.str4))
        || !(obj.validateZipCode(obj.str3))) {
            System.out.print("There were no errors found.");
        }
    }

    public static void main(String[] args) {
        Solution27 app = new Solution27();

        app.str1 = app.readStringFromUser("Enter the first name: ");
        app.str2 = app.readStringFromUser("Enter the last name: ");
        app.str3 = app.readStringFromUser("Enter the ZIP code: ");
        app.str4 = app.readStringFromUser("Enter the employee ID: ");

        app.validateInput(app.str1, app.str2, app.str4, app.str3);

    }


    // Function() that returns a string which will prompt user for an employee id.

    // Function() that will determine if previously entered string is in format AA-1234.
    // If string doesn't follow specific format an error message will print.

    // Function validateInput() that uses previous input and validation functions.

    // Print the results.

}
