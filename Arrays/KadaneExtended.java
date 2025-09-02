import java.util.ArrayList;
import java.util.Arrays;

public class KadaneExtended {
    public static void main(String[]args)
    {
        int[]nums={-2,1,-3,4,-1,2,1,-5,4};
        int res[]=kadanePrint(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] kadanePrint(int[] nums)
    {
        int max=nums[0];
        int maxtillnow=nums[0];
        int start=0,end=0,temp=0; //Start index of max subarray,End index of max subarray ,Temporary start index for current subarray
        for(int i=1;i<nums.length;i++)
        {   // Check if current element alone is better than adding it to currSum
           if(nums[i]>nums[i]+maxtillnow)
           {
               maxtillnow=nums[i];// Start a new subarray
               temp=i;            // Mark this as new start
           }else{
               maxtillnow=maxtillnow+nums[i];  // Continue with current subarray
           }
           if(maxtillnow>max) // If current sum becomes the new max, update tracking variables
           {
               max=maxtillnow;
               start=temp; // Update start of best subarray
               end=i;      // Update end of best subarray
           }
        }
        int res[]=Arrays.copyOfRange(nums,start,end);
        return res;
    }
}
