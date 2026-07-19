package codingbat.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        if(str.length() <= 2){
            return str + str + str;
        }
        int last = str.length() - 2;
        String end = str.substring(last);
        return end + end + end;
    }

}
