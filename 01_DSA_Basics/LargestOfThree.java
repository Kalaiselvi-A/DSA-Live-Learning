import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read three numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /*
         Step 1: Assume the first number is the largest
        */
        int max = a;

        /*
         Step 2: Compare with second number
         If b is greater, update max
        */
        if (b > max) {
            max = b;
        }

        /*
         Step 3: Compare with third number
         If c is greater, update max
        */
        if (c > max) {
            max = c;
        }

        // Print the largest number
        System.out.println(max);
    }
}

