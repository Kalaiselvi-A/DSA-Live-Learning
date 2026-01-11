import java.util.Scanner;

public class CompareIterationRecursion {

    // Recursive function
    static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    // Iterative function
    static int iterativeSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int iterativeResult = iterativeSum(n);
        int recursiveResult = recursiveSum(n);

        System.out.println("Iterative Sum: " + iterativeResult);
        System.out.println("Recursive Sum: " + recursiveResult);

        System.out.println("\nTime Complexity:");
        System.out.println("Iterative: O(n)");
        System.out.println("Recursive: O(n)");

        System.out.println("Space Complexity:");
        System.out.println("Iterative: O(1)");
        System.out.println("Recursive: O(n) (due to recursion stack)");
    }
}
