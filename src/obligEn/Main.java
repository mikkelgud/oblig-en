package obligEn;

public class Main{
    public static void main(String []args){

        int[] a = {-17 , -16 , 15 , 18 , 29 , 10 , 19 , 22 , -20 ,  6};
        char[] b = {'a','n','b','e','f'};
        String h = "HEIIIII";
        String k = "velkommenyess";
        //System.out.println("Verdien til det største tallet i listen er "+Oppg1.maks(a));
        //System.out.println("Antall ombyttinger er "+ Oppg1.ombyttinger(a));
        //System.out.println("Antall ulike sorter er "+Oppg2.antallUlikeSortert(a));
        //System.out.println("Antall ulike tall er "+Oppg3.antallUlikeSortert(a));
        Oppg4.delsortering(a);
        Oppg5.rotasjon(b);
        Oppg6.rotasjon(b,2);
        Oppg1.maks(a);
        Oppg1.ombyttinger(a);
        System.out.println(Oppg7.flett(h,k));


        }
}