package Subject_03;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int sum = 0;
        int amount = 0;
        do {
            System.out.println("Enter value");
            value = scanner.nextInt();
            amount++;
            sum = sum + value;
        } while (value != 0);
        System.out.println("Number of entered numbers: " + amount);
        System.out.println("Sum of numbers: " + sum);
    }
}
