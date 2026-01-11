public class ReverseInPlace {

    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20};

        int left = 0;
        int right = arr.length - 1;

        /*
         Reverse without using extra space
        */
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
