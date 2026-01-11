public class MajorityElement {

    public static void main(String[] args) {

        int[] arr = {3, 3, 4, 2, 3, 3, 5, 3};
        int n = arr.length;

        // Step 1: Find candidate
        int candidate = arr[0], count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = arr[i];
                    count = 1;
                }
            }
        }

        // Step 2: Verify candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) count++;
        }

        if (count > n / 2) {
            System.out.println("Majority Element: " + candidate);
        } else {
            System.out.println("No Majority Element");
        }
    }
}
