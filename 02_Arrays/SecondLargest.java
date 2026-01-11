public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {10, 40, 30, 20};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        /*
         Traverse array to find largest and second largest
        */
        for (int x : arr) {

            if (x > largest) {
                secondLargest = largest;
                largest = x;
            } else if (x > secondLargest && x != largest) {
                secondLargest = x;
            }
        }

        System.out.println("Second Largest: " + secondLargest);
    }
}
