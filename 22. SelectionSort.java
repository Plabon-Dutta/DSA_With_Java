import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        selection_sort_Asc(ar, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        selection_sort_Desc(ar, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static void selection_sort_Asc(int[] ar, int n) {
        for (int i = 0; i < n; i++) {
            int end = n - i, index = 0;
            for (int j = 0; j < end; j++) {
                if (ar[index] < ar[j]) {
                    index = j;
                }
            }

            int tmp = ar[end - 1];
            ar[end - 1] = ar[index];
            ar[index] = tmp;
        }
    }

    public static void selection_sort_Desc(int[] ar, int n) {
        for (int i = 0; i < n; i++) {
            int end = n - i, index = 0;
            for (int j = 0; j < end; j++) {
                if (ar[index] > ar[j]) {
                    index = j;
                }
            }

            int tmp = ar[end - 1];
            ar[end - 1] = ar[index];
            ar[index] = tmp;
        }
    }
}
