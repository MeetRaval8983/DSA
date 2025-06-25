public class Recursion {
    public static void main(String[] args) {
        System.out.println();
        numbers(1);
        fibonacci(0, 1, 10);
        System.out.println("\n" + fibonaccinum(7));

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        if(result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
    static void numbers(int n) {
        if(n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        
        // tail recursion
        numbers(n + 1);
    }
    static void fibonacci(int a, int b, int n) {
        if(n == 0) {
            return;
        }
        System.out.print(a + " ");

        // tail recursion
        fibonacci(b, a + b, n - 1);
    }
    static int fibonaccinum(int n) {

        if(n < 2) {
            return n;
        }

        // recursive case
        return fibonaccinum(n - 1) + fibonaccinum(n - 2);
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target) {
            return mid;
        } else if(arr[mid] < target) {
            return binarySearch(arr, target, start, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, end);
        }
    }
}

