public class KadaneAlgo {
    public static void main(String[]args)
    {
        int[]nums={-2,1,-3,4,-1,2,1,-5,4};
        int res=kadane(nums);
        System.out.println(res);
    }
    public static int kadane(int[] nums)
    {
        int max=nums[0];
        int maxtillnow=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            maxtillnow=Math.max(nums[i],maxtillnow+nums[i]);
            max=Math.max(max,maxtillnow);
        }
        return max;
    }

}
