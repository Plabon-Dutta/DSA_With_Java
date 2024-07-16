// rows are sorted and columns are sorted

import java.util.Scanner;

public class BinarySearch2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int target = in.nextInt();

        int[] ans = binary_search_2d(arr, target);

        if (ans[0] == -1 && ans[1] == -1) System.out.println("Not Found!!!");
        else System.out.println((ans[0] + 1) + " " + (ans[1] + 1));
    }

    public static int[] binary_search_2d(int[][] arr, int target) {
        int row = 0, col = arr.length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[] {row, col};
            }
            else if (arr[row][col] > target){
                col--;
            }
            else {
                row++;
            }
        }

        return new int[] {-1, -1};
    }
}
