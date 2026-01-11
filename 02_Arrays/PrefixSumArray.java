public class PrefixSumArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        int[] prefixSum = new int[n];

        // First element
        prefixSum[0] = arr[0];

        // Compute prefix sum for remaining elements
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        System.out.println("Prefix Sum Array:");
        for (int x : prefixSum) {
            System.out.print(x + " ");
        }
    }
}
