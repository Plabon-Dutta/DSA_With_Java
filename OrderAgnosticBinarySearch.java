import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int target = in.nextInt();

        System.out.println(order_agnostic_binary_search(arr, target));
    }

    static boolean order_agnostic_binary_search(int[] arr, int target) {
        int left = 0, right = arr.length;

        boolean isAsc = arr[0] <= arr[right - 1];

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isAsc) {
                if (arr[mid] == target) {
                    return true;
                }
                else if (arr[mid] < target) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
            else {
                if (arr[mid] == target) {
                    return true;
                }
                else if (arr[mid] > target) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }

        return false;
    }
}
