public class ArrayRotation {
    public static void main(String[]args)
    {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        int[] r=rotate(arr,k);
        for(int i: r)
        {
            System.out.print(i+" ");
        }
    }
    public static int[] rotate(int[] arr, int k)
    {
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            res[(i+k)%arr.length]=arr[i];
        }
        return res;
    }
}
