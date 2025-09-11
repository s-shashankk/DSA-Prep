class MaxAverageSubArray {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        // Step 1: compute first window sum
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxsum = sum;

        // Step 2: slide the window
        for (int i = 0; i < nums.length - k; i++) {
            sum = sum - nums[i] + nums[i + k]; // remove old, add new
            maxsum = Math.max(maxsum, sum);
        }

        // Step 3: return maximum average
        return maxsum / k;
    }

    public static void main(String[] args) {
        MaxAverageSubArray sol = new MaxAverageSubArray();
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        System.out.println("Max average: " + sol.findMaxAverage(nums1, k1)); // Output: 12.75

        int[] nums2 = {5};
        int k2 = 1;
        System.out.println("Max average: " + sol.findMaxAverage(nums2, k2)); // Output: 5.0
    }
}
