package ArrayExamples;

import java.util.Arrays;

public class SelectionSort {
    // return the index of teh smalledt item in the array

    public static int smallestLoc(int [] aoi){
        int curr_min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < aoi.length; i++){
            if (aoi[i] < curr_min){
                curr_min = aoi[i];
                 index = i ;
            }
        }
        return index;


    }

    public static int smallestLocStart(int start, int [] aoi) {
        int curr_min = Integer.MAX_VALUE;
        int index = start;

        for (int i = start; i < aoi.length; i++) {
            if (aoi[i] < curr_min) {
                curr_min = aoi[i];
                index = i;
            }
        }
        return index;
    }
    public static int [] sort(int[] aoi) {

        for (int i = 0; i < aoi.length; i++) {
            int j = smallestLocStart(i,aoi);
            int temp = aoi[i];
            aoi[i] = aoi[j];
            aoi[j] = temp;
        }
        return aoi;
    }
    public static boolean isOrdered(int[] aoi) {

        for (int i = 0; i < aoi.length -1; i++) {
            if (aoi[i] > aoi[i + 1])
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(smallestLoc(new int[] {4,1,9,-1,6}) == 3);
        System.out.println(smallestLocStart(4, new int[] {4,1,9,-1,6}) == 4);

        int [] aoi = {4,1,9,2,-1,6};
        System.out.println(Arrays.toString(sort(aoi)));
        System.out.println(isOrdered(sort(aoi)));

    }
}
