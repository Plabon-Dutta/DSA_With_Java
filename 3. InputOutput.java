import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // defining Scanner

        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        System.out.println("The Number is: " + num);

        System.out.print("Enter a Float Number: ");
        float num2 = input.nextFloat();
        System.out.println("The Number is: " + num2);

        System.out.print("Enter a Long Number: ");
        long num3 = input.nextLong();
        System.out.println("The Number is: " + num3);

        System.out.print("Enter a Double Number: ");
        double num4 = input.nextDouble();
        System.out.println("The Number is: " + num4);

        System.out.print("Enter a Character: ");
        char ch = input.next().charAt(0);
        System.out.println("The Character is: " + ch);

        System.out.print("Enter a String: ");
        String s = input.next(); // Here it will take the first word or till the first whitespace
        System.out.println("The String is: " + s);

        System.out.print("Enter a Line: ");
        String s2 = input.nextLine(); // Here it will take the whole line
        System.out.println("The String is: " + s2);
    }
}
