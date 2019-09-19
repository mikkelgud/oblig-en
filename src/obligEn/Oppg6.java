package obligEn;

import java.util.Arrays;

public class Oppg6 {
    public static void rotasjon(char[] a, int k) {
        int n = a.length;
        final int MAX_CHANGES = 5000;
        final int MIN_CHANGES = -5000;

        if (k > MAX_CHANGES || k < MIN_CHANGES){
            return;
        }

        if (n < 2){  //så lenge arrayet har mindre en 2 elementer skal den bare returnere arrayet vanlig ugjort
            return;
        }

        if ((k %= n) < 0){
            k += n;
        }

        char[] b = Arrays.copyOfRange(a, n - k, n);
        for (int i = n - 1; i >= k; i--){
            a[i] = a[i - k];
        }
        System.arraycopy(b, 0, a, 0, k);
        System.out.println(Arrays.toString(a));
    }

}
