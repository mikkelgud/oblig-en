package obligEn;

public class Main{
    public static void main(String []args){
        Oblig1 ob1 = new Oblig1();

        int[] a = {1,2,3,4,5};
        System.out.println(ob1.antallUlikeSortert(a));
        System.out.println("Antall ombyttinger er "+ ob1.ombyttinger(a));
        System.out.println("Verdien til det største tallet i listen er "+ob1.maks(a));
        System.out.println("Welcome to the project felix and jorgen, may the setup be in your favor");
        }
}