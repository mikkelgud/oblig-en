package obligEn;

import java.util.NoSuchElementException;

public class Oppg9 {
    public static int[] tredjeMin(int[] a){

        final String NO_SUCH_ELEMENT_EXCEPTION_MESSAGE = "There seams to be no elements in the given array";

        int arrayLength = a.length;

        if ( arrayLength < 1 ){
            throw new NoSuchElementException(NO_SUCH_ELEMENT_EXCEPTION_MESSAGE);
        }


        int[] returTabell = new int[3];

        //index til de 3 minste tallene
        int m = 0;
        int nm = 1;
        int s = 2;

        returTabell[0] = a[m];
        returTabell[1] = a[nm];
        returTabell[2] = a[s];

        Oppg8.indekssortering(returTabell);


        //instansierer hjelpevariabler fførste andre og tredje
        int third = a[s];
        int second = a[nm];
        int min = a[m];

        if (a.length < 3){
            throw new NoSuchElementException("Tabellen (a) må inneholde 3 eller flere tall!");
        }

        for (int i = 3; i < a.length; i++){
            if (a[i] < third){
               if (a[i] < second){
                   if (a[i] < min){
                       returTabell[1] = returTabell[0];
                       returTabell[2] = returTabell[1];
                       returTabell[0] = i;

                   }
               }
            }


        }

        return returTabell;
    }
}
