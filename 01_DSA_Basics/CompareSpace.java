import java.util.Scanner;

public class CompareSpace {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         Program A: Uses one variable
         Space = O(1)
        */
        int a = 10;

        /*
         Program B: Uses array of size n
         Space = O(n)
        */
        int[] arr = new int[n];

        /*
         Compare which one uses less memory
        */
        if (1 < n) {
            System.out.println("Program A uses less memory");
        } else {
            System.out.println("Program B uses less memory");
        }
    }
}
