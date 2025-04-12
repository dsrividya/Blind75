public class BinarySearch {
    public static int binary(int[] a, int target)
    {
        int left=0;
        int right=a.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(a[mid]==target)
            {
                return mid;
            }
            else if(a[mid]<target)
            {
                left=mid+1;
            }
            else {
                right= mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int [] a= new int[]{1,2,3,4,5,6,7};
        int target=3;
        System.out.println(binary(a, target));
    }
}
