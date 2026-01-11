public class FindMin {

    public static void main(String[] args) {

        int[] arr = {8, 3, 10, 2};

        int min = arr[0]; // assume first element is minimum

        /*
         Traverse the array and update min when smaller element is found
        */
        for (int i = 1; i < arr.length; i++) {

            // If current element is smaller than min, update min
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Print the minimum element
        System.out.println("Minimum element: " + min);
    }
}
