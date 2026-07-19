package codingbat.string1;

public class WithoutEnd2 {
    public String withouEnd2(String str) {
        if(str.length() <= 2){
            return "";
        }else {

            int end = str.length() - 1;
            return str.substring(1,end);
        }
    }

}
