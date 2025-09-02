public class secondLargest002 {
    public static int secondLargestElement(int[] nums) {
        int highest=nums[0];
        int second=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>second && nums[i]>highest)
            {
                second=highest;
                highest=nums[i];
            }
            else if(nums[i]>second && nums[i]<highest)
            {
                second=nums[i];
            }
            else if(nums[i]==highest)
            {
                return -1;
            }
        }
        return second;
    }
    public static void main(String[] args)
    {
        int arr[]={-1,2,5,3,9,6,5,4};
        int res=secondLargestElement(arr);
        System.out.println(res);
    }
}
