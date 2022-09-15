import java.util.Random;
public class logicalOperators {

    public static void main(String[] agrs ) {

        Random r = new Random();

        int coinFlip = r.nextInt(2);

        if (coinFlip == 0) {
            System.out.println("Heads");

        } else {
            System.out.println("Tails");
        }

        int die1 = r.nextInt(6) + 1;
        int die2 = r.nextInt(6) + 1;

        if (die1 == 1 && die2 == 1) {
            System.out.println("Snake eyes");
        }

        // another way to check for snake eyes
        if (die1 == 1){
            if (die2 == 1){
                System.out.print("Snake eyes a different way");
            }
        }
        // check to see if die1 is between 2 amd 5 inclusive
        if (die1 >= 2 && die1 <= 5) {
            System.out.println("Between 2 and 5 inclusive");
        }

        if (die1 != 1 || die2 != 1){
            System.out.println("At least one die was not a one");
        }

        if (die1 != 1)
            System.out.print("Die1 is not a 1");
            else if (die2 != 1)
                System.out.println("Die2 is not a one");

        // check to see if we have exactly one 1
        if (die1 == 1 || die2 == 1 ){
            if (die1 != 1 || die2 != 1 ) {
                System.out.println("Exactly one die was not 1");
            }

        }
    }
}
