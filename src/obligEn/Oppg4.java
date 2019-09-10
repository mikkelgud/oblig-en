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

       for (int i = 0; i < a.length; i++) {
           if ((a[i] & 1) != 0) {
               a[i] *= -1;
           }
       }
       Arrays.sort(a, 0, oddeTallCount);
       System.out.println(Arrays.toString(a));

   }
}
