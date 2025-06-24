public class Pattern {
    public static void main(String[] args) {
        // Pattern 1
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 2
        n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 3
        n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 4
        n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 5
        n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 5
        n = 5;
        for (int i = 0; i < 2 * n - 1; i++) {
            int j = i < n ? i + 1 : 2 * n - 1 - i;
            for (int k = 0; k < j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 6
        n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 7
        n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 8
        n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 9
        n = 5;
        int m = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < m; k++) {
                System.out.print("*");
            }
            m -= 2;
            System.out.println();
        }
        // Pattern 9
        n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (n - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 10
        n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 11
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 12
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 13
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                if (k == 0 || k == 2 * i || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 14
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (n - i) - 1; k++) {
                if (i == 0 || k == 0 || k == 2 * (n - i) - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 15
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++) {
                if(k == 0 || k == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < n-i-1; k++) {
                if(k == 0 || k == n - i - 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Pattern 16
        n = 5;
        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i-1][j-1] + a[i-1][j];
                }
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++) {
                System.out.print(a[i][k] + " ");
            }
            System.out.println();
        }
        // Pattern 16
         int rows = 5;

        for (int i = 0; i < rows; i++) {
            // Print leading spaces for alignment (optional)
            for (int s = rows - i; s > 1; s--) {
                System.out.print(" ");
            }

            int value = 1;  // first value in every row is 1
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");

                // Compute next value in row using binomial coefficient relation:
                // C(i, j+1) = C(i, j) * (i - j) / (j + 1)
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }

        // Pattern 17
        
    }
}
