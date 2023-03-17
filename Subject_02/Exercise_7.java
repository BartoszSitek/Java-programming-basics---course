package Subject_02;

public class Exercise_7 {
    public static void main(String[] args) {
        java . util . Scanner scanner = new java . util . Scanner ( System . in ) ;
        int ch = scanner . nextInt ( );
        int ch1 = scanner . nextInt ( );

        if(ch>0 && ch1>0)
            System.out.println(ch - ch1);
        else if (ch<0 && ch1<0)
            System.out.println(ch + ch1);
        else if (ch>0 && ch1<0)
            System.out.println("The values you entered have different signs");
        else if (ch<0 && ch1>0)
            System.out.println("The values you entered have different signs");



    }
}
