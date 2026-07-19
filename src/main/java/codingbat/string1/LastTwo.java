package codingbat.string1;

public class LastTwo {
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            String lastChar = str.substring(str.length() - 1);
            String lastChar2 = str.substring(str.length() - 2, str.length() - 1);
            String without = str.substring(0, str.length() - 2);
            return without.concat(lastChar).concat(lastChar2);
        }
    }
}
