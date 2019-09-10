package obligEn;

import java.util.Arrays;

public class Oppg5 {

    public static void rotasjon(char[] a){
        int d = 1;
        int n = a.length;  if (n < 2) return;
        if ((d %= n) < 0) d += n;

        char[] b = Arrays.copyOfRange(a, n - d, n);
        for (int i = n - 1; i >= d; i--) a[i] = a[i - d];
        System.arraycopy(b, 0, a, 0, d);

        System.out.println(Arrays.toString(a));
    }


}


