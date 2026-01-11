import java.util.Scanner;

public class CompareTwoAlgorithms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         Algorithm A: O(n)
         Algorithm B: O(n^2)
        */
        int algoA = n;        // number of operations for O(n)
        int algoB = n * n;    // number of operations for O(n^2)

        /*
         Compare which algorithm uses fewer operations
        */
        if (algoA < algoB) {
            System.out.println("Algorithm A (O(n)) is faster");
        } else {
            System.out.println("Algorithm B (O(n^2)) is faster");
        }
    }
}
