import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int x = in.nextInt();

        boolean ans = linear_search(a, x);

        System.out.println(ans);
    }

    static boolean linear_search(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return true;
            }
        }

        return false;
    }
}
