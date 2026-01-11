import java.util.Scanner;

public class PredictRuntime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input size n: ");
        int n = sc.nextInt();

        System.out.print("Select algorithm (1 -> O(n), 2 -> O(n^2)): ");
        int choice = sc.nextInt();

        long operations = 0;

        /*
         Predict operations based on algorithm type
        */
        if (choice == 1) {
            operations = n;         // Linear
        } else if (choice == 2) {
            operations = (long)n * n;  // Quadratic
        } else {
            System.out.println("Invalid choice");
            return;
        }

        /*
         Classify runtime based on estimated operations
        */
        String runtime;
        if (operations <= 1000) {
            runtime = "Fast";
        } else if (operations <= 100000) {
            runtime = "Moderate";
        } else {
            runtime = "Slow";
        }

        System.out.println("Estimated operations: " + operations);
        System.out.println("Predicted Runtime: " + runtime);
    }
}
