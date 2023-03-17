package Subject_02;

public class Exercise_5 {
    public static void main(String[] args) {
        boolean isRaining=true;

        boolean isTheSunShining=false;

        if(isRaining==true && isTheSunShining==true)

            System.out.println("Rainbow");

        else if(isRaining==true && isTheSunShining==false)

            System.out.println("Slob");

        else if(isRaining!=true && isTheSunShining==false)

            System.out.println("Cloudy");

        else if(isRaining!=true && isTheSunShining==true)

            System.out.println("Sunny");
    }
}
