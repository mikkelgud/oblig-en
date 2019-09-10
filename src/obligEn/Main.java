package obligEn;

public class Main{
    public static void main(String []args){

        int[] a = {1,7,6,3,3,4,7};
        System.out.println("Verdien til det største tallet i listen er "+Oppg1.maks(a)); //er listen egt sortert?
        System.out.println("Antall ombyttinger er "+ Oppg1.ombyttinger(a));
        System.out.println("Antall ulike sorter er "+Oppg2.antallUlikeSortert(a));
        System.out.println("Antall ulike tall er "+Oppg3.antallUlikeSortert(a)); //feil må få sortert liste først
        }
}