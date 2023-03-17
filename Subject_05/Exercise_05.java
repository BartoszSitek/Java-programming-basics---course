package Subject_05;

public class Exercise_05 {
    public static void main(String[] args) {
        int a=5;
        int b=18;
        int c=15;

        findMax(a,b,c);

    }
    public static void findMax(int a,int b,int c){
        int largest;
        if(a>b & a>c){
            largest = a;
        } else if (b>a & b>c) {
            largest=b;

        }else{
            largest=c;
        }
        System.out.println("The largest value is: " + largest);

    }
}
