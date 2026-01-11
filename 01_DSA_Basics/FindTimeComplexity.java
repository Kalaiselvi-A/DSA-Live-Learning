import java.util.Scanner;

public class FindTimeComplexity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         This loop runs n times.
         Each iteration performs a constant time operation (printing).
         So total time complexity = O(n)
        */
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // Print the time complexity
        System.out.println("Time Complexity: O(n)");
    }
}
