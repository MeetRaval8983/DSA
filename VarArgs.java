import java.util.Arrays;

// Variable arguments is used when we don't no about the total no. of arguments
public class VarArgs {
    public static void main(String[] args) {
        fun(32,52,25,24,22,52,7475,35,584);    
        fun();  // 0 arguments
        funct(1, 2, "Meet", "Raval");
    }
    
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    // The variable argument type int of the method funct must be the last parameter
    static void funct(int a, int b, String ...s) {
        System.out.println(a + " " + b + " " + Arrays.toString(s));
    }
    
    // static void funct(int a, int b, int ...v) {}
}
