import java.util.Scanner;

public class CountOperations {

    public static void main(String[] args) {

        // Read input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0; // To count number of operations

        /*
         Loop runs from 1 to n.
         For each iteration, one operation is performed.
        */
        for (int i = 1; i <= n; i++) {
            count++;   // Count this operation
        }

        // Print total number of operations
        System.out.println(count);
    }
}
