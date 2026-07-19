package codingbat.string1;

public class MinCat {
    public String minCat(String a, String b) {
        if (a.length() > b.length()) {
            a = a.substring(a.length() - b.length());
        } else if (b.length() > a.length()) {
            b = b.substring(b.length() - a.length());
        }
        return a + b;
    }
}
