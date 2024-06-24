import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        func(1, 2, 3, 4);
        func("Plabon");
        func(1, "Plabon", 1, 2,3);
    }

    public static void func(int ...a) { // No of Passing Variable can be different each time // can pass any no of arguments
        System.out.println(Arrays.toString(a));
    }

    public static void func(String s) {
        System.out.println(s);
    }

    public static void func(int a, String s, int ...b) {
        System.out.println(a + " " + s + " " + Arrays.toString(b));
    }
}

// Variable Arguments and Method overloading has been shown here
