package h2;

public class H2_main {
    public static void main(String[] args) {
        int i, j, k, min, max;
        i = 9;
        j = 7;
        k = 2;

        // Min
        if(i < j && i < k) {
            min = i;
        } else if(j < k) {
            min = j;
        } else {
            min = k;
        }

        //Max
        if(i > j && i > k) {
            max = i;
        } else if(j > k) {
            max = j;
        } else {
            max = k;
        }

        System.out.println(min);
        System.out.println(max);
    }

}
