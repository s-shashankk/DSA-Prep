public class MoveZeroes007 {
    public static int[] moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {                       //nums[j]  this stops exactly at 0
                int temp=nums[i];  //nums[i] wii go till non zero digit , then swap nums[i] and nums[j]
                nums[i]=nums[j];   // If current element is not zero, we need to move it to the front
                nums[j]=temp;
                j++;
            }
        }
        return nums;
    }
    public static void main(String[]args)
    {
        int[]arr={0,1,0,0,3,4};
        int res[]=moveZeroes(arr);
        for(int i:res)
        {
            System.out.print(i+" ");
        }
    }
}
