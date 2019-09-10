package obligEn;

import java.util.Arrays;

public class Oppg4{

   public static void delsortering(int []a) {

       int oddeTallCount = 0;

       for (int i = 0; i < a.length; i++)
         if ((a[i] & 1) != 0){
           a[i] *= -1;
           oddeTallCount++;
           }

       Arrays.sort(a);
         System.out.println(Arrays.toString(a));

       for (int i = 0; i < a.length; i++) {
           if ((a[i] & 1) != 0) {
               a[i] *= -1;
           }

           for (int j = 0; j < a.length - 1; j++){
               if (((a[j+1] % 2)!=0) && (a[j]<a[j+1]) ){   //sorterer oddetallene på venstre side.
                   int temp = a[j+1];
                   a[j+1] = a[j];
                   a[j] = temp;
               }
           }


       }
       for (int i = 0; i < a.length; i++){
           if ((a[i]<0) && (a[i] % 2) == 0){                //Sorterer negative partall.

               if ((a[i+1] % 2) != 0){
                   int temp = a[i];
                   a[i] = a[i+1];
                   a[i+1] = temp;
               }

           }
       }
       Arrays.sort(a, 0, oddeTallCount);

       System.out.println(Arrays.toString(a));

   }
}
