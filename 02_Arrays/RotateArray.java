public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // positions to rotate
        int n = arr.length;

        int[] rotated = new int[n];

        /*
         Place each element at new position (i + k) % n
        */
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        System.out.println("Array after rotating by " + k + " positions:");
        for (int x : rotated) {
            System.out.print(x + " ");
        }
    }
}
