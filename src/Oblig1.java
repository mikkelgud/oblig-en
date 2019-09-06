

import java.util.NoSuchElementException;

public class Oblig1 {


    public static int maks(int[] a) {

        if (a.length < 1){
            throw new NoSuchElementException("Tabellen er tom!");

        }

        int størsteTall = 0;
        for (int i = 1; i < a.length; i++){


            if(a[i] < a[i-1]){

                int temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;


            }

            størsteTall = a[i];

        }

        return størsteTall;
    }
        public static int ombyttinger(int[] a){

            int teller = 0;

            for (int i = 1; i < a.length; i++){

                if (a[i] < a[i-1]){

                    teller++;

                }

            }
            return teller;
        }

        public static int antallUlikeSortert(int[] a){

        int teller = 1;
        for(int i = 1; i < a.length; i++){

            if (a[i] < a[i-1]){
                throw new IllegalStateException("Listen er ikke sortert!");

            }

            if ( a[i-1] != a[i] && a[i] != a[i-1]){
                teller++;
            }
        }

        return teller;
        }

    public static void main(String[] args){

        int[] a = {1,2,3,4,5};
        System.out.println(Oblig1.antallUlikeSortert(a));
        System.out.println("Antall ombyttinger er "+Oblig1.ombyttinger(a));
        System.out.println("Verdien til det største tallet i listen er "+Oblig1.maks(a));



    }

}
