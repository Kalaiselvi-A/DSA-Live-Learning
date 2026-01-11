import java.util.Scanner;

public class ExtraMemoryUsed {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         Creating an array of size n.
         This consumes memory proportional to n.
        */
        int[] arr = new int[n];

        /*
         Since we are using an array of size n,
         the extra memory used grows with n.
         So space complexity = O(n)
        */
        System.out.println("Space Complexity: O(n)");
    }
}
