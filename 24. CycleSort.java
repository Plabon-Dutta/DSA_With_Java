import java.util.Scanner;

public class CycleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        cycle_sort(ar, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static void cycle_sort(int[] ar, int n) {
        for (int i = 0; i < n; i++) {
            while (ar[i] != i + 1) {
                int tmp = ar[ar[i] - 1];
                ar[ar[i] - 1] = ar[i];
                ar[i] = tmp;
            }
        }
    }
}
