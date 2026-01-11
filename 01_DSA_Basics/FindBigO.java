import java.util.Scanner;

public class FindBigO {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         Loop runs n times.
         Each iteration takes constant time.
         So Big-O = O(n)
        */
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        System.out.println("Big-O Time Complexity: O(n)");
    }
}
