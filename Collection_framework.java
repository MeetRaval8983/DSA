import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Collection_framework {
    public static void main(String[] args) {
        // Collection

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(50);
        vector.add(60);
        vector.add(70);
        vector.add(80);
        System.out.println(vector);
    }
}