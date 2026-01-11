public class ArrayTraversal {

    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20, 25};

        /*
         Traversing an array means visiting each element one by one.
         We use a loop from index 0 to length - 1.
        */

        System.out.println("Array Elements:");

        for (int i = 0; i < arr.length; i++) {
            // Printing element at current index
            System.out.println("Index " + i + " -> " + arr[i]);
        }
    }
}
