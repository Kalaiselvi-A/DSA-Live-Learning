public class ArrayDeletion {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int deleteIndex = 1; // delete element at index 1 (20)

        int[] newArr = new int[arr.length - 1];
        int j = 0;

        /*
         Copy all elements except the one at deleteIndex
        */
        for (int i = 0; i < arr.length; i++) {
            if (i != deleteIndex) {
                newArr[j] = arr[i];
                j++;
            }
        }

        System.out.println("Array after deletion:");
        for (int x : newArr) {
            System.out.print(x + " ");
        }
    }
}
