public class Shadowing {
    static int a = 10;  // shadowed at line 6
    public static void main(String[] args) {
        System.out.println(a);  // 10
        int a; // class variable at line 2 is shadowed by this
        // System.out.println(a); The local variable a may not have been initialized
        // scope will begin when value will be initialized
        a = 20;
        System.out.println(a);  // 20
        demo();
        System.out.println(Shadowing.a);
    }
    static void demo() {
        System.out.println(a);  // 10
    }
}
