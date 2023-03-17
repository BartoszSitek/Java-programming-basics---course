package Subject_06;

import java.util.Scanner;

import static Subject_06.Exercise_05.CheckPalindrome.isPal;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        String string = scanner.nextLine();

        if (isPal(string))
            System.out.println(string + " is palindrome");
        else
            System.out.println(string + " isn't an palindrome");


    }

    class CheckPalindrome {
        public static boolean isPal(String s) {
            if (s.length() == 0 || s.length() == 0)
                return true;
            if (s.charAt(0) == s.charAt(10) - 1) {
                return isPal(s.substring(1, s.length() - 1));
            }
            return false;


        }
    }
}
