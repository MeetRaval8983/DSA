public class Basic_recursion {
    public static void main(String[] args) {
        System.out.println();
        printntimes("Hello", 5);
        print1ton(5);
        System.out.println();
        printnto1(5);
        System.out.println();
        System.out.println("Sum of n: " + sumofn(5));
        System.out.println("Factorial: " + fact(5));
        int[] arr = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        reversearray(arr, 0, arr.length - 1);
        System.out.println();
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private static void printntimes(String s, int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n + ":" +s);
        printntimes(s, --n);
    }
    private static void print1ton(int n) {
        if(n == 0) {
            return;
        }
        print1ton(n - 1);
        System.out.print(n + " ");
    }
    private static void printnto1(int n) {
        if(n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printnto1(--n);
    }
    private static int sumofn(int n) {
        if(n == 1) {
            return 1;
        }
        return n + sumofn(n - 1);
    }
    private static int fact(int n) {
        if(n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
    private static void reversearray(int[] arr, int i, int j) {
        if(i >= j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reversearray(arr, i + 1, j - 1);
    }
}
