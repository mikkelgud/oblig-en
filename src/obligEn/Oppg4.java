package obligEn;

import java.util.Arrays;

public class Oppg4{
    public static void delsortering(int[]a) {
        //INSTANSIERER trengende veridier og hjelpevariabler.
        int aLength = a.length;
        int oddNumbers = 0;
        int tmp = 0;
        int o = 0;

        //Sorterer hele listen jeg får inn
        quickSort(a, 0, aLength-1);
//       //Sjekker gjennom hele arrayet med en for-løkke
        for(int i = 0; i < aLength; i++){

            if (a[i]%2 == 0){//Sjekker om tallet er partall
                if (a[i] == 0){
                    o++;
                }
            }
            else {                  //Dersom det ikke er setter jeg verdiene fra første til n'te posisjon i arrayet.
                tmp = a[i];
                a[i] = a[oddNumbers];
                a[oddNumbers] = tmp;
                oddNumbers++;
            }
        }
        //Sorterer partallene separat.
        quickSort(a, aLength-oddNumbers-o, aLength-1);


    }

    //Implementerer metode for quick-sort med left og right pekere.
    public static void quickSort(int[]a, int l, int r){
        //Sjekker om left er større enn right.
        if (l < r) {
            int partitionIndex = partition(a, l, r);

            //Bruker rekursjon til å sortere
            quickSort(a, l, partitionIndex - 1);
            quickSort(a, partitionIndex + 1, r);
        }
    }

    //Deler og returnerer delingsindeksen
    public static int partition(int[] a, int begin, int end){
        //Bruker pivoten til å dividere listen inn til to lister.
        int pivot = a[end];
        //instansierer i til posisjonen bak starten av arrayet
        int i = (begin-1);
//itererer gjennom arrayer fra start til slutt
        for (int j = begin; j < end; j++) {
            //sjekker oma arrayets nåværende posisjon er mindre enn pivoten og endrer partiationIndexen +1 og flytter deretter tall på riktig plass
            if (a[j] < pivot) {
                i++;
                int swapTmp = a[i];
                a[i] = a[j];
                a[j] = swapTmp;
            }
        }
//bytter til slutt om posisjonen til neste ledd og siste ledd.]
        int swapTmp = a[i+1];
        a[i+1] = a[end];
        a[end] = swapTmp;
//returnerer indexen.
        return i+1;
    }
}
