package obligEn;

import java.util.Arrays;

public class Oppg8 {
    public static int[] indekssortering(int[] a) {

        int[] indeks = new int[a.length];

        int minsteTall = Integer.MAX_VALUE;
        int teller = 0;
        int minIndeks = findMin(a);

        for (int i = 0; i < a.length; i++){
            if(minIndeks < minsteTall){
                indeks[teller] = minIndeks;
                teller++;
            }
        }
        System.out.println(Arrays.toString(indeks));
        return indeks;
    }

    public static int findMin(int[] a){
        int minIndeks = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++){
            if (a[i] < minIndeks){
                minIndeks = i;
            }
        }
        return minIndeks;
    }

}
