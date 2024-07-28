import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

        insertion_sort_Asc(ar, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        insertion_sort_Desc(ar, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static void insertion_sort_Asc(int[] ar, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (ar[j] < ar[j - 1]) {
                    int tmp = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = tmp;
                }
                else {
                    break;
                }
            }
        }
    }

    public static void insertion_sort_Desc(int[] ar, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (ar[j] > ar[j - 1]) {
                    int tmp = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = tmp;
                }
                else {
                    break;
                }
            }
        }
    }
}
