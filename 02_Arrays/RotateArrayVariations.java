import java.util.Arrays;

public class RotateArrayVariations {

    // Helper function to reverse array from index start to end
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Right rotate by k
    static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle k > n
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    // Left rotate by k
    static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int k = 2;

        rightRotate(arr1, k);
        System.out.println("Right Rotated Array: " + Arrays.toString(arr1));

        int[] arr2 = {1, 2, 3, 4, 5};
        leftRotate(arr2, k);
        System.out.println("Left Rotated Array: " + Arrays.toString(arr2));
    }
}
