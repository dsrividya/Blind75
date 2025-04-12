import java.util.Arrays;
import java.util.HashSet;

public class TwoSum {

    public static int[] twosum(int[] a, int target)
    {
        HashSet<Integer> h= new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            int c= target-a[i];
            if(h.contains(c))
            {
                return new int[]{a[i],c};
            }
            h.add(a[i]);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args)
    {
        int[] a= new int[]{1,2,3,6,7};
        int target= 3;
        System.out.println(Arrays.toString(twosum(a,target)));
    }
}
