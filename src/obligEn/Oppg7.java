package obligEn;

public class Oppg7 {
    public static String flett(String s, String t){
        StringBuilder a = new StringBuilder();
        String b = s+t;

        for(int i = 0; i < b.length(); i++){
            if(i < s.length()){
                a.append(s.charAt(i));
            }
            if(i < t.length()){
                a.append(t.charAt(i));
            }
        }

        return a.toString();
    }
}
