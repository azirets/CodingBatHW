package codingbat.string1;

public class WithoutEnd {
    public String withoutEnd(String str) {
        int length = str.length();
        return str.substring(1,length - 1);
    }

}
