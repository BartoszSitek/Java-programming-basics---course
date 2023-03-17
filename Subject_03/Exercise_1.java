package Subject_03;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        java.util.Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the triangle angles: ");
        int k1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        int k3 = scanner.nextInt();
        int sum = k1 + k2 + k3;

        if(sum<=180) {
            if(k1<90 && k2<90 && k3<90)
                System.out.println("The triangle is acute ");
            else
                System.out.println("The triangle isn't acute");
        }
    }
}
