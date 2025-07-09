public class Recursion1 {
    public static void main(String[] args) {
        int n = 5;
        printNumber(n);
        System.out.println();
        printNumber1(n);
        System.out.println();
        System.out.println(fact(n));
        System.out.println(sum(n));
        System.out.println(sumOfDigits(1234));
        System.out.println(productOfDigits(1234));
        prepostconcept(n);
        reversenum(1234);
        System.out.println(sum);
        System.out.println(reversenum1(12345));
        System.out.println(isPalindrome(12321));
        System.out.println(countZeros(3020400));
    }
    static void printNumber(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }
    static void printNumber1(int n) {
        if(n == 0) {
            return;
        }
        printNumber1(n-1);
        System.out.println(n);
    }
    static int fact(int n) {
        if(n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
    static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
    static int sumOfDigits(int n) {
        if(n == 0) {
            return 0;
        }
        return (n%10) + sumOfDigits(n/10);
    }
    static int productOfDigits(int n) {
        if(n == 0) {
            return 1;
        }
        return (n%10) * productOfDigits(n/10);
    }
    static void prepostconcept(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        prepostconcept(--n);
        // not n-- use --n
    }
    static int sum = 0;
    static void reversenum(int n) {
        if(n == 0) {
            return;
        }
        int r = n % 10;
        sum = (sum * 10) + r;
        reversenum(n/10);
    }
    static int reversenum1(int n) {
        return helper(n, 0);
    }
    static int helper(int n, int rev) {
        if(n == 0) {
            return rev;
        }
        int r = n % 10;
        return helper(n / 10, rev * 10 + r);
    }
    
    static boolean isPalindrome(int n) {
        return n == reversenum1(n);
    }

    static int countZeros(int n) {
        return countZerosHelper(n, 0);
    }
    
    static int countZerosHelper(int n, int c) {
        if(n == 0) {
            return c;
        }
        int r = n % 10;
        if(r == 0) {
            return countZerosHelper(n / 10, c+1);
        }
        return countZerosHelper(n / 10, c);
    }
}