public class CheckIfArrayIsSorted {
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
    public static void main(String[] args)
    {
        int arr[]={4,5,1,2,3};  //True
        Boolean res=check(arr);
        System.out.println(res);
    }
}
//here i am checking for circular array
//there can only be one big difference but rest all shd be with only one difference
