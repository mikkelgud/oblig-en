package obligEn;

public class Main{
    public static void main(String []args){
        Oblig1 ob1 = new Oblig1();

        int[] a = {1,3,5,6,7};
        System.out.println("Antall ulike sorter er "+ob1.antallUlikeSortert(a));
        System.out.println("Antall ombyttinger er "+ ob1.ombyttinger(a));
        System.out.println("Verdien til det største tallet i listen er "+ob1.maks(a));
        }
}