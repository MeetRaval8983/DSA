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
        System.out.println(magicnumber(5));
        System.out.println(noofdigits(12345, 10));
        System.out.println(noofdigits(10, 2));
        System.out.println(sumofrowinpascal(1));
        System.out.println(ispowof2(3));
        System.out.println(calculatepower(3, 6));
        System.out.println(noofsetbits(5));
        System.out.println(xorfrom0toa(5));
        int[][] image = {
            {1, 0, 1},
            {0, 1, 0},
            {1, 1, 0}
        };
        flipimage(image);
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
    static int magicnumber(int n) {
        int ans = 0;
        int base = 5;
        while(n > 0) {
            int last = n & 1;
            ans += last * base;
            base *= 5;
            n >>= 1;
        }
        return ans;
    }
    static int noofdigits(int n, int b) {
        return (int)(Math.log(n) / Math.log(b)) + 1; // Returns the number of digits in base b
    }

    static int sumofrowinpascal(int n) {
        // Sum of n-th row=2 ^ n
        // Row 0: [1] → Sum = 2 ^ 0 = 1
        // Row 1: [1, 1] → Sum = 2 ^ 1 = 2
        // Row 2: [1, 2, 1] → Sum = 2 ^ 2 = 4
        // Row 3: [1, 3, 3, 1] → Sum = 2 ^ 3 = 8
        // Row 4: [1, 4, 6, 4, 1] → Sum = 2 ^ 4 = 16
        // Row 5: [1, 5, 10, 10, 5, 1] → Sum = 2 ^ 5 = 32
        return (int)Math.pow(2, n);
        // return 1 << n-1; // 2^n gives the sum of elements in the nth row of Pascal's triangle
    }

    static boolean ispowof2(int n) {
        // return n % 2 == 0 && n != 0; // Check if n is a power of 2
        // A number is a power of 2 if it has only one bit set in its binary representation.
        // This can be checked using the expression (n & (n - 1)) == 0.
        // Additionally, we should also check that n is greater than 0.
        // return n > 0 && (n & (n - 1)) == 0;
        int s = 0;
        for(int i = 0; i < 32; i++) {
            int bit = n & 1;
            if(bit == 1) {
                s++;
            }
            n >>= 1;
        }
        if(s == 1) {
            return true;
        }
        return false;
    }

    static int calculatepower(int b, int p) {
        // return (int)Math.pow(a, b);
        int ans = 1;
        while(p > 0) {
            if((p & 1) == 1) {
                ans *= b;
            }
            b *= b;
            p >>= 1;
        }
        return ans;
    }
    static int noofsetbits(int n) {
        // return Integer.bitCount(n); // Returns the number of set bits in the binary representation of n
        int count = 0;
        while(n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    static int xorfrom0toa(int a) {
        // int ans = 0;
        // for(int i = 0; i <= a; i++) {
        //     ans ^= i;
        // }
        // return ans;
        // XOR from 0 to a can be calculated using the pattern:
        // 0, 1, 3, 0, 4, 1, 7, 0, ...
        // The result depends on a % 4:
        // if a % 4 == 0 then result is a
        // if a % 4 == 1 then result is 1
        // if a % 4 == 2 then result is a + 1
        // if a % 4 == 3 then result is 0
        switch(a % 4) {
            case 0: return a;
            case 1: return 1;
            case 2: return a + 1;
            case 3: return 0;
            default: return -1; // This should never happen
        }
    }
    static void flipimage(int[][] image) {
        System.out.println("Original Image:");
        for(int i[] : image) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < image.length; i++) {
            for(int j = 0; j < (image[0].length + 1) / 2; j++ ) {
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][image[0].length - j - 1] ^ 1;
                image[i][image[0].length - j - 1] = temp;
            }
        }
        System.out.println("Flipped Image:");
        for(int i[] : image) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}