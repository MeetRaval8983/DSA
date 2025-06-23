import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll no.: ");
        int r = sc.nextInt();
        System.out.println("Roll no.: " + r);

        int m = 100_000_000;
        System.out.println(m);

        String s = sc.next();
        System.out.println(s);

        float f = sc.nextFloat();
        System.out.println(f);

    }
}
