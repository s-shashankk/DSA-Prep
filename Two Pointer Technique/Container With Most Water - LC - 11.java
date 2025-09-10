class Solution {
    public int maxArea(int[] height) {
   
        int i=0,j=height.length-1;
        int max=0;
        while(i<j)
        {
            int minheight=Math.min(height[i],height[j]);
           int area = (j-i)*minheight;
           max=Math.max(area,max);

            if((height[i]<height[j]))
            {
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}
