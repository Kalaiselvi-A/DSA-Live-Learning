public class MaxProductSubarray {

    public static void main(String[] args) {

        int[] arr = {2, 3, -2, 4};

        int maxEndingHere = arr[0];
        int minEndingHere = arr[0];
        int maxProd = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // If negative, swap max and min
            if (arr[i] < 0) {
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }

            maxEndingHere = Math.max(arr[i], maxEndingHere * arr[i]);
            minEndingHere = Math.min(arr[i], minEndingHere * arr[i]);

            maxProd = Math.max(maxProd, maxEndingHere);
        }

        System.out.println("Maximum Product Subarray: " + maxProd);
    }
}
