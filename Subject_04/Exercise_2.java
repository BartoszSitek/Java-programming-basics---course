package Subject_04;

import java.util.Arrays;
import java.util.Random;

public class Exercise_2 {
    public static void main(String[] args) {
        Random random = new Random();

        // Creates a length variable with a random value between 10 and 15
        int length = random.nextInt(6) + 10;

        // Creates an array of int variables of size length
        int[] array = new int[length];

        // Fills an array with values 0, 1, 2, 3...
        for (int i = 0; i < array.length; i++)
            array[i] = i;

        // Shuffles the elements in an array
        for (int i = array.length - 1; i > 0; i--) {
            // Selects a random index less than or equal to i
            int j = random.nextInt(i + 1);

            // Swaps elements with indices i and j
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        // Prints the elements of an array
        System.out.println(Arrays.toString(array));

        // Visualizes the elements of an array
        for (int i = 0; i < array.length; i++) {


            // Visualizes the item at index i
            for (int j = 0; j < array.length; j++) {
                if (j == array[i])
                    System.out.print("*");
                else
                    System.out.print(".");
            }

            System.out.println();
        }

    }
}
