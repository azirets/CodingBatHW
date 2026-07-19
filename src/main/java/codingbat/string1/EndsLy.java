package codingbat.string1;

public class EndsLy {
    public boolean endsLy(String str) {
        int all = str.length();
        String end = "ly";
        if(all < 2){
            return false;
        }
        else if(end.equals(str.substring(all-2, all)) && all >= 2){
            return true;
        }
        return false;
    }
}
