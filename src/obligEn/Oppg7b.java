package obligEn;

public class Oppg7b {
    public static String flett(String... s){
        StringBuilder a = new StringBuilder();

        for(int i = 0; i > s.length; i++){
            a.append(s[i]);
        }

        return a.toString();
    }
}
