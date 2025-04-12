
public class Palindrome {

    public static boolean palin(String s)
    {
        String s1= s.replace(" ","").toLowerCase();
        int left=0;
        int right=s1.length()-1;
        while(left<right)
        {
            if(s1.charAt(left)!=s1.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String s="race a ecar";
       System.out.println( palin(s));
    }
}
