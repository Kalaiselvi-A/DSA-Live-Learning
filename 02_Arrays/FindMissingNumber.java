public class FindMissingNumber {

    public static void main(String[] args) {

        int[] arr = {3, 0, 1};
        int n = arr.length;

        // Approach 1: Sum Formula
        int sum_n = n * (n + 1) / 2;
        int sum_arr = 0;
        for (int num : arr) {
            sum_arr += num;
        }

        int missing = sum_n - sum_arr;
        System.out.println("Missing Number: " + missing);

        // Approach 2: XOR (alternative)
        int xorAll = 0;
        int xorArr = 0;

        for (int i = 0; i <= n; i++) {
            xorAll ^= i;
        }

        for (int num : arr) {
            xorArr ^= num;
        }

        int missingXOR = xorAll ^ xorArr;
        System.out.println("Missing Number (XOR method): " + missingXOR);
    }
}
