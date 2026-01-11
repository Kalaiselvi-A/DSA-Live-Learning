import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        Map<Integer, Integer> map = new HashMap<>(); // stores value -> index

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            // Check if complement exists
            if (map.containsKey(complement)) {
                System.out.println("Indices: [" + map.get(complement) + ", " + i + "]");
                return;
            }

            // Add current element to map
            map.put(arr[i], i);
        }

        System.out.println("No solution found");
    }
}
