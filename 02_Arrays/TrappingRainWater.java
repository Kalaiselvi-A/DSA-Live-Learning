public class TrappingRainWater {

    public static void main(String[] args) {

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int left = 0, right = height.length - 1;
        int maxLeft = 0, maxRight = 0;
        int trappedWater = 0;

        while (left <= right) {
            if (height[left] < height[right]) {
                trappedWater += Math.max(0, maxLeft - height[left]);
                maxLeft = Math.max(maxLeft, height[left]);
                left++;
            } else {
                trappedWater += Math.max(0, maxRight - height[right]);
                maxRight = Math.max(maxRight, height[right]);
                right--;
            }
        }

        System.out.println("Total water trapped: " + trappedWater);
    }
}
