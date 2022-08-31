package HW1;

public class Time {
    public static void main(String [] args){
        int hour = 12;
        int minute =36;
        int second = 42;
        int secSince = (second + (minute * 60) + (hour * 3600));
        int secTotal = 86400;
        System.out.println(hour + ":" + minute + ":" + second + " is " + secSince + " seconds since midnight.");

        int secRemaining = secTotal - secSince;
        System.out.println("There are " + secRemaining + " seconds left in the day");

        float percentage = ((secSince * 100)/secTotal);
        System.out.println( percentage + "% of the day has gone by");

        hour = 13;
        minute = 41;
        second = 37;
        int timeTaken = ((second + (minute * 60) + (hour * 3600) ) - secSince);

        System.out.println("It has taken me " + timeTaken + " seconds to complete this");







    }
}
