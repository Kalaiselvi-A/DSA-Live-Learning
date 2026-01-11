public class MaxSumCircularSubarray {

    public static void main(String[] args) {

        int[] arr = {5, -3, 5};
        int n = arr.length;

        // Kadane's Algorithm for max subarray sum (no wrap)
        int maxKadane = kadane(arr);

        // Total sum and min subarray sum
        int total = 0;
        int minSum = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
            arr[i] = -arr[i]; // invert array for min subarray
        }
        minSum = kadane(arr); // max of inverted array = min of original
        int maxWrap = total + minSum;

        int result = (maxWrap > maxKadane) ? maxWrap : maxKadane;
        System.out.println("Maximum Circular Subarray Sum: " + result);
    }

    // Standard Kadane's Algorithm
    private static int kadane(int[] arr) {
        int maxEndingHere = arr[0], maxSoFar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
