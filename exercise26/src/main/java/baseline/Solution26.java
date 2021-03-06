/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution26
 *  Copyright 2021 Tyler King
 */

package baseline;

import java.util.Scanner;

public class Solution26 {
 double b, i, p;

 public static void main(String[] args) {
  PaymentCalculator object = new PaymentCalculator();

  // User will be prompted to enter their balance of credit card.
  object.b = object.readDoubleFromUser("What is your balance? ");

  // User will be prompted to enter their apr as a percentage.
  object.i = ((object.readDoubleFromUser("What is the APR on the card (as a percent)? ")) / 100) / 365;

  // User will be prompted to enter their monthly payment.
  object.p = object.readDoubleFromUser("What is the monthly payment you can make? ");

  // Prints the number of months based on the return of calcMonthsUntilPaidOff.
  System.out.printf("It will take you %d months to pay off this card.", object.calculateMonthsUntilPaidOff(object.b, object.i, object.p));
 }
}

class PaymentCalculator extends Solution26 {
 private static final Scanner in = new Scanner(System.in);

 // In function readIntFromUser:
 public double readDoubleFromUser(String prompt) {

  // Contains a prompt for user to enter a value.
  System.out.print(prompt);

  // Reads in a string from the user.
  return in.nextDouble();
 }

  // Returns the number of months left to pay off.
  public int calculateMonthsUntilPaidOff(double b, double i, double p) {

   // Formula for determining number of months to pay credit card off.
   return (int) Math.ceil(((Math.log(1 + (b / p) * (1 - Math.pow((1 + i), 30)))) / (Math.log(1 + i))) / -30);
  }
}