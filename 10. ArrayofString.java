import java.util.Arrays;
import java.util.Scanner;

public class ArrayofString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input. nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = input.next();
        }

        System.out.println(Arrays.toString(str));

        for (String i : str) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();
    }
}
