public class FindMax {

    public static void main(String[] args) {

        int[] arr = {10, 50, 30, 20};

        int max = arr[0]; // assume first element is max

        /*
         Compare each element with max
        */
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
    }
}
