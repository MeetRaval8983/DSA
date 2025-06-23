public class Scoping {

    // function scope
    static void demo(int b) {
        int a = 10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        String n = "Meet";

        {
            // block scope
            // int a = 35; already initialize outside block, so cannot initialize again
            a = 300;  // reassigning original reference variable
            System.out.println(a);
            n = "Meet Raval";
            System.out.println(n);
            int c = 1000;
            // values initialized in this block, will remain in this block
        }
        int c = 1; // can be initialized again outside the block
        System.out.println(a);
        System.out.println(n);

        // scoping in for loop
        for(int i=1; i<4; i++) {
            System.out.println(i);
            a = 1;
        }
        System.out.println(a);

    }
}
