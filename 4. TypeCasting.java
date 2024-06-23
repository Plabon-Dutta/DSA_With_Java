public class TypeCasting {
    public static void main(String[] args) {
        int num = (int)(15.123f);
        System.out.println("Number: " + num);

        byte a = 100;
        byte b = 100;
        int res = a * b; //converting the bytes into Int for expression
        System.out.println("Result: " + res);

        int c = 'a';
        System.out.println(c); // printing the Ascii value

        byte n1 = 100;
        int n2 = 10000;
        char ch1 = 'b';
        float n3 = 1234.12f;
        double n4 = 123456.12345;
        short n5 = 1024;

        double result = (n1 * n3) + (n2 / ch1) + (n4 - n5);
        System.out.println((n1 * n3) + " " + (n2 / ch1) + " " + (n4 - n5));
        System.out.println(result);
    }
}
