import HW3.Investment;

import java.util.Scanner;

public class investmentCalculator {
    public static void main(String[] agrs){

        // prompt teh user for c,r,t and n
        // and call the function with the input values

        Scanner kbd = new Scanner(System.in);
        // system.in means teh standard input (keyboard)
        System.out.print("Enter an initial deposit as a decimal: ");
        double c = kbd.nextDouble();
        System.out.print("Enter interest rate as a decimal : ");
        double r = kbd.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        int t = kbd.nextInt();
        System.out.print("Enter the number of times to compus per year as an integer:");
        int n = kbd.nextInt();

        // the difference for printf is that we can give it a format
        // the %.2 means that it is rounded to 2 decimal places, the f is passing it to the values
        System.out.printf("Your investment is worth %.2f dollars💵🤑", Investment.investment(c,r,t,n));



    }
}
