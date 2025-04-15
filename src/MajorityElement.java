import java.util.HashMap;

public class MajorityElement {

    public static int majority(int[] a, int n) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i=0;i<a.length;i++) {
            freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
        }



        return 1; // No majority element
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 2, 3, 1, 1, 2, 2, 2, 1};
        int n = a.length;
        System.out.println("Majority Element: " + majority(a, n));
    }
}
