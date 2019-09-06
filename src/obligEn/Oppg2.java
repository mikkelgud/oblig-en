package obligEn;

public class Oppg2 {

    public static int antallUlikeSortert(int[] a){

        int teller = 1;

        if (a.length == 0){
            teller = 0;
        }

        for(int i = 1; i < a.length; i++){

            if (a[i] < a[i-1]){
                throw new IllegalStateException("Listen er ikke sortert!");
            }

            if ( a[i-1] != a[i]){
                teller++;
            }
        }

        return teller;
    }

}
