public class Recursion_S {
    public static void main(String[] args) {
        skip("", "baccad");
        System.out.println(skip2("baccad"));
        System.out.println(skipword("baccapplead"));
        System.out.println(skipword2("baccappleadappabc"));
        System.out.println();
        subset("", "abc");
    }
    static void skip(String n, String org) {
        if(org.isEmpty()) {
            System.out.println(n);
            return;
        }
        char ch = org.charAt(0);
        if(ch == 'a') {
            skip(n, org.substring(1));
        } else {
            skip(n + ch, org.substring(1));
        }
    }
    static String skip2(String s) {
        if(s.isEmpty()) {
            return "";
        }
        char ch = s.charAt(0);
        if(ch == 'a') {
            return skip2(s.substring(1));
        } else {
            return ch + skip2(s.substring(1));
        }
    }
    static String skipword(String s) {
        if(s.isEmpty()) {
            return "";
        }
        if(s.startsWith("apple")) {
            return skipword(s.substring(5));
        } else {
            return s.charAt(0) + skipword(s.substring(1));
        }
    }
    static String skipword2(String s) {
        if(s.isEmpty()) {
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple")) {
            return skipword2(s.substring(3));
        } else {
            return s.charAt(0) + skipword2(s.substring(1));
        }
    }

    static void subset(String p, String s) {
        if(s.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = s.charAt(0);
        subset(p + ch, s.substring(1));
        subset(p, s.substring(1));
    }
}