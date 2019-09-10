package obligEn;

import java.util.Arrays;

public class Oppg4{

   public static void delsortering(int []a) {
       int venstre = 0;
       int høyre = a.length - 1;

       int oddeTallCount = 0;

       while (venstre < høyre) {
           while (a[venstre] % 2 != 0) {
               venstre++;
               oddeTallCount++;
           }
           while (a[høyre] % 2 == 0 && venstre < høyre) {
               høyre--;

               if (venstre < høyre) {
                   int temp = a[venstre];
                   a[venstre] = a[høyre];
                   a[høyre] = temp;
               }
           }
           Arrays.sort(a, 0, oddeTallCount);
           Arrays.sort(a, oddeTallCount, a.length);
       }
       System.out.println(Arrays.toString(a));
   }
}
