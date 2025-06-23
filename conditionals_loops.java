import java.util.Scanner;

/*  Both methods need to be static because main is static and can only directly 
    call other static methods or variables without creating an instance of the class */

public class conditionals_loops {

    public static void fibonacci(int n) {
        int a = 0, b = 1,c;
        System.out.print(a + " " + b);
        for(int i = 1; i <= n-2; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    public static int subtractProductAndSum(int n) {
        int product = 1, sum = 0;
        while(n != 0) {
            int r = n % 10;
            product *= r;
            sum += r;
            n /= 10;
        }
        return (product - sum);
    }

    public static void factors(int n) {
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i+ " ");
            }
        }
    }

    public static void sumOfAllNumbers(Scanner sc) {
        int n = 1, s = 0;
        while(n != 0) {
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            s += n;
        }
        System.out.println("\nSum of all numbers: " + s);
    }

    public static void largestFromAll(Scanner sc) {
        int n = 1, max = n;
        while(n != 0) {
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            if(max < n)
            max = n;
        }
        System.out.println("Largest number: " + max);
    }

    public static void calculator(Scanner sc) {
        while (true) {
            System.out.print("Enter operator: ");
            char c = sc.next().trim().charAt(0);
            if(c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
                System.out.println("Enter 2 numbers:");
                int a = sc.nextInt();
                int b = sc.nextInt();

                if(c == '+') {
                    System.out.println("Addition: " + (a+b));
                }
                if(c == '-') {
                    System.out.println("Subtraction: " + (a-b));
                }
                if(c == '*') {
                    System.out.println("Multiplication: " + (a*b));
                }
                if(c == '/') {
                    if(b != 0)
                    System.out.println("Divsion: " + (a/b));
                    else
                    System.out.println("Cannot divide by zero");
                }
                if(c == '%') {
                    System.out.println("Addition: " + (a%b));
                }
            } else if(c == 'X' || c == 'x') {
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Using Math function
        // int a = 10, b = 20, c = 30;
        // int max = Math.max(c, Math.max(a, b));
        // System.out.println(max);

        // // case check
        // char ch = sc.next().trim().charAt(0);
        // System.out.println(ch);
        // String s = "Hello";
        // char h = s.charAt(0);
        // System.out.println(h);

        // if(h >= 'a' && h <= 'z') {
        //     System.out.println("Lowercase");
        // } else {
        //     System.out.println("Uppercase");
        // }

        // // if(h >= 'A' && h <= 'Z') {
        // //     System.out.println("Uppercase");
        // // }

        // // Fibonacci series
        // System.out.print("Enter a number: ");
        // a = sc.nextInt();
        // fibonacci(a);

        // // Subtract the Product and the Sum of Digits of an Integer
        // System.out.print("\nEnter a number: ");
        // b = sc.nextInt();
        // int sub = subtractProductAndSum(b);
        // System.out.println(sub);

        // // Input a number and print all the factors of that number
        // System.out.println("Factors of a no.");
        // System.out.print("Enter a no.: ");
        // int fn = sc.nextInt();
        // factors(fn);

        // // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        // System.out.println("\nSum of all nos.");
        // sumOfAllNumbers(sc);

        // // Take integer inputs till the user enters 0 and print the largest number from all.
        // System.out.println("Largest number from all");
        // largestFromAll(sc);

        calculator(sc);

    }
}
