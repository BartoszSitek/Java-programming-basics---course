package Subject_01;

public class Exercise_4 {
    public static void main(String[] args) {

            int year;
            year = 2012;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                System.out.print("Year: " + year + " is leap");
            else
                System.out.println("Year: " + year + " isn't leap");
    }
}
