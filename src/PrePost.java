import java.util.Arrays;

public class PrePost {
    public static void pre(int[] arr)
    {
        int[] result= new int[arr.length];
        Arrays.fill(result,1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(result[i]);
        }


    }

    public static void main(String[] args)
    {
        int [] arr=new int[]{1,2,3,4,2,1};
        int n=arr.length;
        pre(arr);
    }
}
