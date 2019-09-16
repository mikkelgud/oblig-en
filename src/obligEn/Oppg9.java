package obligEn;

import java.util.NoSuchElementException;

public class Oppg9 {

    public static int[]tredjeMin (int[]a){

        final String NO_SUCH_ELEMENT_EXCEPTION_MESSAGE = "There seams to be no elements in the given array";

        int arrayLength = a.length;

        // ​NoSuchElementException​ sammen med en passende tekst
        if ( arrayLength < 1 ){
            throw new NoSuchElementException(NO_SUCH_ELEMENT_EXCEPTION_MESSAGE);
        }

        int []b = Oppg8.indekssortering(a);

        int first = 0 ;      // Hjelpevariabel max er posisjonen til den største verdien (altså indeksen)
        int  second = 1;     // nest største
        int  third = 2;        // tredje største


        //. Den skal finne ​indeksene​ til de tre minste verdiene i tabellen ​a.​
        // Sorterer de tre første verdiene i riktig rekkefølge der første skal være minste, 2. nest minste 3. tredje minste

             int minValue = b[first];                // største verdi
             int secoundMinValue = b[second];           // nest største verdi
             int thirdMinValue = b[third];           // tredje største verdi

            for (int i = 2; i < arrayLength; i++) {
                    if (a[i] > minValue) {
                        second = first;
                        secoundMinValue = minValue;     // ny nest størst
                        first = i;
                        minValue = a[first];              // ny størst

                        if (a[i] > secoundMinValue ) {
                        minValue = i;
                        secoundMinValue = a[second];
                        thirdMinValue = a[third];// ny nest størst
                         }
                    else if (a[i] < thirdMinValue)

                    {}

            }}

            return new int[] {first, second, third};    // n i posisjon 0, nm i posisjon 1
        }



        //Den skal returnere en tabell med tre verdier der første verdi skal være indeksen til den minste verdien i ​a​.

//        indekssortering​()​ fra Oppgave 8

        //Bruk tre hjelpevariabler for verdier og tre hjelpevariabler for indekser

}
