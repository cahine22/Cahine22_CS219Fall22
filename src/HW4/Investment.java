package HW4;
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
    public static int getDep (Scanner s) {
        boolean valid = false;
        int dep = 0;
        while (!valid) {
            System.out.print("Enter initial deposit: ");
            if (s.hasNextInt()) {
                dep = s.nextInt();
                if (dep < 0) {
                    System.out.printf("Error: deposit cannot be negative. You entered \"%s\"\n", dep);
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter a decimal number, you entered \"%s\"\n", s.next());
            }

        }
        return dep;
    }
    // ----------------------------------------------------------------------------------------
    public static double getintRate (Scanner s) {
        boolean valid = false;
        double intRate = 0;
        while (!valid) {
            System.out.print("Enter interest rate: ");
            if (s.hasNextDouble()) {
                intRate = s.nextDouble();
                if (!(0 < intRate && intRate < 1)) {
                    System.out.printf("Error: should be decimal, you entered " + intRate + "\n");
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter a decimal number, you entered \"%s\"\n", s.next());
            }

        }
        return intRate;
    }
// --------------------------------------------------------------------------------------
public static int getYears (Scanner s) {
    boolean valid = false;
    int years = 0;
    while (!valid) {
        System.out.print("Enter number of years: ");
        if (s.hasNextInt()) {
            years = s.nextInt();
            if (years < 0) {
                System.out.printf("Error: years cannot be negative. You entered \"%s\n", years);
            } else {
                valid = true;
            }
        } else {
            System.out.printf("Error: please enter an integer number, you entered \"%s\"\n", s.next());
        }

    }
    return years;
}
    // ----------------------------------------------------------------------------------------
    public static int getCompound (Scanner s) {
        boolean valid = false;
        int compound = 0;
        while (!valid) {
            System.out.print("Enter number of times to compound per year: ");
            if (s.hasNextInt()) {
                compound = s.nextInt();
                if (compound < 0) {
                    System.out.printf("Error: number of times cannot be negative. You entered \"%s\n", compound);
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter an integer number, you entered \"%s\"\n", s.next());
            }

        }
        return compound;
    }
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
    int dep = getDep(kbd);
    double intRate = getintRate(kbd);
    int years = getYears(kbd);
    int compound = getCompound(kbd);



        System.out.printf("Your investment is worth %.2f dollars", Investment.investment(dep, intRate, years, compound));

    } // main closing bracket

    } // class closing bracket