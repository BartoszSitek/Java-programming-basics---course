package Subject_02;

public class Exercise_1 {
    public static void main(String[] args) {
            int a = 13,
                b=17,
                c=15;

        boolean isPrime = false;
        boolean isPrime1 = false;
        boolean isPrime2 = false;

        for (int i = 2; i <= a / 2; ++i) {
            if (a  % i == 0) {
                isPrime = true;
                break;
            }
        }
        for (int i = 2; i <= b / 2; ++i) {
            if (b  % i == 0) {
                isPrime1 = true;
                break;
            }
        }
        for (int i = 2; i <= c / 2; ++i) {
            if (c  % i == 0) {
                isPrime2 = true;
                break;
            }
        }
        if (!isPrime)
            System.out.println(a + " is a prime number.");
        else
            System.out.println(a + " is not a prime number.");

        if (!isPrime1)
            System.out.println(b + " is a prime number.");
        else
            System.out.println(b + " is not a prime number.");

        if (!isPrime2)
            System.out.println(c + " is a prime number.");
        else
            System.out.println(c + " is not a prime number.");
    }
}
