public class BestBuy {
    public static void best(int[] a)
    {

        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
            else {
                max = Math.max(max, a[i] - min);
            }

        }
        System.out.println(max);
    }
    public static void main(String[] args)
    {
        int[] a= new int[]{1,3,2,4,5,3};
        int n=a.length;
        best(a);
    }
}
