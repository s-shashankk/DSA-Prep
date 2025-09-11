class SquareofSortedArray  {
    public int[] sortedSquares(int[] nums) {
        int left=0,right=nums.length-1;
        int[] result=new int[nums.length];
        int n=nums.length;
        int pos=n-1;

        while(left<=right)
        {
            int leftSquare=nums[left]*nums[left];
            int rightSquare=nums[right]*nums[right];

            if(leftSquare > rightSquare)
            {
                result[pos]=leftSquare;
                left++;
            }
            else{
                result[pos]=rightSquare;
                right--;
            }
            pos--;
        }
        return result;

    }
}
