import java.util.Arrays;

public class ValidAnagram {
    public static boolean valid(String s1, String s2)
    {
        char[] c= s1.toCharArray();
        char[] d= s2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);

        return Arrays.equals(c,d);

    }
    public static void main(String[] args)
    {
       String s1="eat";
       String s2="ater";
        System.out.println(valid(s1,s2));

    }
}
