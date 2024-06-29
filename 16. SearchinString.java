import java.util.Arrays;
import java.util.Scanner;

public class SearchinString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        System.out.println(Arrays.toString(s.toCharArray()));

        char ch = in.next().charAt(0);

        boolean ans = search_in_string(s, ch);
        System.out.println(ans);

        ans = search_in_string2(s, ch);
        System.out.println(ans);

        // Search in Range
        ans = search_in_range(s, 0, 3, ch);
        System.out.println(ans);
    }

    static boolean search_in_string(String s, char ch) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }

    static boolean search_in_string2(String s, char ch) {
        for (char chr : s.toCharArray()) {
            if (chr == ch) {
                return true;
            }
        }
        return false;
    }

    static boolean search_in_range(String ss, int s, int f, char ch) {
        for (int i = s; i <= f; i++) {
            if (ss.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }
}
