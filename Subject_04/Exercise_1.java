package Subject_04;

import java.util.Random;

public class Exercise_1 {
    public static void main(String[] args) {
        double tab[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Random r = new Random();
        for (int i = 0; i < tab.length; i++) {
            // Fill arrays with random items and display all items
            tab[i] = r.nextDouble();
            System.out.println(tab[i]);
        }
        //Elements with an even index
        System.out.println("========");
        for (int i = 0; i < tab.length; i++) {
            if (i % 2 == 0) {
                System.out.println(tab[i]);
            }
        }
    }
}
