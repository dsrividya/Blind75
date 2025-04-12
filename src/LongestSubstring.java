public class LongestSubstring {


    public static String substring1(String[] a)
    {
        String prfix= a[0];
        for(int i=0;i<a.length;i++)
        {
            while(a[i].indexOf(prfix)!=0)
            {
                prfix=prfix.substring(0,prfix.length()-1);
            }
            if(prfix.isEmpty())
            {
                return " ";
            }
        }
        return prfix;
    }
    public static void main(String[] args)
    {
        String[] s= new String[]{"flower", "float","f"};
       System.out.println(substring1(s));
    }
}
