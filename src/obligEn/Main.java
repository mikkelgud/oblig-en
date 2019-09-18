package obligEn;

import java.util.Arrays;

public class Main{
    public static void main(String []args){

        int[] a = {2, 3, 4, 1, 5, 6};
        long tid = System.currentTimeMillis();
        System.out.println(Oblig1.inneholdt("ABBA", "BARABERER"));
tid = System.currentTimeMillis() -tid;
        System.out.println(tid);
        }
}