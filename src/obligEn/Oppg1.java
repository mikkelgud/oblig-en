package obligEn;

import java.util.NoSuchElementException;

public class Oppg1 {

    public static int maks(int[] a) {
        final String NO_SUCH_ELEMENT_EXCEPTION_MESSAGE = "There seams to be no elements in the given array";
        int biggestNumber = 0;

        if (a.length < 1){
            throw new NoSuchElementException(NO_SUCH_ELEMENT_EXCEPTION_MESSAGE);
        }else if(a.length == 1){
            biggestNumber = a[0];
        }

        for (int i = 1; i < a.length; i++){
            if(a[i] < a[i-1]){
                int temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
            }
            biggestNumber = a[i];
        }
        return biggestNumber;
    }

    public static int ombyttinger(int[] a) {
        int teller = 0;

        for (int i = 1; i < a.length; i++){
            if (a[i] < a[i-1]){
                teller++;

                int temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
            }
        }
        return teller;
    }
}
