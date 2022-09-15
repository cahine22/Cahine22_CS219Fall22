package HW3;
/*
 *caroline hines
 * 9/15/22
 *HW2
 */
import java.util.Scanner;

public class Investment {

    public static double investment(double c, double r, int t, int n) {
        return c * Math.pow(1 + r / n, t * n);

    }

    public static void main(String[] args) {

        System.out.println("HW3- Validating inputs");
        System.out.println("Return on an investment ");
        System.out.println("                      ");


        Scanner kbd = new Scanner(System.in);
// ----------------------------------------------------------------------------------------
        System.out.print("Enter an initial deposit as a positive integer: ");
        int dep;
        if (kbd.hasNextInt()) {
            dep = kbd.nextInt();
            if (dep < 0) {
                System.out.print("Error: positive number needed, you entered "+ dep);
                return; // exit main
            }
        }
        else{
            System.out.printf("Error: integer needed, you entered \"%s\"",kbd.next() );
            return; // exit main
        }

// --------------------------------------------------------------------------------------

        System.out.print("Enter interest rate as a decimal : ");
        double intRate ;
        if (kbd.hasNextDouble()) {
            intRate = kbd.nextDouble();
            if (!(0 < intRate && intRate < 1)) {
                System.out.printf("Error: should be decimal, you entered " + intRate);
                return; // exit main
            }
            }

        else {
            System.out.printf("Error: decimal needed, you entered \"%s\"",kbd.next() );
            return; // exit main
        }


// -------------------------------------------------------------------------------
        System.out.print("Enter number of years as an integer: ");
        int years;
        if (kbd.hasNextInt()) {
            years = kbd.nextInt();
            if (years < 0) {
                System.out.println("Error: positive number needed, you entered "+ years);
                return; // exit main
            }
        }
        else{
            System.out.printf("Error: integer needed, you entered \"%s\"",kbd.next() );
            return; // exit main
        }
// ------------------------------------------------------------------------------------
        System.out.print("Enter the number of times to compound per year as an integer: ");
        int compound;

        if (kbd.hasNextInt()) {
            compound = kbd.nextInt();
            if (compound < 0) {
                System.out.println("Error: positive number needed, you entered " + compound);
                return; // exit main
            }
        }

        else {
                System.out.printf("Error: integer needed, you entered \"%s\"", kbd.next());
                return; // exit main
            }
//-------------------------------------------------------------------------------------------------------------------
        System.out.printf("Your investment is worth %.2f dollars", Investment.investment(dep,intRate,years,compound));


    } // main closing bracket
} // class closing bracket


