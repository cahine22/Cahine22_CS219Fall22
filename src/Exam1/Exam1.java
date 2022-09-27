package Exam1;

import java.util.Scanner;

public class Exam1 {
    public static int getInt (Scanner s) {
        boolean valid = false;
        int num = 0;
        while (!valid) {
            System.out.print("Enter integer: ");

            if (s.hasNextInt()) {
                num = s.nextInt();
                if (num < 0) {
                    System.out.printf("Error: number cannot be negative. You entered %s\n", num);
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: please enter an integer number, you entered \"%s\"\n", s.next());
            }

        }
        int number = num;
        int count = 0;
        while (number > 0) {
            if ((number % 10) < 7 && (number % 10) > 2 ) {
                count++;
            }
            number = number / 10;
        }

        return count;



    }
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int count = getInt(kbd);
        System.out.println(count);



    }
}
