import java.util.ArrayList;
import java.util.Arrays;

public class string_stringbuilder {
    public static void main(String[] args) {
        String a = "Meet";
        String b = "Meet";
        String c = a;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));

        String d = new String("Demo");
        String e = new String("Demo");
        System.out.println(d == e);
        System.out.println(d.equals(e));

        System.out.println(70);
        System.out.println("Hello");
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4, 5}));

        String s = null;
        System.out.println(s);

        // Wrapper class
        Integer i = new Integer(100);
        System.out.println(i);

        // Placeholder in string
        float f = 243.256f;
        System.out.printf("%.2f\n", f);
        System.out.printf("%.3f\n",Math.PI);
        System.out.printf("My name is %s and I am %d years old\n", "John", 30);

        // operators in string
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 1));

        // here integer will be converted to string
        // it calls toString() method of Integer class
        System.out.println("a" + 1);

        System.out.println("Hello" + new ArrayList<>());
        System.out.println("Hello " + new Integer(70));
        System.out.println(new Integer(70) + "" + new ArrayList<>());
    }
}
