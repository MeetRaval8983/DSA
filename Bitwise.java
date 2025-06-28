public class Bitwise {
    public static void main(String[] args) {
        oddeven(52);
        // int[] a = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        int[] a = {-2, 3, 2, 4, -5, 5, -4};
        System.out.println("Unique element: " + unique(a));
        System.out.println(findbit(4, 2));
        System.out.println(setbit(4, 1));
        System.out.println(resetbit(7, 2));
        System.out.println(rightmostsetbit(20));
        int[] b = {2, 2, 3, 2, 7, 7, 8, 7, 8, 8};
        System.out.println(oddunique(b));
    }
    static void oddeven(int n) {
        if((n & 1) == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
    static int unique(int[] a) {
        int n = 0;
        for(int i: a) {
            if(i < 0) {
                i = -i; // Convert negative to positive for XOR operation
            }
            n ^= i;
        }
        return n;
    }
    static int findbit(int n, int k) {
        return (n & (1 << k)) != 0 ? 1 : 0;
    }
    static int setbit(int n, int k) {
        return (n | (1 << k));
    }
    static int resetbit(int n, int k) {
        return (n & ~(1 << k));
    }
    static int rightmostsetbit(int n) {
        // for(int i = 0; i < 32; i++) {
        //     if((n & (1 << i)) != 0) {
        //         return 2 * i;
        //     }
        // }
        // return -1;
        return n & -n; // This returns the rightmost set bit
    }

    static int oddunique(int[] a) {
        int r = 0;
        for(int i = 0; i < 32; i++) {
            int s = 0;
            int mask = 1 << i;
            for(int j : a) {
                if((j & mask) != 0) {
                    s++;
                }
            }
            if(s % 3 != 0) {
                r |= mask;
            }
        }
        return r;
    }
}
