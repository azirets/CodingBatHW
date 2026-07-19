package codingbat.string1;

public class ConCat {
    public String conCat(String a, String b) {
        if (b.length() == 0){
            return a;

        } else if (a.endsWith(b.substring(0, 1))) {
            return a + b.substring(1);

        } else {
            return a.concat(b);
        }

    }

}
