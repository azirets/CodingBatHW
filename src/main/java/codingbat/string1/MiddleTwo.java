package codingbat.string1;

public class MiddleTwo {
    public String middleTwo(String str) {
        if(str.length() > 2 && str.length() % 2 == 0){
            int middle = str.length() / 2;
            return str.substring(middle - 1, middle + 1);
        }
        return str;
    }
}
