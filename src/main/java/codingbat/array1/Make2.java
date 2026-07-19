package codingbat.array1;

public class Make2 {
    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int index = 0;

        for (int i = 0; i < a.length && index < 2; i++) {
            result[index++] = a[i];
        }

        for (int i = 0; i < b.length && index < 2; i++) {
            result[index++] = b[i];
        }

        return result;
    }
}
