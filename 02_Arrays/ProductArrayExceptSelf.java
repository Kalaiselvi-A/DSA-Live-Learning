import java.util.Arrays;

public class ProductArrayExceptSelf {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int n = nums.length;

        int[] output = new int[n];

        // Step 1: Left product
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        // Step 2: Right product
        int R = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= R;
            R *= nums[i];
        }

        System.out.println("Product of array except self: " + Arrays.toString(output));
    }
}
