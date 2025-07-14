public class Basic_Maths {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Total digits: " + countDigit(1234));
        System.out.println("Total digits: " + ((int)Math.log10(12345) + 1));
    }
    private static int countDigit(int n) {
        int c = 0;
        while(n != 0) {
            n /= 10;
            c++;
        }
        return c;
    }
}
