package codingbat.warmup1;

public class StartHi {
    public boolean startHi(String str) {
        if(str.length() < 2){
            return false;
        }
        String begin = str.substring(0,2);
        if(begin.equals("hi")){
            return true;
        }else {
            return false;
        }
    }
}
