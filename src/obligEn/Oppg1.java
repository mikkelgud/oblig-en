package obligEn;

import java.util.NoSuchElementException;

public class Oppg1 {

    public static int maks(int[] a) {

        if (a.length < 1){
            throw new NoSuchElementException("Tabellen er tom!");
        }

        int størsteTall = 0;

        for (int i = 1; i < a.length; i++){
            if(a[i] < a[i-1]){
                int temp = a[i];

                a[i] = a[i-1];
                a[i-1] = temp;

            }
            størsteTall = a[i];
        }
        return størsteTall;
    }

    public static int ombyttinger(int[] a){
        int teller = 0;

        for (int i = 1; i < a.length; i++){
            if (a[i] < a[i-1]){
                teller++;
            }
        }
        return teller;
    }
}
