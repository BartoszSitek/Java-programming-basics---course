package Subject_02;

public class Exercise_2 {
    public static void main(String[] args) {
        System.out.println("CONJUCTION");
        System.out.println("true" +" &&" + " true " +" ==" +" true");
        System.out.println("true" +" &&" + " false " +" ==" + " false");
        System.out.println("false" +" &&" + " false " +" ==" + " false");
        System.out.println("false" +" &&" + " true " +" ==" + " false");

        System.out.println("ALTERNNATIVE");
        System.out.println("true" +" ||" + " true " +" ==" + " true");
        System.out.println("true" +" ||" + " false " +" ==" + " true");
        System.out.println("false" +" ||" + " true " +" ==" + " true");
        System.out.println("false" +" ||" + " false " +" ==" + " false");
        System.out.println();



        //A program to calculate the value of CONJUCTION
        boolean value1 = true;
        boolean value2 = false;
        if (value1==true && value2==true)
            System.out.println("CONJUCTION: "+ true);
        else if (value1==true && value2!=true)
            System.out.println("CONJUCTION: "+ false);
        else if (value1!=true && value2==true)
            System.out.println("CONJUCTION: " + false);
        else if (value1!=true && value2!=true)
            System.out.println("CONJUCTION: " + false);

        System.out.println();


        // A program for calculating the ALTERNATIVE value
        boolean value3 = true;
        boolean value4 = false;
        if (value1==true || value2==true)
            System.out.println("ALTERNATIVE: "+ true);
        else if (value3==true || value4!=true)
            System.out.println("ALTERNATIVE: "+ true);
        else if (value3!=true || value4==true)
            System.out.println("ALTERNATIVE: " + true);
        else if (value3!=true || value4!=true)
            System.out.println("ALTERNATIVE: " + false);

    }
}
