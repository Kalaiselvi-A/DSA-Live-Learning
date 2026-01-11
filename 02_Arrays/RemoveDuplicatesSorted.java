public class RemoveDuplicatesSorted {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int n = arr.length;

        if (n == 0) return;

        int i = 0; // index of last unique element

        /*
         Traverse array starting from second element
        */
        for (int j = 1; j < n; j++) {

            // If current element is different from last unique
            if (arr[j] != arr[i]) {
                i++;          // move index of last unique
                arr[i] = arr[j]; // update value
            }
        }

        // Print array without duplicates
        System.out.println("Array after removing duplicates:");
        for (int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
