import java.util.Scanner;

public class IterativeToRecursive {

    // Recursive function to calculate sum of first n numbers
    static int sum(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        // Recursive call
        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         Call recursive function to calculate sum
         Iterative equivalent would have used a loop
        */
        int result = sum(n);

        System.out.println("Sum of first " + n + " numbers: " + result);
    }
}
