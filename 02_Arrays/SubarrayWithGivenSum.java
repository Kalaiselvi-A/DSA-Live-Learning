public class SubarrayWithGivenSum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;

        int start = 0;
        int currentSum = 0;
        boolean found = false;

        for (int end = 0; end < arr.length; end++) {

            // Add current element to sum
            currentSum += arr[end];

            // Remove elements from start if sum exceeds target
            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            // Check if current sum equals target
            if (currentSum == target) {
                System.out.print("Subarray with sum " + target + ": ");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No subarray with given sum found");
        }
    }
}
