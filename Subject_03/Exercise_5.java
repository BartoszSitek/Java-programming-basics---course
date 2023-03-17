package Subject_03;

public class Exercise_5 {
    public static void main(String[] args) {
        int day = 5;
        int month = 12;
        int year = 2022;

        int daysFromStartOfTheYear=day;

        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1, 3, 5, 7, 8, 10, 12 -> daysFromStartOfTheYear += 31;
                case 2 -> {
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                        daysFromStartOfTheYear += 29;
                    else
                        daysFromStartOfTheYear += 28;
                }
                default -> daysFromStartOfTheYear += 30;
            }
        }
        System.out.println("Days = " + daysFromStartOfTheYear);

    }
}
