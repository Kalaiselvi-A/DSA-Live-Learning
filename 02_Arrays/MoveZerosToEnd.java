import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        int lastNonZero = 0;

        /*
         Traverse array and move non-zero elements forward
        */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap arr[i] with arr[lastNonZero]
                int temp = arr[i];
                arr[i] = arr[lastNonZero];
                arr[lastNonZero] = temp;
                lastNonZero++;
            }
        }

        System.out.println("Array after moving zeros to end:");
        System.out.println(Arrays.toString(arr));
    }
}
