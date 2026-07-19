package codingbat.warmup1;

public class EndUp {
    public String endUp(String str) {
        if(str.length()<=3){
            return str.toUpperCase();
        }
        int last3 = str.length()-3;
        String begin = str.substring(0,last3);
        String last = str.substring(last3);
        return begin + last.toUpperCase();
    }
}
