package Subject_05;

import java.util.Random;

public class Exercise_02 {
    public static void main(String[] args) {

        float[][] arr = new float[8][8];
        FillIn(arr);
        WriteOut(arr);
        LeftDiagonal(arr);
        RightDiagonal(arr);


    }

    public static void FillIn(float arr[][]) {
        Random r = new Random();
        for (int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                arr[i][j]=r.nextFloat();

            }
        }

    }
    public static void WriteOut(float arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr [i][j] + "   " );
            }
            System.out.println();
        }
    }
    public static void LeftDiagonal(float arr[][]){
        float LeftSum=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if(i==j) {
                    LeftSum+=arr[i][j];
                }
            }


        }
        System.out.println("This is the sum of the left diagonal: ");
        System.out.println(LeftSum);
    }
    public static void RightDiagonal(float arr[][]){
        float rightSum=0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                rightSum +=arr[8-1-i][j];
            }
        }
        System.out.println("This is the sum of the right diagonal:  ");
        System.out.println(rightSum);
    }

}
