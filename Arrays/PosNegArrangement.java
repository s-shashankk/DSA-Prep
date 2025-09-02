import java.util.Arrays;

public class PosNegArrangement {
    public static void main(String[]args)
    {
        int[]nums={-2,1,-3,4,-1,2,1,-5,4};
        int res[]=posneg(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] posneg(int[] nums) {

        int n = nums.length;
        int[] newArray = new int[n];

        int positive = 0;
        int negative = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                newArray[positive] = nums[i];
                positive = positive + 2;
            } else {
                newArray[negative] = nums[i];
                negative = negative + 2;
            }
        }
        return newArray;

    }
}
