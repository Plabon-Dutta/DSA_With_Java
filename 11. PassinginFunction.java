import java.util.Arrays;
import java.util.Scanner;

public class PassinginFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        change(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr) {
        arr[0] = -1;
    }
}
