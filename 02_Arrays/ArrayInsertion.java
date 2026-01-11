public class ArrayInsertion {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int newElement = 25;
        int position = 2; // index where element will be inserted

        // Create new array of size n+1
        int[] newArr = new int[arr.length + 1];

        /*
         Copy elements before the insertion position
        */
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        /*
         Insert the new element
        */
        newArr[position] = newElement;

        /*
         Shift remaining elements
        */
        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        // Print new array
        System.out.println("Array after insertion:");
        for (int x : newArr) {
            System.out.print(x + " ");
        }
    }
}
