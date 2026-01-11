public class TopTwoElements {

    public static void main(String[] args) {

        int[] arr = {3, 9, 1, 7};

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        /*
         Traverse array to get top two maximum values
        */
        for (int x : arr) {

            if (x > firstMax) {
                secondMax = firstMax;
                firstMax = x;
            } else if (x > secondMax && x != firstMax) {
                secondMax = x;
            }
        }

        System.out.println("Largest: " + firstMax);
        System.out.println("Second Largest: " + secondMax);
    }
}
