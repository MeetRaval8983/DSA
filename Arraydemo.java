import java.util.Scanner;
import java.util.Arrays;

public class Arraydemo {
    // null is a special literal for reference variable used with non-primitive type but not with primitive type
    // primitives are stored in stack memory and other are stored in heap memory
    public static void main(String[] args) {
        int[] ar; // declaration of array, arr is defined in the stack
        ar = new int[5]; // initialization of object is created in heap memeory
        System.out.println(ar[0]);  // by default all values will be 0

        String[] s = new String[4];
        System.out.println(s[0]);

        String str = null;

        // int[] a = new int[5];
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < a.length; i++) {
        //     a[i] = sc.nextInt();
        // }
        // for (int i = 0; i < a.length; i++) {
        //     System.out.print(a[i] + " ");
        // }
        // System.out.println();
        // for (int i : a) {
        //     System.out.print(i + " ");
        // }
        // System.out.println("\n" + Arrays.toString(a));
        // a[1] = 10;
        // System.out.println(Arrays.toString(a));

        // String[] st = new String[5];
        // for (int i = 0; i < st.length; i++) {
        //     st[i] = sc.next();
        // }

        // for (String string : st) {
        //     System.out.print(string + " ");
        // }

        // int[][] arr = {
        //     {1, 2, 3, 4},
        //     {5, 6},
        //     {7, 8, 9}
        // };

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

    }
}
