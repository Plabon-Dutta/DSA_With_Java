import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Hello();

        System.out.print("Enter Two Numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Result: " + Sum(a, b));
    }

    public static void Hello() {
        System.out.println("Welcome to Java!!!");
    }

    public static int Sum(int a, int b) {
        return a + b;
    }
}
