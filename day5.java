import java.util.*;

public class day5 {
    public static List<Integer> Maxright(int[] a) {
        List<Integer> leaders = new ArrayList<>();
        int n = a.length;

        if (n == 0) {
            return leaders; // Return an empty list for an empty array
        }

        int maxRight = a[n - 1];
        leaders.add(maxRight);

        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > maxRight) {
                maxRight = a[i];
                leaders.add(maxRight);
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] a = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = Maxright(a);
        System.out.println("Leader elements: " + leaders);
    }
}