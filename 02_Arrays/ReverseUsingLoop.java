public class ReverseUsingLoop {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        int[] reversed = new int[n];

        /*
         Loop from end of original array
         and store in new array from beginning
        */
        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - 1 - i];
        }

        System.out.println("Reversed Array:");
        for (int x : reversed) {
            System.out.print(x + " ");
        }
    }
}
