//  Ouestion 1: Find a peak element which is not smaller than its neighbours.

import java.util.ArrayList;
import java.util.List;

class First {

    static List<Integer> findPeak(int arr[], int n) {
    
        List<Integer> peak = new ArrayList<>();

        if (n == 1) {
            peak.add(0);
        }
        
        if (arr[0] >= arr[1]) {
           peak.add(0);
        }
        if (arr[n-1] >= arr[n-2]) {
            peak.add(n-1);
        }

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
               peak.add(i);
            }
        }
        
        return peak;     
    }

    public static void main(String args[]) {
        int arr[] = {2, 6, 7, 14, 12, 20, 17};
        int n = arr.length;

        List<Integer>peak = findPeak(arr, n);
        
        if (!peak.isEmpty()) {
            System.out.println("Index of peak element is: " + peak);
            for(int Index: peak)
            System.out.println("Peak element is: " + arr[Index]);
        } else {
            System.out.println("No peak element found.");
        }
    }
}


