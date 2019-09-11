package obligEn;

import java.util.Arrays;

public class Oppg4{

   public static void delsortering(int []a) {

       int oddeTallCount = 0;

       Arrays.sort(a);

       for (int i = 0; i < a.length; i++){
           if ((a[i] & 1) != 0) {
               oddeTallCount++;
           }
       }

      for (int i = 0; i < a.length; i++) {

       for (int j = 0; j < a.length - 1; j++) {
           if (((a[j + 1] % 2) != 0) && (a[j] < a[j + 1])) {   //Sender oddetallene til venstre i tabellen,
               int temp = a[j + 1];                            //Samtidig sendes partallene til høyre.
               a[j + 1] = a[j];
               a[j] = temp;
           }
       }
   }
   // Bruker Array.sort for å sortere oddetallene.
   Arrays.sort(a, 0, oddeTallCount);

       System.out.println(Arrays.toString(a));

   }
}
