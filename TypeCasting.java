public class TypeCasting {
    public static void main(String[] args) {

        // Implicit type casting
        int n = 141;
        float f = n;
        System.out.println(f);

        // Explicit type casting
        int i = (int)(25.53);
        System.out.println(i);

        // automatic type promotion in expression
        int k = 257;
        byte b = (byte)k;
        System.out.println(b); //257 % 256 = 1


        byte a = 20;
        byte c = 40;
        byte d = 10;
        int e = (a * c) / d;
        System.out.println(e);

        byte bt = 20;
        bt = (byte)(bt * 2);   // In Java, arithmetic operations on byte, short, or char promote them to int, so explicit casting is required to assign the result back to a smaller type like byte
        System.out.println(bt);

        // Java follows the Unicode principle
        int num1 = 'a';
        System.out.println(num1);
        int num2 = 'A';
        System.out.println(num2);

        // Type promotion rules
        // byte, short, int will be converted to int 
        // int, float to float
        // float, int, long to long
        System.out.println(3 * 4.6);
        System.out.println('a' * 1);

        byte m = 2;
        char ch = 'a';
        short sh = 1234;
        int p = 23425;
        float q = 132.52f;
        double r = 23124.523423;
        double result = (m + r) + (sh * p) - (q * ch);
        System.out.println((m + r) + " " + (sh * p) + " " + (q * ch));
        // double + int - float = double
        System.out.println(result);

    }
}
