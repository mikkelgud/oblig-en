package obligEn;

import java.util.Arrays;

public class Oppg8 {

    public static int[] indekssortering(int[] a) {
        int aLenght = a.length;

        int[] indeks = new int[aLenght];
        int[] tmp = new int[aLenght];
        tmp = a;

        //Setter en verdi lik max av det en int kan være.
        final int MAX_VALUE_OF_AN_INTEGER = Integer.MAX_VALUE;

        //Iterer gjennom for hvert ledd av arrayet.
        for (int i = 0; i < aLenght; i++){
            //Finner indeksen til minste verdi
            int currentMinIndex = findMin(a);
            //Setter indeks sitt i´te ledd til iterasjonens index hentet fra findMin() metoden.
            indeks[i] = currentMinIndex;
            //Skifter ut det nåverende laveste leddet med et teit høyt tall.
            tmp[currentMinIndex] = MAX_VALUE_OF_AN_INTEGER;
        }
        return indeks;
    }


    public static int findMin(int[] a){
        //Bruker min som hjelpevariabel for å holde på verdien til current index.
        int min = a[0];
        //Instansierer 1. index til 0.
        int currentMinIndex = 0;

        //Itererer gjennom alle tall i listen.
        for (int i = 0; i < a.length; i++){
            // Sjekker om arrayet til i'te posisjon er mindre enn det nåværende minste tallet. Og setter dette til det nye minste tallet og tar vare på indeksen.
            if (a[i] < min){
                currentMinIndex = i;
                min = a[i];
            }
        }
        return currentMinIndex;
    }

}

