package codingbat.warmup1;

public class MissingChar {
    public String missingChar(String str, int n) {
        String begin = str.substring(0,n);
        String end = str.substring(n+1, str.length());
        return begin + end;
    }
}
