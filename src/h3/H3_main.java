package h3;

public class H3_main {
    public static void main(String[] args) {
        int i, j, k;
        boolean f1, f2, f3;
        i = 500;
        j = 200;
        k = -10;

        f1 = i > j;
        f2 = i > 200;
        f3 = j > 100;

        if(f1 && !f2 && !f3) {
            k = 1;
        } else if(f1 && f2 && !f3){
            k = 2;
        } else if(f1 && f2 && f3) {
            k = 3;
        } else if(!f1 && !f2 && !f3){
            k = 4;
        } else {
            k = -10;
        }

        System.out.println(k);
    }
}
