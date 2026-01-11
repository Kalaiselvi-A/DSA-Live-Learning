import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        /*
         Efficient Approach: Use HashSet to store unique elements
        */
        Set<Integer> uniqueSet = new LinkedHashSet<>(); // preserves insertion order

        for (int x : arr) {
            uniqueSet.add(x);
        }

        // Convert Set to Array
        int[] uniqueArr = new int[uniqueSet.size()];
        int i = 0;
        for (int x : uniqueSet) {
            uniqueArr[i++] = x;
        }

        // Print array without duplicates
        System.out.println("Array after removing duplicates:");
        for (int x : uniqueArr) {
            System.out.print(x + " ");
        }
    }
}
