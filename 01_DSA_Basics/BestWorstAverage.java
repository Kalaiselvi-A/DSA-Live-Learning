import java.util.Scanner;

public class BestWorstAverage {

    public static void main(String[] args) {

        // Sample array for linear search
        int[] arr = {10, 20, 30, 40, 50};

        // Read the element to search
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        boolean found = false;   // To track if element is found

        /*
         Linear search:
         We check each element one by one until we find the target
         or reach the end of the array.
        */
        for (int i = 0; i < arr.length; i++) {

            // If current element matches target
            if (arr[i] == target) {
                System.out.println("Element found at position " + (i + 1));
                found = true;
                break;   // Stop searching once found
            }
        }

        // If element is not found after scanning the array
        if (!found) {
            System.out.println("Element not found");
        }

        /*
         Best Case:
         If the target is at the first position, only one comparison is needed → O(1)

         Worst Case:
         If the target is at the last position or not present, all n elements are checked → O(n)

         Average Case:
         On average, about n/2 elements are checked → O(n)
        */
        System.out.println("Best Case Time Complexity: O(1)");
        System.out.println("Worst Case Time Complexity: O(n)");
        System.out.println("Average Case Time Complexity: O(n)");
    }
}
