package Subject_06;

import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        Armstrong();

    }
    private static boolean is_armstrong(int input)
    {
        int input_cpy = input;

        int [] arr = new int[3];
        int iter = 0;
        while (input > 0){
            arr[iter] = input%10;
            input/=10;

            iter++;
        }
        int sum = 0;

        for (int i = 0; i < iter;i++)
            sum += Math.pow(arr[i], iter);

        return sum==input_cpy;
    }

    public static void Armstrong(){
        System.out.println("Enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int arr = scanner.nextInt();

        if (is_armstrong(arr))
            System.out.println(arr + " is the Armstrong number.");
        else
            System.out.println(arr + " isn't an Armstrong number.");
    }
}
