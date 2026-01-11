import java.util.Arrays;

public class KthLargest {

    public static void main(String[] args) {

        int[] arr = {10, 4, 6, 8, 2};
        int k = 3;

        /*
         Approach: Sort the array in descending order
         and return element at index k-1
        */
        Arrays.sort(arr); // Sort ascending
        int n = arr.length;
        int kthLargest = arr[n - k]; // Convert to descending

        System.out.println(k + "th Largest Element: " + kthLargest);

        /*
         Output Explanation:
         Sorted Array: [2, 4, 6, 8, 10]  
         3rd largest → arr[5 - 3] = arr[2] = 6
        */
    }
}
