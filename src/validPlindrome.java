public class validPlindrome {
    public static boolean valid(String s)
    {
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)==s.charAt(right))
            {
                return true;
            }
            left++;
            right--;
        }
        return false;
    }
    public static void main(String[] args)
    {
           String s="madam1";
           System.out.println(valid(s));
    }
}
