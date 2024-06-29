import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList <ArrayList<Integer>> list = new ArrayList<>();

        // initializing
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        int num = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                list.get(i).add(num);
                num++;
            }
        }

        System.out.println(list);

        
    }
}
