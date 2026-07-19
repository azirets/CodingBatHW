package codingbat.warmup1;

public class EveryNth {
    public String everyNth(String str, int n) {
        String str2 = "";

        for(int i=0; i < str.length(); i = i + n){
            str2 += str.charAt(i);
        }
        return str2;
    }

}
