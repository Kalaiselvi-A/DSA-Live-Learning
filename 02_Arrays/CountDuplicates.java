import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count occurrences of each element
        for (int x : arr) {
            freqMap.put(x, freqMap.getOrDefault(x, 0) + 1);
        }

        int duplicateCount = 0;

        // Count elements with frequency > 1
        for (int freq : freqMap.values()) {
            if (freq > 1) {
                duplicateCount++;
            }
        }

        System.out.println("Number of duplicate elements: " + duplicateCount);
    }
}
