public class ArrayBasics {

    public static void main(String[] args) {

        // Declare and initialize an array
        int[] arr = {10, 20, 30, 40};

        /*
         An array stores elements in contiguous memory locations.
         Index starts from 0.
        */

        // Accessing elements using index
        System.out.println("First Element: " + arr[0]);   // 10
        System.out.println("Second Element: " + arr[1]);  // 20
        System.out.println("Third Element: " + arr[2]);   // 30
        System.out.println("Fourth Element: " + arr[3]);  // 40

        /*
         Looping through array elements
         Time Complexity: O(n)
        */
        System.out.println("\nTraversing Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " = " + arr[i]);
        }
    }
}
