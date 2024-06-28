import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        System.out.println(list.contains(10)); // checks the arraylist contain that value on not
        System.out.println(list.contains(1000));

        System.out.println(list);
        list.set(0, 100); // update the xth index value
        System.out.println(list);

        list.remove(1); //remove the xth index value
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
