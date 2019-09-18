package obligEn;

import java.awt.font.FontRenderContext;
import java.util.Arrays;
import java.util.NoSuchElementException;

////// Løsningsforslag Oblig 1 - 2019 ////////////////////////




public class Oblig1 {
    ///// Oppgave 1 //////////////////////////////////////
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

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        StringBuilder a = new StringBuilder();
        String b = s+t;    //lager en ny string som inneholder både s string og t string

        for(int i = 0; i < b.length(); i++){
            if(i < s.length()){
                a.append(s.charAt(i));    //legger til verdiene i s[i] inn i stringbuilderen a
            }
            if(i < t.length()){
                a.append(t.charAt(i));  //legger t[i] inn i stringbuilder a
            }
        }

        return a.toString();
    }

    /// 7b)
    public static String flett(String... s) {
        StringBuilder a = new StringBuilder();  //opretter stringbuilder(lager en ny string)
        int sum = 0;
        int lOrd = 0;

        for(String sjekk : s){    //lager for loop som løper igjennom s
            StringBuilder sa = new StringBuilder(sjekk); //leger en ny String med verdiene til sjekk
            sum += sa.length(); //gjør slik at sum blir lengden til den nye stringen

            if(sa.length() > lOrd){   //hvis lengden til sa(den nye strengen) er større en lOrd = 0
                lOrd = sa.length();  // så skal lOrd bli satt til sa sin lengde
            }
        }

        int teller = 0;   // lager en teller som skal peke på bokstavene
        int i = 0;  // leger en verdie som skal peke på ordene

        while(teller < lOrd){  // mens teller er mindre enn lOrd
            if(new StringBuilder(s[i]).length() > teller){  //og hvis den nye strengen med s[i] sin lengde er større en bokstav pekeren
                a.append(s[i].charAt(teller));  //skal vi legge til s[ordpeker] sin bokstavpeker
            }

            if(i == s.length-1){
                teller++;
                i = -1;  // nullstiller i og får den til å starte på nytt (første ord)
            }

            i++;
        }
        return a.toString();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        int aLenght = a.length;

        int[] indeks = new int[aLenght];
        int[] tmp=  a.clone();


        //Setter en verdi lik max av det en int kan være.
        final int MAX_VALUE_OF_AN_INTEGER = Integer.MAX_VALUE;

        //Iterer gjennom for hvert ledd av arrayet.
        for (int i = 0; i < aLenght; i++){
            //Finner indeksen til minste verdi
            int currentMinIndex = findMin(tmp);
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




    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
            final String NO_SUCH_ELEMENT_EXCEPTION_MESSAGE = "There seams to be not enpugh elements in the given array";

            int arrayLength = a.length;

            if ( arrayLength < 3 ){
                throw new NoSuchElementException(NO_SUCH_ELEMENT_EXCEPTION_MESSAGE);
            }

            int[] returnArray = {0,1,2};


            returnArray[0] = a[returnArray[0]];
            returnArray[1] = a[returnArray[1]];
            returnArray[2] = a[returnArray[2]];

            returnArray = indekssortering(returnArray);


            //hjelpevariabler
            int tredjeMinst = returnArray[2];
            int nestMin = returnArray[1];
            int min = returnArray[0];


            for (int i = 3; i < arrayLength; i++){
                if (a[i] < a[tredjeMinst]){
                       if (a[i] < a[nestMin]){
                           if(a[i] < a[min]){
                               tredjeMinst = nestMin;
                               nestMin = min;
                               min = i;
                           }else{
                               tredjeMinst = nestMin;
                               nestMin = i;
                           }
                       }else{
                           tredjeMinst = i;
                       }
                }
            }

        returnArray[0] = min;
        returnArray[1] = nestMin;
        returnArray[2] = tredjeMinst;

                return returnArray;
    }



    ///// Oppgave 10 //////////////////////////////////////
    public static boolean inneholdt(String a, String b) {

        int arrayCountA[] =  getArrayCount(a.split(""));
        int arrayCountB[] =  getArrayCount(b.split(""));


        for(int i = 0; i < 29; i++){
            if (arrayCountA[i] > arrayCountB[i]){
                return false;
            }
        } return true;
    }

    public static int[] getArrayCount(String[] word){
        int[] alfabetArrayCount = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        String[] alfabetArray = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K","L","M","N","O","P","Q" ,"R", "S", "T", "U", "V","W", "X","Y","Z", "Æ", "Ø", "Å" };


        for (int i = 0; i < word.length; i++){
            for (int j = 0;  j < 29; j++)
            if(word[i].equals(alfabetArray[j])) {
                alfabetArrayCount[j]++;
                break;
            }
        }

    return alfabetArrayCount;
    }

}  // Oblig1
