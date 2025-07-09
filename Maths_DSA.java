import java.util.*;

public class Maths_DSA {
    public static void main(String[] args) {
        int n = 40;
        // for(int i = 2; i < n; i++) {
            // System.out.println(i + " : " + isPrime(i));
            // printPrime(i);
        // }
        // boolean[] b = new boolean[n+1];
        // printPrimeUsingArray(n, b);
        n = 40;
        int p = 3;
        System.out.println(sqrtnum(n, p));
        System.out.println(Math.sqrt(n));
        factor(20);
        factor2(20);
        factorstore(20);
    }
    static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void printPrime(int n) {
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
               return;
            }
        }
        System.out.print(n + " ");
    }
    static void printPrimeUsingArray(int n, boolean[] b) {
        for(int i = 2; i*i <= n; i++) {
            if(!b[i]) {
                for(int j = i * 2; j <= n; j+=i) {
                    b[j] = true;
                }
            }
        }
        for(int i = 2; i <= n; i++) {
            if(!b[i]) {
                System.out.print(i + " ");
            }
        }
    }

    // Time = O(log(n))
    static double sqrtnum(int n, int p) {
        int low = 0;
        int high = n;
        double root = 0.0;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(mid * mid == n) {
                return mid;
            } else if(mid * mid > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        double inc = 0.1;
        for(int i = 0; i < p; i++) {
            while(root * root <= n) {
                root += inc;
            }
            root -= inc;
            inc /= 10;
        }
        return root;
    }
    
    // Time = O(n)
    static void factor(int n) {
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Time = O(sqrt(n))
    static void factor2(int n) {
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                if(i == n/i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
        System.out.println();
    }

    // Time and space both O(sqrt(n)) as we are also storing in arraylist now end elements
    static void factorstore(int n) {
        List<Integer> list = new ArrayList();
        for(int i = 1; i < Math.sqrt(n); i++) {
            if(n % i == 0) {
                if(i == n/i) {
                    System.out.print(i + " ");
                }
                System.out.print(i + " ");
                list.add(n/i);
            }
        }
        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}