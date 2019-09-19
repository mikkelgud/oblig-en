package obligEn;

public class Oppg7 {
    public static String flett(String s, String t) {
        StringBuilder a = new StringBuilder();
        String b = s+t;    //lager en ny string som inneholder både s string og t string

        for(int i = 0; i < b.length(); i++){
            if(i < s.length()){
                a.append(s.charAt(i));    //legger til verdiene i s[i] inn i stringbuilderen a
            }
            if(i < t.length()){
                a.append(t.charAt(i));  //legger t[i] inn i stringbuilder a
            }
        }

        return a.toString();
    }
}
