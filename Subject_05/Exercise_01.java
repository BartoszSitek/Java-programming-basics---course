package Subject_05;

import java.util.Random;

public class Exercise_01 {
    public static void main(String[] args) {

        Random r = new Random();


        int[] myArray;
        int[] myArray2;
        int[] myArray3;

        myArray = new int[r.nextInt(10)];
        myArray2 = new int[r.nextInt(10)];
        myArray3 = new int[r.nextInt(10)];

        for (
                int i = 0;
                i < myArray.length; i++) {
            myArray[i] = r.nextInt();
        }
        for (
                int i = 0;
                i < myArray2.length; i++) {
            myArray2[i] = r.nextInt();
        }
        for (
                int i = 0;
                i < myArray3.length; i++) {
            myArray3[i] = r.nextInt();
        }

        int[][] myMainArray = { myArray, myArray2, myArray3}
                ;

        for (
                int i = 0;
                i < myArray.length; i++) {
            myMainArray[0][i] = myArray[i];
        }
        for (
                int i = 0;
                i < myArray2.length; i++) {
            myMainArray[1][i] = myArray2[i];
        }
        for (
                int i = 0;
                i < myArray3.length; i++) {
            myMainArray[2][i] = myArray3[i];
        }

        for (
                int i = 0;
                i < myMainArray.length; i++) {
            for (int j = 0; j < myMainArray[i].length; j++) {
                System.out.println(myMainArray[i][j]);
            }

        }
    }
}
