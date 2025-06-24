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

        s = "";
        for(i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            s += ch;
        }
        System.out.println(s);
        
        // StringBuilder
        StringBuilder sb =new StringBuilder();
        for(i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            sb.append(ch);
        }
        System.out.println(sb.toString());
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.reverse());

        s = "Hello World";
        System.out.println(s.toLowerCase());
        System.out.println("     Welcome to Java     ".trim());
        System.out.println(Arrays.toString(s.split(" ")));
        System.out.println(s.replace("World", "Java"));

        s = "abcba";
        System.out.println(isPalindrome(s));

        String str = "abc";
        StringBuilder builder = new StringBuilder(str);
        StringBuilder builder2 = new StringBuilder(str).reverse();
        System.out.println(builder.toString().equals(builder2.toString()));
    }
    static boolean isPalindrome(String s) {
        for(int i = 0; i <= s.length() / 2; i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length() - i - 1);
            if(start != end) {
                return false;
            }
        }
        return true;
    }
}
