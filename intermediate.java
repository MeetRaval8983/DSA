import java.util.Scanner;
import java.util.concurrent.Future;

public class intermediate {

    public static int factorial(int n) {
        if(n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static double electricityBill(int units) {
        double bill = 0;
        if(units <= 100) {
            bill = units * 1.5;
        } else if(units <= 200) {
            bill = (100 * 1.5) + (units - 100) * 2.5;
        } else if(units <= 300) {
            bill = (100 * 1.5) + (100 * 2.5) + (units - 200) * 4.0;
        } else {
            bill = (100 * 1.5) + (100 * 2.5) + (100 * 4.0) + (units - 300) * 5.0;
        }
        return bill;
    }

    public static double average(Scanner sc) {
        System.out.print("Enter total numbers: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        return sum/n;
    }

    public static double discount(double a, double b) {
        double discountAmount = (a * b) / 100;
        double total = a - discountAmount;
        return total;
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Commission Percentage = (Commission Amount / Total sales) * 100;
    public static double commissionPercentage(double commission, double amount) {
        return (commission / amount) * 100;
    }

    public static double calculateCGPA(Scanner sc) {
        // Input the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        // Array to store grade points for each subject
        double[] gradePoints = new double[numSubjects];
        double totalGradePoints = 0.0;

        // Input grade points for each subject
        System.out.println("Enter the grade points for each subject:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            gradePoints[i] = sc.nextDouble();
            totalGradePoints += gradePoints[i];
        }

        // Calculate CGPA
        return (totalGradePoints / numSubjects);
    }

    public static boolean armstrong(int n) {
        int s = 0, num = n;
        while (n != 0) {
            int r = n % 10;
            s += Math.pow(r, 3);
            n /= 10;
        }
        if(num == s) {
            return true;
        } else {
            return false;
        }
    }

    public static String stringReverse(String s) {
        int l = s.length();
        String r = "";
        for(int i=l-1; i>=0; i--) {
            r += s.charAt(i);
        }
        return r;
    }

    public static boolean isPalindrome(int n) {
        int num = n, s = 0;
        while(n != 0) {
            int r = n % 10;
            s = (s * 10) + r;
            n /= 10;
        }
        if(num == s) {
            return true;
        } else {
            return false;
        }
    }

    // Formula for Future Investment Value: FV = PV * (1 + r)^t
    public static double calculateFutureValue(double principal, double rate, int time) {
        // Calculate Future Investment Value using the formula
        return principal * Math.pow(1 + rate, time);
    }

    public static int hcf(int a, int b) {
        int h=1;
        for(int i=1; i<=a && i<=b; i++) {
            if(a%i == 0 && b%i == 0) {
                h = i;
            }
        }
        return h;
    }

    static int lcm(int a, int b) {
        int l = (a > b)? a:b;
        while(true) {
            if(l % a == 0 && l % b == 0) {
                break;
            }
            l++;
        }
        return l;
    }

    static boolean perfectNumber(int n) {
        int s = 0;
        for(int i=1; i<=n/2; i++) {
            if(n % i == 0) {
                s += i;
            }
        }
        if (s == n) {
            return true;
        } else {
            return false;
        }
    }

    static int evenDays(int m) {
        /* Kunal is allowed to go out with his friends only on the even days of a given month. 
           Write a program to count the number of days he can go out in the month of August.  */
           return m/2;
    }

    static void sumList(Scanner sc) {

        /*  Write a program to print the sum of negative numbers, sum of positive even numbers and the 
            sum of positive odd numbers from a list of numbers (N) entered by the user. 
            The list terminates when the user enters a zero  */

        int n = 0, e = 0, o = 0;
        System.out.println("Enter numbers: ");
        while (true) {
            int num = sc.nextInt();
            if(num == 0) {
                break;
            } else if(num < 0) {
                n += num;
            } else if(num % 2 == 0) {
                e += num;
            } else {
                o += num;
            }
        }
        System.out.println("Sum of negative numbers: " + n);
        System.out.println("Sum of positive even numbers: " + e);
        System.out.println("Sum of positive odd numbers: " + o);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();
        // System.out.println("Factorial of " + n + " : " + factorial(n));

        // System.out.print("Enter total units: ");
        // int u = sc.nextInt();
        // System.out.println(electricityBill(u));

        // System.out.println(average(sc));

        // System.out.print("Enter the original price of the product: ");
        // double originalPrice = sc.nextDouble();
        // System.out.print("Enter the discount percentage: ");
        // double discountPercentage = sc.nextDouble();
        // System.out.println(discount(originalPrice, discountPercentage));

        // System.out.print("Enter the x-coordinate of the first point: ");
        // double x1 = sc.nextDouble();
        // System.out.print("Enter the y-coordinate of the first point: ");
        // double y1 = sc.nextDouble();
        // System.out.print("Enter the x-coordinate of the second point: ");
        // double x2 = sc.nextDouble();
        // System.out.print("Enter the y-coordinate of the second point: ");
        // double y2 = sc.nextDouble();
        // System.out.println(distance(x1, y1, x2, y2));

        // System.out.print("Enter the total sales amount: ");
        // double totalSales = sc.nextDouble();
        // System.out.print("Enter the commission amount: ");
        // double commission = sc.nextDouble();
        // System.out.println("Commission percentage: " + commissionPercentage(commission, totalSales) + "%");


        // System.out.print("Enter the base: ");
        // double base = sc.nextDouble();
        // System.out.print("Enter the exponent: ");
        // double exponent = sc.nextDouble();
        // System.out.println(Math.pow(base, exponent));

        // Input cost of the asset
        // System.out.print("Enter the cost of the asset: ");
        // double cost = sc.nextDouble();

        // Input salvage value
        // System.out.print("Enter the salvage value: ");
        // double salvageValue = sc.nextDouble();

        // Input useful life in years
        // System.out.print("Enter the useful life of the asset (in years): ");
        // int usefulLife = sc.nextInt();
        // System.out.println("The annual depreciation amount is: " + (cost - salvageValue) / usefulLife);




        
        // // Input total runs scored
        // System.out.print("Enter the total runs scored by the player: ");
        // int totalRuns = sc.nextInt();

        // // Input number of times out
        // System.out.print("Enter the number of times the player got out: ");
        // int timesOut = sc.nextInt();

        // // Validate input to avoid division by zero
        // if (timesOut == 0) {
        //     System.out.println("The player has a perfect average as they haven't been out yet!");
        // } else {
        //     // Calculate batting average
        //     double battingAverage = (double) totalRuns / timesOut;

        //     // Display the result
        //     System.out.println("The batting average of the player is: " + battingAverage);
        // }



        // System.out.println(calculateCGPA(sc));





        // A=P×(1+r/n)n⋅t
        // Compound Interest=A−P

        // Input the principal amount
        // System.out.print("Enter the principal amount (P): ");
        // double principal = sc.nextDouble();

        // // Input the annual interest rate
        // System.out.print("Enter the annual interest rate (in %): ");
        // double rate = sc.nextDouble();

        // // Input the number of times interest is compounded per year
        // System.out.print("Enter the number of times interest is compounded per year (n): ");
        // int n = sc.nextInt();

        // // Input the time in years
        // System.out.print("Enter the time in years (t): ");
        // double time = sc.nextDouble();

        // // Calculate the final amount
        // double rateDecimal = rate / 100;
        // double amount = principal * Math.pow(1 + (rateDecimal / n), n * time);

        // // Calculate compound interest
        // double compoundInterest = amount - principal;

        // // Display the results
        // System.out.println("The final amount (A) is: " + amount);
        // System.out.println("The compound interest is: " + compoundInterest);




        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();
        // if(armstrong(n)) {
        //     System.out.println(n + " is an Armstrong number");
        // } else {
        //     System.out.println(n + " is not an Armstrong number");
        // }




        // System.out.print("Enter value of n: ");
        // int n = sc.nextInt();
        // System.out.print("Enter value of r: ");
        // int r = sc.nextInt();
        // if(n < r || n < 0 || r < 0) {
        //     System.out.println("Invalid input");
        // } else {
        //     long c = factorial(n) / (factorial(r) * factorial(n - r));
        //     long p = factorial(n) / factorial(n - r);
        //     System.out.println("nCr: " + c);
        //     System.out.println("nPr: " + p);
        // }




        // System.out.println("Enter a string: ");
        // String s = sc.next();
        // System.out.println(stringReverse(s));



        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();
        // if(isPalindrome(n)) {
        //     System.out.println(n + " is a Palindrome number");
        // } else {
        //     System.out.println(n + " is not a Palindrome number");
        // }




         // Input Principal Amount
        //  System.out.print("Enter the principal amount (Present Value): ");
        //  double principal = sc.nextDouble();
 
        //  // Input Annual Interest Rate (in %)
        //  System.out.print("Enter the annual interest rate (in %): ");
        //  double rate = sc.nextDouble() / 100; // Convert percentage to decimal
 
        //  // Input Time (in years)
        //  System.out.print("Enter the time (in years): ");
        //  int time = sc.nextInt();
 
        //  // Calculate Future Investment Value
        //  double futureValue = calculateFutureValue(principal, rate, time);
 
        //  // Output the result
        //  System.out.printf("The Future Investment Value is: %.2f%n", futureValue);


        // System.out.print("Enter 1st number: ");
        // int a = sc.nextInt();
        // System.out.print("Enter 2nd number: ");
        // int b = sc.nextInt();
        // System.out.println(hcf(a, b));



        // System.out.print("Enter 1st number: ");
        // int a = sc.nextInt();
        // System.out.print("Enter 2nd number: ");
        // int b = sc.nextInt();
        // System.out.println(lcm(a, b));


        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();
        // if (perfectNumber(n)) {
        //     System.out.println(n + " is a perfect number");
        // } else {
        //     System.out.println(n + " is not a perfect number");
        // }


        // int month = 31;
        // System.out.println("Number of days: " + evenDays(month));


        sumList(sc);

    }
}
