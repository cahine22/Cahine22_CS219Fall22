package Utility;

public class DigitExtractor {
    public static int second(int s) {
        if (s < 0)
            s = -s;
            return (s / 10) % 10;
        }


    public static int last(int n) {
        if (n < 0)
            n = -n;
            return n % 10;
        }


    public static void main(String[] agrs){
        System.out.println(last(2753) == 3);
        System.out.println(last(-749)== 9);
        System.out.println(second(-749)== 4);


    }
}
