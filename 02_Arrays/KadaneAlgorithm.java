public class KadaneAlgorithm {

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxEndingHere = arr[0]; // max sum ending at current index
        int maxSoFar = arr[0];      // max sum found so far

        /*
         Traverse the array starting from second element
        */
        for (int i = 1; i < arr.length; i++) {

            // Either start new subarray or extend existing
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);

            // Update max so far
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        System.out.println("Maximum Subarray Sum: " + maxSoFar);
    }
}
