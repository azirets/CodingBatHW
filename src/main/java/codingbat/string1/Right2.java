package codingbat.string1;

public class Right2 {
    public String right2(String str) {
        if(str.length() >= 2){
            int right2 = str.length() - 2;
            return str.substring(right2).concat(str.substring(0,right2));
        }
        return null;
    }
}
