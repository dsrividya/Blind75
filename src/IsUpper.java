public class IsUpper {

    static int numberofCap=0;
    public static boolean cap(String s)
    {
        for(int i=0; i<s.length()-1;i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                numberofCap++;
            }
        }
        if(numberofCap==s.length()||numberofCap==0)
        {
            return true;
        }
        if(numberofCap==1||Character.isUpperCase(s.charAt(0)))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        String s= "bbbbb";
        System.out.println(cap(s));
    }

}
