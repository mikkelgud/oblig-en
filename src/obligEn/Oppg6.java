package obligEn;

import java.util.Arrays;

public class Oppg6 {
    public static void rotasjon(char[] a, int k){
        k = k - 1;
        if (a.length == 1 || a.length == 0){
            System.out.println(Arrays.toString(a));
        }
        int n = a.length;  if (n < 2){
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
