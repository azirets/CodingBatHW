package codingbat.string1;

public class MiddleThree {
    public String middleThree(String str) {
        if(str.length() <= 3){
            return str;
        }
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 2);
    }
}
