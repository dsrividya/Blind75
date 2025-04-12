import java.util.Arrays;

public class MergeTwoSorts {

    public static int[] merge(int[] a, int[] b) {
        int l = a.length;
        int l1 = b.length;
        int i = 0, j = 0, k = 0;
        int[] c = new int[l + l1];

        while (i < l && j < l1) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < l) {
            c[k++] = a[i++];
        }

        while (j < l1) {
            c[k++] = b[j++];
        }

        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 7};
        int[] b = {2, 4, 5, 6};
        int[] merged = merge(a, b);

        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
}
