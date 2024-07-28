import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        bubble_sort_Asc(ar, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        
        bubble_sort_Desc(ar, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    // bubble sort in Ascending Order
    public static void bubble_sort_Asc(int[] ar, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 1; j < n - i; j++) {
                if (ar[j] < ar[j - 1]) {
                    flag = true;
                    int tmp = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = tmp;
                }
            }

            if (!flag) break;
        }
    }

    // bubble sort in Descending Order
    public static void bubble_sort_Desc(int[] ar, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 1; j < n - i; j++) {
                if (ar[j] > ar[j - 1]) {
                    flag = true;
                    int tmp = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = tmp;
                }
            }

            if (!flag) break;
        }
    }
}
