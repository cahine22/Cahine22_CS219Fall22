package Utility;

import java.util.Scanner;
public class weather {

    public static double windchill(double t, // temperature
                                   double v) { // velocity in mph
        return 35.75 + +0.6215 * t + ((0.4275 * t) - 35.75) * Math.pow(v, .16);
    }

        public static void main (String[]args){

        // used for ghetting input from teh keyboard
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter temperature in degrees F: ");
        double temp = kbd.nextDouble();
        System.out.print("Enter wind velocity in MPH: ");
        double vel = kbd.nextDouble();

        System.out.printf("The windchill with a temperature of %.1f and a velocity of %.1f is %.2f\n",
                temp, vel, windchill(temp,vel));


        System.out.print("They said \"Dont do it\"");

        }

}