public class LargestElement001 {
    public static int largestElement(int[] nums) {
        int highest=0;
        for(int i : nums)
        {
            if(i>highest)
            {
                highest = i;
            }
        }
        return highest;
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,5,3,9,6,5,4};
        int res=largestElement(arr);
        System.out.println(res);
    }
}
