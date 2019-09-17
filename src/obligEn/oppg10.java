package obligEn;

public class oppg10 {
    public static boolean inneholdt(String a, String b) {

        for (int i = 0; i < b.length(); i++) {
            if (a.indexOf(b.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}

