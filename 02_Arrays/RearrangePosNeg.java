import java.util.ArrayList;
import java.util.List;

public class RearrangePosNeg {

    public static void main(String[] args) {

        int[] arr = {1, 2, -3, -4, 5, -6};
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        // Separate positives and negatives
        for (int num : arr) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        int i = 0, j = 0, k = 0;
        // Merge alternately
        while (i < neg.size() && j < pos.size()) {
            arr[k++] = neg.get(i++);
            arr[k++] = pos.get(j++);
        }

        // Append remaining negatives
        while (i < neg.size()) arr[k++] = neg.get(i++);
        // Append remaining positives
        while (j < pos.size()) arr[k++] = pos.get(j++);

        // Print result
        System.out.print("Rearranged Array: [");
        for (int l = 0; l < arr.length; l++) {
            System.out.print(arr[l]);
            if (l != arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
