package HW2;

/*
*caroline hines
* 9/7./22
*HW2
 */

import java.util.Scanner;

public class dayOfWeek {
    public static double dayofweek(int m, int d, int y) {
       int y0 =  y - (14 - m)/12;

       int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

       int m0 = m + 12 *((14 - m) / 12) - 2;

       int d0 = (d + x + 31*m0 / 12) % 7;

       return d0;
    }

    public static void main (String[]args){

        // used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);
        System.out.print("Please enter the month as an integer:");
        int m = kbd.nextInt();
        System.out.print("Please enter the day as an integer: ");
        int d = kbd.nextInt();
        System.out.print("Please enter the years as an integer: ");
        int y = kbd.nextInt();


        System.out.print( dayofweek(m,d,y));
    }
}
