package obligEn;

public class Main{
    public static void main(String []args){

        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Antall ulike sorter er "+Oppg2.antallUlikeSortert(a));
        System.out.println("Antall ombyttinger er "+ Oppg1.ombyttinger(a));
        System.out.println("Verdien til det største tallet i listen er "+Oppg1.maks(a));


        }
}