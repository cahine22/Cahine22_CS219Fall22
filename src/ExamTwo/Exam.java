package ExamTwo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exam {
    public static boolean isPalindrome2(String s) {
        if(s.length() < 2)
            return true;
        else if (s.charAt(0) == s.charAt(s.length()-1) &&
                isPalindrome2(s.substring(1,s.length()-1)))
            return true;
        else
            return false;}
    public static String [] loadWords(String path, int n) {
        // connect to the webpage of speeds
        URL url = null; // the "nothing value"
        Scanner s = null;
        try {
            url = new URL(path); // create a URL object for the
            s = new Scanner(url.openConnection().getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // create an array of strings
        String [] words = new String[n];
        int i = 0;
        while (s.hasNextLine()) {
            if(isPalindrome2(words[i]))
                words[i++] = s.nextLine();


            }
        return words;

    }
    public static int [] reverse(int [] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;}



    public static void main(String[] args) {
        String[] words = loadWords("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 2309);
        words = reverse(words);


        System.out.println(words);



    }
}
