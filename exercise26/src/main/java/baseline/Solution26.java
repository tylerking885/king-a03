/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution26
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.util.Scanner;

public class Solution26 {
 private static final Scanner in = new Scanner(System.in);
 public double i;
 public double b;
 public double p;
 // In function readIntFromUser:
 public int readIntFromUser(String prompt) {

  // Contains a prompt for user to enter a password.
  System.out.print(prompt);

  // Reads in a string from the user.
  return in.nextInt();
 }

 public double readDoubleFromUser(String prompt) {

  // Contains a prompt for user to enter a password.
  System.out.print(prompt);

  // Reads in a string from the user.
  return in.nextDouble();
 }
 // In main:
 public static void main(String[] args) {
  Solution26 app = new Solution26();
  // Prints the number of months based on the return of calcMonthsUntilPaidOff.

 }

}
 class PaymentCalculator extends Solution26 {

  // In function int calculateMonthsUntilPaidOff:
  public int calculateMonthsUntilPaidOff() {
   PaymentCalculator app = new PaymentCalculator();

   // User will be prompted to enter their balance of credit card.
   app.b = app.readDoubleFromUser("What is your balance? ");

   // User will be prompted to enter their apr as a percentage.
   app.i = (app.readDoubleFromUser("What is the APR on the card (as a percent)? "))/100;

   // User will be prompted to enter their monthly payment.
   app.p = app.readDoubleFromUser("What is the monthly payment you can make? ");

   // Returns the number of months left to pay off.
   return (int) (-(1 / 30) * Math.log(1 + app.b / app.p * (1 - Math.pow((1 + app.i), 30)))/ Math.log(1 + app.i));
  }

 }