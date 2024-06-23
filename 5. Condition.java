import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        // Example if-else
        if (num < 10) {
            System.out.println("1 Digit");
        }
        else if (num < 100) {
            System.out.println("2 Digit");
        }
        else {
            System.out.println("More Than 2 Digit");
        }

        int num2 = 10;
        //Example switch-case
        switch(num2){
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("Not Ten");
                break;
        }

    }
}
