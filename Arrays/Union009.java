
import java.util.HashSet;


public class Union009 {
    public static void main(String[]args)
    {
        int[]arr1={0,1,3,4,5,6,7};
        int arr2[]={6,7,8,9,10,11,12};
        HashSet<Integer> set=findUnion(arr1,arr2);
        for(int c:set)
        {
            System.out.print(c+" ");
        }
    }
    public static HashSet<Integer> findUnion(int[] arr1, int[] arr2)
    {
        HashSet<Integer> set=new HashSet<>();
        for(int i: arr1)
        {
            set.add(i);
        }
        for(int j:arr2)
        {
            set.add(j);
        }
        return set;
    }
}
