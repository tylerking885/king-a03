/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution27
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.util.Scanner;

public class Solution27 {

    private static final Scanner in = new Scanner(System.in);

    private String nameFirst, nameLast, ZIP, empID;

    // Function that returns a string which will prompt user for certain entries.
    private String readStringFromUser(String prompt) {

        // Contains a prompt for user to enter a value.
        System.out.print(prompt);

        // Returns a string that the user entered.
        return in.nextLine();
    }

    // Function to determine if a character was entered for first name.
    public boolean validateFirstNameFill(String nameFirst){

        return nameFirst.length() == 0;
    }

    // Function to determine if a character was entered for last name.
    public boolean validateLastNameFill(String nameLast){

        return nameLast.length() == 0;
    }

    // Function to determine if the length of the first name is at least 2.
    public boolean validateMinLengthFirstName(String nameFirst){

        return nameFirst.length() < 2;
    }

    // Function to determine if the length of the first name is at least 2.
    public boolean validateMinLengthLastName(String nameLast){

        return nameLast.length() < 2;
    }

    // Function to determine if the user entered numbers for the zip.
    public boolean validateZipCode(String ZIP){

        return ZIP.matches("\\d{5}");
    }

    // Function to determine if the user entered the employee ID in the format AA-1234.
    public  boolean validateID(String empID){

        return empID.matches("[A-Z]{2}-[1-9]\\d{3}");
    }

    public void validateInput(String nameFirst, String nameLast, String ZIP, String empID) {
        int errorCount = 0;
        if (validateFirstNameFill(nameFirst)) {

            System.out.println("The first name must be filled in.");
            errorCount ++;

        } if (validateMinLengthFirstName(nameFirst)) {

            System.out.println("The first name must be at least 2 characters long.");
            errorCount ++;

        } if (validateLastNameFill(nameLast)) {

            System.out.println("The last name must be filled in.");
            errorCount ++;

        } if (validateMinLengthLastName(nameLast)) {

            System.out.println("The last name must be at least 2 characters long.");
            errorCount ++;

        } if (!validateID(empID)) {

            System.out.println("The employee ID must be in the format of AA-1234.");
            errorCount ++;

        } if (!validateZipCode(ZIP)) {

            System.out.println("The zipcode must be a 5 digit number.");
            errorCount ++;

        } if (errorCount == 0) {

            System.out.println("There were no errors found.");
        }
    }
    public static void main(String[] args) {
        Solution27 app = new Solution27();

        app.nameFirst = app.readStringFromUser("Enter the first name: ");
        app.nameLast = app.readStringFromUser("Enter the last name: ");
        app.ZIP = app.readStringFromUser("Enter the ZIP code: ");
        app.empID = app.readStringFromUser("Enter the employee ID: ");

        app.validateInput(app.nameFirst, app.nameLast, app.ZIP, app.empID);
    }
}
