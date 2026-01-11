import java.util.HashMap;
import java.util.Map;

public class UniqueElements {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each element
        for (int x : arr) {
            countMap.put(x, countMap.getOrDefault(x, 0) + 1);
        }

        // Print elements that appear only once
        System.out.println("Unique elements in the array:");
        for (int x : arr) {
            if (countMap.get(x) == 1) {
                System.out.print(x + " ");
            }
        }
    }
}
