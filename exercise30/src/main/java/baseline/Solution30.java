package baseline;

public class Solution30 {

    public static void main(String[] args) {

        int [][] array;

        array = multiplicationTable(12,12);

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.printf(" %3d ", anInt);
            }
            System.out.println();
        }
    }
    // A function will be used to multiply the indexes together and then stored into the 2d array.
    public static int[][] multiplicationTable(int R, int C){

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
