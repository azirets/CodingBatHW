package codingbat.warmup1;

public class Max1020 {
    public int max1020(int a, int b) {
        if(b>a){
            int larger = a;
            a=b;
            b=larger;
        }


        if(a >= 10 && a <= 20) {
            return a;
        }
        if (b <= 20 && b >= 10){
            return  b;
        }
        return 0;
    }
}
