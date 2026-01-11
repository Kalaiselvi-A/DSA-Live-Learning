import java.util.Scanner;

public class MatchComplexity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         User chooses an algorithm type:
         1 -> Constant time
         2 -> Single loop
         3 -> Nested loop
        */
        int choice = sc.nextInt();

        /*
         Based on the choice, we print the matching Big-O complexity
        */
        if (choice == 1) {
            System.out.println("O(1) - Constant Time");
        } 
        else if (choice == 2) {
            System.out.println("O(n) - Linear Time");
        } 
        else if (choice == 3) {
            System.out.println("O(n^2) - Quadratic Time");
        } 
        else {
            System.out.println("Invalid Input");
        }
    }
}
