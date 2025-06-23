import java.util.Scanner;

public class first {

    public static boolean isPalindrome(String s) {
        int l = s.length();
            for(int i =0; i<l/2; i++) {
                if(s.charAt(i) != s.charAt(l-i-1)) {
                    return false;
                }
            }
        return true;
    }

    public static boolean isArmstrong(int n) {
        int s = 0;
        int num = n;
        while(n != 0) {
            int r = n % 10;
            // s += r*r*r;
            s += Math.pow(r, 3);
            n = n / 10;
        }
        if(num == s) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        s = sc.nextLine();

        // Normalize input: remove spaces and convert to lowercase
        String normalized = s.replaceAll("\\s+", "").toLowerCase();

        if(isPalindrome(normalized)) {
            System.out.println(s + " is Palindrome");
        } else {
            System.out.println(s + " is not a Palindrome");
        }

        System.out.print("Enter lower bound: ");
        int lower = sc.nextInt();
        System.out.print("Enter upper bound: ");
        int upper = sc.nextInt();

        for(int i=lower; i<=upper; i++) {
            if(isArmstrong(i)) {
                System.out.println(i);
            }
        }

    }
}
