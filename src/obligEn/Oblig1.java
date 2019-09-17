package obligEn;

import java.util.Arrays;
import java.util.NoSuchElementException;

////// Løsningsforslag Oblig 1 - 2019 ////////////////////////




public class Oblig1 {
    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        final String NO_SUCH_ELEMENT_EXCEPTION_MESSAGE = "There seams to be no elements in the given array";


        if (a.length < 1){
            throw new NoSuchElementException(NO_SUCH_ELEMENT_EXCEPTION_MESSAGE);
        }

        int biggestNumber = 0;

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

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        final String ILLIGALSTATE_EXCEPTION_MESSAGE = "Array must be sorted for usage of this method";

        int teller = 1;

        if (a.length == 0){
            teller = 0;
        }

        for(int i = 1; i < a.length; i++){
            if (a[i] < a[i-1]){
                throw new IllegalStateException(ILLIGALSTATE_EXCEPTION_MESSAGE);
            }

            if ( a[i-1] != a[i]){
                teller++;
            }
        }
        return teller;
    }



    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        int teller = 0;

        if (a.length == 0){
            teller = 0;
        }

        for (int i = 0; i < a.length; i++){
            boolean unik = false;

            for (int j = 0; j < i; j++){
                if (a[j] == a[i]){
                    unik = true;
                    break;
                }
            }
            if (!unik){
                teller++;
            }
        }

        return teller;
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {

        int oddeTallCount = 0;

        Arrays.sort(a);

        for (int i = 0; i < a.length; i++){
            if ((a[i] & 1) != 0) {
                oddeTallCount++;
            }
        }

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length - 1; j++) {
                if (((a[j + 1] % 2) != 0) && (a[j] < a[j + 1])) {   //Sender oddetallene til venstre i tabellen,
                    int temp = a[j + 1];                            //Samtidig sendes partallene til høyre.
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        // Bruker Array.sort for å sortere oddetallene.
        Arrays.sort(a, 0, oddeTallCount);

        System.out.println(Arrays.toString(a));
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        int d = 1;
        if (a.length == 1 || a.length == 0){
            System.out.println(Arrays.toString(a));
        }
        int n = a.length;  if (n < 2){
            return;
        }
        if ((d %= n) < 0){
            d += n;
        }

        char[] b = Arrays.copyOfRange(a, n - d, n);
        for (int i = n - 1; i >= d; i--){
            a[i] = a[i - d];
        }
        System.arraycopy(b, 0, a, 0, d);

        System.out.println(Arrays.toString(a));
    }


    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
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

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        StringBuilder a = new StringBuilder();
        String b = s+t;

        for(int i = 0; i < b.length(); i++){
            if(i < s.length()){
                a.append(s.charAt(i));
            }
            if(i < t.length()){
                a.append(t.charAt(i));
            }
        }

        return a.toString();    }

    /// 7b)
    public static String flett(String... s) {
        StringBuilder a = new StringBuilder();

        for(int i = 0; i > s.length; i++){
            if(s.length < i) {
                a = a.append(s[i].charAt(i));
            }
        }
        return a.toString();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        int[] indeks = new int[a.length];

        //Setter en verdi lik max av det en int kan være.
        final int MAX_VALUE_OF_AN_INTEGER = Integer.MAX_VALUE;

        //Iterer gjennom for hvert ledd av arrayet.
        for (int i = 0; i < a.length; i++){
            //Finner indeksen til minste verdi
            int currentMinIndex = findMin(a);
            //Setter indeks sitt i´te ledd til iterasjonens index hentet fra findMin() metoden.
            indeks[i] = currentMinIndex;
            //Skifter ut det nåverende laveste leddet med et teit høyt tall.
            a[currentMinIndex] = MAX_VALUE_OF_AN_INTEGER;
        }
        return indeks;
    }

    public static int findMin(int[] a) {
        //Bruker min som hjelpevariabel for å holde på verdien til current index.
        int min = a[0];
        //Instansierer 1. index til 0.
        int currentMinIndex = 0;

        //Itererer gjennom alle tall i listen.
        for (int i = 0; i < a.length; i++) {
            // Sjekker om arrayet til i'te posisjon er mindre enn det nåværende minste tallet. Og setter dette til det nye minste tallet og tar vare på indeksen.
            if (a[i] < min) {
                currentMinIndex = i;
                min = a[i];
            }
        }
        return currentMinIndex;
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
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


            //hjelpevariabler
            int tredjeMinst = a[returTabell[2]];
            int nestMin = a[returTabell[1]];
            int min2 = a[returTabell[0]];

            if (a.length < 3){
                throw new NoSuchElementException("Tabellen (a) må inneholde 3 eller flere tall!");
            }

            for (int i = 3; i < a.length; i++){
                if (a[i] < tredjeMinst){
                    if (a[i] < nestMin){
                        if (a[i] < min2){
                            returTabell[1] = returTabell[0];
                            returTabell[2] = returTabell[1];
                            returTabell[0] = i;

                        }
                    }
                }
            }
            return returTabell;
    }



    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
return 1;
    }

    public static boolean inneholdt(String a, String b) {
        return false;

    }

}  // Oblig1
