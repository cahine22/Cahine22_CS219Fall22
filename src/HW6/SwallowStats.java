package HW6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class SwallowStats {

    public static void SwallowStats() {

        // connect to the webpage of speeds
        URL url = null; // the "nothing value"
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";
        try {
            url = new URL(path); // create a URL object for the
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // what is true here? If i get here, i was able to connect
// read each line of the web file
        double sum = 0;
        int count = 0;
        double max = 0;
        double min = Double.POSITIVE_INFINITY;

        while (true) {
            if (!s.hasNextLine())
                break;
            String line = s.nextLine(); // nextLine will read a line of the web site

            if (line.indexOf("#") == -1 && !line.equals("")) { // modify condition (if the length of the line is zero)`
                sum = sum + Double.parseDouble(line);
                count = count + 1;
                if (min >Double.parseDouble(line)){
                    min = Double.parseDouble(line);
                }
                if (max < Double.parseDouble(line) ) {
                    max = Double.parseDouble(line);
                }

            }
        }
        System.out.printf("The average is %.2f\n", sum / count);
        System.out.printf("The minimum is %.2f\n", min);
        System.out.printf("The maximum is %.2f\n", max);



    }

    public static void main(String [] args) {
        SwallowStats();
        }
}

