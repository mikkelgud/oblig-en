package obligEn;

public class Main{
    public static void main(String []args){
        char[] b = {'a','b','c','d'};
        int[] a = {1,3,5,3,10,2,8,3,5,7,12,20,30};
        System.out.println("Antall ombyttinger er "+ Oppg1.ombyttinger(a));

        System.out.println("Verdien til det største tallet i listen er "+Oppg1.maks(a));

       // System.out.println("Antall ulike sorter er "+Oppg2.antallUlikeSortert(a));

       // System.out.println("Antall ulike sorter er "+Oppg3.antallUlikeSortert(a));

        Oppg4.delsortering(a);

        Oppg5.rotasjon(b);

        }
}