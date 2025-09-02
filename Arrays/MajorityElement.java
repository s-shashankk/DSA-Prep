import java.util.Arrays;

public class MajorityElement {
    public static void main(String[]args)
    {
        int[]arr={0,0,1,0,0,3,4};
        int res=majority(arr);
        System.out.println(res);
    }
    public static int majority(int[] nums) {
        int res= nums.length/2;
        Arrays.sort(nums);
        int count=0;
        int ans=nums[0];
        int max=0;
        int i=0,j=1;
        while(j<nums.length)
        {
            if(ans==nums[j])
            {
                count++;
                max=Math.max(count,max);
                j++;
            }else{
                ans=nums[j];
                count=0;
                j++;
            }
        }
        if(max>=res)
        {
            return nums[max];
        }
        return -1;
    }
}
