package obligEn;

public class Oppg4{

   public static void delsortering(int []a){
    //Instansierer hjelpeverdier.
       int r = a.length - 1;
       int l = 0;

       for(int i = 0; i < a.length-1; ++i) {
           int støtteverdi = 0;
//          Sjekker om nummer er partall eller oddetall og legger verdiene inn i rekken
          if(a[i]%2 == 0){
              System.out.println("partall");
              //Dersom det bakerste leddet også er partall Legger jeg de bakerst i rekken.
              if(a[r]%2 == 0){
                 a[r] = a[i];
              }else{
                  støtteverdi = a[i];
                  a[i] = a[r];
                  a[r] = støtteverdi;
              }
              System.out.println(a[r] + "= a["+r+"] r");
              System.out.println(a[i] + " = a["+i+"] i");
              //Sette r slik at a[r] ligger på neste plass i rekken.
              r = r - 1;
          }else{
//              System.out.println("oddetall: ");
//              //Dersom de er oddetall, legger jeg de først i rekken.
//             a[l]  = a[i];
//              System.out.println(a[l] + " = a[" +l +"] l");
//              System.out.println(a[i] + " = a["+i+"] i");
//              //Sette l slik at a[l] ligger på neste plass i rekken.
//              l++;
          }
       }

       for (int i = 0; i < a.length; i++){
           System.out.println(a[i]);
       }
   }
}
