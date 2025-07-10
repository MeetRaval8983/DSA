import java.util.*;

// Using 2 pointers
public class AdobeString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = "thw$ g##bjhdwd vdg*gh$vvdd#bdudhc";
        String s = "$sgsbd**hg";
        StringBuilder r = new StringBuilder();
        Set<Character> sp = new HashSet<>(Arrays.asList('$','#','*'));
        int i = 0, j = 0, c = 0;
        while(i < s.length()) {
            char ch = s.charAt(i);
            if(sp.contains(ch)) {
                if(s.charAt(i+1) == ' ') {
                    r.append(" ");
                    i += 2;
                } else {
                    i++;
                }
                i++;
            } else {
                if(c > 1) {
                    i += c;
                } else if(c == 1) {
                    i++;
                }
                if(i < s.length()) {
                    r.append(s.charAt(i));
                }
                i++;
                c = 0;
            }
        }
        System.out.println(s);
        System.out.println(r.toString());
    }
}