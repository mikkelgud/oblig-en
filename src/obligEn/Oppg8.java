package obligEn;

import java.util.Arrays;

public class Oppg8 {
    public static int[] indekssortering(int[] a){
        int[] indeks = new int[a.length];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++){
            if (a[i] < min){
                min = a[i];
                indeks[i] = i;
            }
        }

        System.out.println(Arrays.toString(indeks));


        return indeks;
    }

}
