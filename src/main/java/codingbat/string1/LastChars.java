package codingbat.string1;

public class LastChars {
    public String lastChars(String a, String b) {
        char firstChar;
        char lastChar;

        if (a.length() > 0) {
            firstChar = a.charAt(0);
        }else {
            firstChar = '@';
        }
        if (b.length() > 0){
            lastChar = b.charAt(b.length() - 1);
        }else {
            lastChar = '@';
        }
        return  "" + firstChar + lastChar;
    }
}
