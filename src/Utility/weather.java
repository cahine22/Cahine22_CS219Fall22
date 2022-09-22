package Utility;

import java.awt.desktop.QuitEvent;
import java.util.Scanner;
public class weather {

    public static double windchill(double t, // temperature
                                   double v) { // velocity in mph
        return 35.75 + +0.6215 * t + ((0.4275 * t) - 35.75) * Math.pow(v, .16);
    }

    public static double getVelocity (Scanner s) {
        boolean valid = false;
        double vel = 0;
        while (!valid) {
            System.out.print("Enter wind velocity in MPH: ");

            if (s.hasNextDouble()) {
                vel = s.nextDouble();
                if (vel < 0) {
                    System.out.printf("Error: velocity cannot be negative. You entered %.2f\n", vel);
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter a decimal number, you entered \"%s\"\n", s.next());
            }

        }
        return vel;
    }

    public static double getTemp (Scanner s){
        boolean valid = false;
        double temp = 0;
        while (!valid) {
            System.out.print("Enter temperature: ");

            if (s.hasNextDouble()) {
                temp = s.nextDouble();
                break;
            }
            else {
                System.out.printf("Error: please enter a decimal number, you entered \"%s\"\n", s.next());
            }

        }
        return temp;
    }
        public static void main (String[]args){

        // used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);


        double temp = getTemp(kbd);
        double vel = getVelocity(kbd);


        // what is true at this point?
            // x = 1, so we read a valid double value
        System.out.printf("The windchill with a temperature of %.1f and a velocity of %.1f is %.2f\n",
                temp, vel, windchill(temp,vel));



        }

}