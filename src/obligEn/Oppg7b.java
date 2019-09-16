package obligEn;


public class Oppg7b {
    public static String flett(String... s){
        StringBuilder a = new StringBuilder();

        for(int i = 0; i > s.length; i++){
            if(s.length < i) {
               a = a.append(s[i].charAt(i));
            }
        }
        return a.toString();
    }
}
