package obligEn;

public class Main{
    public static void main(String []args){

        int[] a = {1,6,6,9,10,4,8};
        char[] b = {'a','n','b','e','f'};
        System.out.println("Verdien til det største tallet i listen er "+Oppg1.maks(a));
       // System.out.println("Antall ombyttinger er "+ Oppg1.ombyttinger(a));
        //System.out.println("Antall ulike sorter er "+Oppg2.antallUlikeSortert(a));
        System.out.println("Antall ulike tall er "+Oppg3.antallUlikeSortert(a));
        Oppg4.delsortering(a);
        Oppg5.rotasjon(b);
        Oppg6.rotasjon(b,2);


        }
}