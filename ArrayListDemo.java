import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ArrayList<Integer> list = new ArrayList<>(2);
        
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);

        // System.out.println(list);
        // System.out.println(list.contains(20));

        // list.set(0, 400);
        // System.out.println(list);

        // list.remove(0);
        // System.out.println(list);

        // for (int i = 0; i < 2; i++) {
        //     list.add(sc.nextInt());
        // }

        // for (int i = 0; i < 2; i++) {
        //     System.out.println(list.get(i));
        // }

        // Multidimensional arraylist
        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialization we need to initialize as to create list as above declaration is empty
        // we need to add ArrayList in the list, to create individual list for each object
        // for (int i = 0; i < 3; i++) {
        //     list.add(new ArrayList<>());
        // }

        // add elements
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         list.get(i).add(sc.nextInt());
        //     }
        // }

        // System.out.println(list);

        int[] a = {1,4,6,3,35};
        System.out.println(Arrays.toString(a));
        swap(a,0,4);
        System.out.println(Arrays.toString(a));

        System.out.println(max(a));

        reverse(a);
        System.out.println(Arrays.toString(a));

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int max(int[] arr) {
        int m = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > m) {
                m = arr[i];                
            }
        }
        return m;
    }

    static void reverse(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
