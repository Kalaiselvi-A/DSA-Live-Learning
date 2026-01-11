public class SecondSmallest {

    public static void main(String[] args) {

        int[] arr = {7, 2, 9, 4};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        /*
         Traverse array to find smallest and second smallest
        */
        for (int x : arr) {

            if (x < smallest) {
                secondSmallest = smallest;
                smallest = x;
            } else if (x < secondSmallest && x != smallest) {
                secondSmallest = x;
            }
        }

        System.out.println("Second Smallest: " + secondSmallest);
    }
}
