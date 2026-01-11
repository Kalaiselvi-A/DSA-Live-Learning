public class MaximumDifference {

    public static void main(String[] args) {

        int[] arr = {2, 3, 10, 6, 4, 8, 1};

        int minElement = arr[0];
        int maxDiff = arr[1] - arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxDiff = Math.max(maxDiff, arr[i] - minElement);
            minElement = Math.min(minElement, arr[i]);
        }

        System.out.println("Maximum Difference (arr[j]-arr[i]): " + maxDiff);
    }
}
