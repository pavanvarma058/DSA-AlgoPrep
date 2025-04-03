import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList or Dynamic Array
        ArrayList<Integer> list = new ArrayList<>();
        // Adding items in the list
        list.add(10);
        list.add(20);
        list.add(30);

        // To access index
        System.out.println(list.get(1));

        // Update the value
        System.out.println(list.set(2, 200));

        // No.of element
        System.out.println(list.size());

        // Remove index
        System.out.println(list.remove(0));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
