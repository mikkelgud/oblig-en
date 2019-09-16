package obligEn;

import java.util.NoSuchElementException;

public class Oppg9 {
    public static int[] tredjeMin(int[] a){
        int[] returTabell = new int[3];

        //index til de 3 minste tallene
        int m = 0;
        int nm = 1;
        int s = 2;

        returTabell[0] = a[m];
        returTabell[1] = a[nm];
        returTabell[2] = a[s];

        Oppg8.indekssortering(returTabell);


        //hjelpevariabler
        int tredjeMinst = a[returTabell[2]];
        int nestMin = a[returTabell[1]];
        int min = a[returTabell[0]];

        if (a.length < 3){
            throw new NoSuchElementException("Tabellen (a) må inneholde 3 eller flere tall!");
        }

        for (int i = 3; i < a.length; i++){
            if (a[i] < tredjeMinst){
               if (a[i] < nestMin){
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
