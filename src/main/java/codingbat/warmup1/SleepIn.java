package codingbat.warmup1;

public class SleepIn {
    public static void main(String[] args) {
        SleepIn sleepIn = new SleepIn();
        sleepIn.sleepIn(true,true);
    }
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (! weekday || vacation){
            return true;
        }
        return false;
    }
}
