public class ReverseUsingRecursion {

    // Recursive function to reverse array
    static void reverse(int[] arr, int start, int end) {

        // Base case
        if (start >= end)
            return;

        // Swap
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        reverse(arr, 0, arr.length - 1);

        System.out.println("Reversed Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
