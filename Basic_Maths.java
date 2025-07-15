public class Basic_Maths {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Total digits: " + countDigit(1234));
        System.out.println("Total digits: " + ((int)Math.log10(12345) + 1));
        System.out.println(armstrong(153));
        divisors(36);
        System.out.println("\nPrime number: " + isPrime(13));
        int a = 24, b = 36;
        int gcd = 1;
        for(int i = 2; i <= Math.min(a,b); i++) {
            if(a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD: " + gcd);
        System.out.println("GCD: " + gcdnum(24, 36));
        System.out.println("LCM: " + lcm(4, 6));
    }
    private static int countDigit(int n) {
        int c = 0;
        while(n != 0) {
            n /= 10;
            c++;
        }
        return c;
    }
    private static boolean armstrong(int n) {
        int num = n;
        int s = 0;
        int d = 0;
        while(n != 0) {
            d++;
            n /= 10;
        }
        n = num;
        while(n != 0) {
            int r = n % 10;
            int c = (int)Math.pow(r, d);
            s += c;
            n /= 10;
        }
        return num == s;
    }
    private static void divisors(int n) {
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
                if(n/i != i) {
                    System.out.print(n/i + " ");
                }
            }
        }
    }
    private static boolean isPrime(int n) {
        int c = 0;
        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                c++;
                if(n/i != i) {
                    c++;
                }
            }
        }
        return c == 2;
    }
    private static int gcdnum(int a, int b) {
        while(a > 0 && b > 0) {
            if(a > b) a = a % b;
            else b = b % a;
        }
        if(a == 0) return b;
        else return a;
    }
    private static int lcm(int a, int b) {
        // int i = Math.max(a,b);
        // while(true) {
        //     if(i % a == 0 && i % b == 0) {
        //         return i;
        //     }
        //     i++;
        // }
        return (a * b) / gcdnum(a, b);
    }
}
