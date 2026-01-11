public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int start = 0;
        int end = arr.length - 1;

        /*
         Swap elements from both ends until pointers meet
        */
        while (start < end) {

            // Swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print reversed array
        System.out.println("Reversed Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
