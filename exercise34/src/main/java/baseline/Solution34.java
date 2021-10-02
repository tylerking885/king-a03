/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution34
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution34 {
    private static final Scanner in = new Scanner(System.in);

    private String UserChoice;

    public static void main(String[] args) {
        Solution34 app = new Solution34();

        // Create an array list.
        ArrayList<String> employees = new ArrayList<>();

        // Store employees in the list initially.
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        // Print the initial contents of the list.
        System.out.printf("There are %d employees:%n%s%n%s%n%s%n%s%n%s%n", employees.size(), employees.get(0),
                employees.get(1), employees.get(2), employees.get(3), employees.get(4));

        // Prompt the user for a name to remove.
        app.UserChoice = app.readUserInput();

        // Remove the employee that the user entered.
        employees.remove(app.UserChoice);
        // Print the remaining employees.
        System.out.printf("%nThere are %d employees:%n%s%n%s%n%s%n%s", employees.size(), employees.get(0),
                employees.get(1), employees.get(2), employees.get(3));
    }

    private String readUserInput(){
        System.out.printf("%nEnter an employee name to remove: ");

        return in.nextLine();
    }
}
