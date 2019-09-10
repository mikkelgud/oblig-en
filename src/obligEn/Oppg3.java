package obligEn;

public class Oppg3 {

    public static int antallUlikeSortert(int[] a){

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

}
