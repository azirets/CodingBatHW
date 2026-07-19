package codingbat.string1;

public class FirstHalf {
    public String firstHalf(String str) {
        if(str.length()%2 == 0){
            int first = str.length()/2;
            String firstHalf = str.substring(0, first);
            return firstHalf;
        }
        return null;
    }
}
