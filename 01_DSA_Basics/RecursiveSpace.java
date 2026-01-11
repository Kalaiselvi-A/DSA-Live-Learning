import java.util.Scanner;

public class RecursiveSpace {

    // Recursive function
    static void countDown(int n) {
        if (n == 0) {
            return;
        }
        countDown(n - 1);   // Recursive call
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         This function will be called n times.
         Each call takes space in the call stack.
         So space complexity = O(n)
        */
        countDown(n);

        System.out.println("Space Complexity: O(n)");
    }
}
