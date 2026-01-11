import java.util.Scanner;

public class ChooseOptimalAlgorithm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Example algorithms with time and space complexity
        String[] algorithms = {"A", "B", "C"};
        String[] timeComplexity = {"O(n^2)", "O(n log n)", "O(n)"};
        String[] spaceComplexity = {"O(1)", "O(n)", "O(n)"};

        // Compare algorithms
        int optimalIndex = 0;

        /*
         Simple logic to choose optimal based on time complexity
         Here we assume O(n) < O(n log n) < O(n^2)
        */
        for (int i = 0; i < algorithms.length; i++) {
            if (timeComplexity[i].equals("O(n)")) {
                optimalIndex = i;
                break;
            } else if (timeComplexity[i].equals("O(n log n)") && !timeComplexity[optimalIndex].equals("O(n)")) {
                optimalIndex = i;
            }
        }

        System.out.println("Optimal Algorithm: " + algorithms[optimalIndex]);
        System.out.println("Time Complexity: " + timeComplexity[optimalIndex]);
        System.out.println("Space Complexity: " + spaceComplexity[optimalIndex]);
    }
}
