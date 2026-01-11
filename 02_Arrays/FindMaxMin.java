public class FindMaxMin {

    public static void main(String[] args) {

        int[] arr = {4, 9, 2, 7};

        int max = arr[0];
        int min = arr[0];

        /*
         Traverse array and update max and min
        */
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
