package obligEn;


public class Oppg7b {
    public static String flett(String... s){
        StringBuilder a = new StringBuilder();
        int sum = 0;
        int lOrd = 0;

        for(String sjekk : s){
            StringBuilder sa = new StringBuilder(sjekk);
            sum += sa.length();

            if(sa.length() > lOrd){
                lOrd = sa.length();
            }
        }

        int teller = 0;
        int i = 0;

        while(teller < lOrd){
            if(new StringBuilder(s[i]).length() > teller){
                a.append(s[i].charAt(teller));
            }

            if(i == s.length-1){
                teller++;
                i = -1;
            }

            i++;
        }
        return a.toString();
    }
}
