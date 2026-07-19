package codingbat.string1;

public class TheEnd {
    public String theEnd(String str, boolean front) {
        if(front == true){
            return str.substring(0,1);
        }
        int last = str.length() - 1;
        return str.substring(last);
    }
}
