package obligEn;


public class Oppg7b {
    public static String flett(String... s) {
        StringBuilder a = new StringBuilder();  //opretter stringbuilder(lager en ny string)
        int sum = 0;
        int lOrd = 0;

        for(String sjekk : s){    //lager for loop som løper igjennom s
            StringBuilder sa = new StringBuilder(sjekk); //leger en ny String med verdiene til sjekk
            sum += sa.length(); //gjør slik at sum blir lengden til den nye stringen

            if(sa.length() > lOrd){   //hvis lengden til sa(den nye strengen) er større en lOrd = 0
                lOrd = sa.length();  // så skal lOrd bli satt til sa sin lengde
            }
        }

        int teller = 0;   // lager en teller som skal peke på bokstavene
        int i = 0;  // leger en verdie som skal peke på ordene

        while(teller < lOrd){  // mens teller er mindre enn lOrd
            if(new StringBuilder(s[i]).length() > teller){  //og hvis den nye strengen med s[i] sin lengde er større en bokstav pekeren
                a.append(s[i].charAt(teller));  //skal vi legge til s[ordpeker] sin bokstavpeker
            }

            if(i == s.length-1){
                teller++;
                i = -1;  // nullstiller i og får den til å starte på nytt (første ord)
            }

            i++;
        }
        return a.toString();
    }
}
