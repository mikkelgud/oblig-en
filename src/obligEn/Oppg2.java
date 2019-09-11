package obligEn;

public class Oppg2 {

    public static int antallUlikeSortert(int[] a){

        final String ILLIGALSTATE_EXCEPTION_MESSAGE = "Array must be sorted for usage of this methode";
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

}
