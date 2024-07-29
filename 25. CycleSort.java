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
        int i = 0;
        while (i < n) {
            int index = ar[i] - 1;
            if (ar[index] != ar[i]) {
                int tmp = ar[i];
                ar[i] = ar[index];
                ar[index] = tmp;
            }
            else {
                i++;
            }
        }
    }
}
