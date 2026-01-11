import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        List<Integer> leaders = new ArrayList<>();

        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);

        // Traverse from second last element to first
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

        // Reverse to maintain original order
        Collections.reverse(leaders);

        System.out.println("Leaders in the array: " + leaders);
    }
}
