import java.util.Scanner;

public class BestWorstAverage {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        boolean found = false;

        /*
         Linear search
        */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at position " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        System.out.println("Best Case: O(1)");
        System.out.println("Worst Case: O(n)");
        System.out.println("Average Case: O(n)");
    }
}
