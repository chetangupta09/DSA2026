package DSA_EASY;

import java.util.Arrays;
import java.util.OptionalInt;

public class HiLowFrequency {

    public static void main(String[] args) {
        HiLowFrequency h=new HiLowFrequency();
        int[] arr={3,8,9,9,2,5,15,15,2,2};
        int len=arr.length;

        h.getHiLowFrequency(arr,len);
        h.countFreq(arr,len);

    }

    public void getHiLowFrequency(int[] arr, int n){
        OptionalInt max= Arrays.stream(arr).max();
        OptionalInt min= Arrays.stream(arr).min();
        int minCount = 0,maxCount=0;
        for(int number:arr){
            if(max.getAsInt() ==number){
                minCount++;
            }

            if(min.getAsInt()==number){
                maxCount++;
            }
        }

        System.out.println("This number is highest number "+max+" and it's frequency "+maxCount);
        System.out.println("This number is lowest number "+min+" and it's frequency "+minCount);
    }


    // Method to count frequency and find elements with max and min frequency
    public void countFreq(int[] arr, int n) {
        boolean[] visited = new boolean[n]; // To track which elements are already processed
        int maxFreq = 0, minFreq = n;       // Frequency bounds initialization
        int maxEle = 0, minEle = 0;         // Elements with max and min frequency

        for (int i = 0; i < n; i++) {

            // If element already processed, skip
            if (visited[i])
                continue;

            // Count how many times arr[i] occurs
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; // Mark as counted
                    count++;
                }
            }

            // Update max frequency and corresponding element
            if (count > maxFreq) {
                maxEle = arr[i];
                maxFreq = count;
            }

            // Update min frequency and corresponding element
            if (count < minFreq) {
                minEle = arr[i];
                minFreq = count;
            }
        }

        // Print final results
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }

}
