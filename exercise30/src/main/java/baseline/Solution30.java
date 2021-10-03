/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution30
 *  Copyright 2021 Tyler King
 */

package baseline;

public class Solution30 {
int [][] array;
    public static void main(String[] args) {
        Solution30 app = new Solution30();

        app.array = app.multiplicationTable(12,12);

        for (int[] ints : app.array) {
            for (int anInt : ints) {
                System.out.printf(" %3d ", anInt);
            }
            System.out.println();
        }
    }
    // A function will be used to multiply the indexes together and then stored into the 2d array.
    public int[][] multiplicationTable(int R, int C){

        int [][] array = new int[R][C];

        // Use a nested loop to complete this program.
        for (int row = 0; row < array.length; row++){

            // Calculate the correct value at the correct index.
            for (int column = 0; column < array[row].length; column++){
                array[row][column] = (row + 1) * (column + 1);
            }
        }
        // Returns the filled 2d array of multiplicative values.
        return array;
    }
}
