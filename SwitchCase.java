import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch(fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("King of fruits");
            case "Orange" -> System.out.println("King of fruits");
            default -> System.out.println("Invalid fruit");
        }

        int day = sc.nextInt();
        switch(day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }

        switch(day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

    }
}
