package obligEn;
//får ikke ut riktig siden man må sortere listen for å få ut riktig tall. nå sjekker den kunn tall ved siden av hverandre

public class Oppg3 {

    public static int antallUlikeSortert(int[] a){

        int teller = 1;

        if (a.length == 0){
            return 0;
        }

        for (int i = 1; i < a.length; i++){
            if(a[i] != a[i-1]){
                teller++;
            }
        }

        return teller;
    }

}
