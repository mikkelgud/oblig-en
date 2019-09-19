package obligEn;

public class oppg10 {

    static final int NUMBERS_OF_WORDS_IN_ALFABET = 29;

    public static boolean inneholdt(String a, String b) {
        int arrayCountA[] =  getArrayCount(a.split(""));
        int arrayCountB[] =  getArrayCount(b.split(""));

        for(int i = 0; i < NUMBERS_OF_WORDS_IN_ALFABET ; i++){
            if (arrayCountA[i] > arrayCountB[i]){
                return false;
            }
        } return true;
    }

    public static int[] getArrayCount(String[] word){
        int[] alfabetArrayCount = new int[NUMBERS_OF_WORDS_IN_ALFABET];
        String[] alfabetArray = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K","L","M","N","O","P","Q" ,"R", "S", "T", "U", "V","W", "X","Y","Z", "Æ", "Ø", "Å" };

        for (int i = 0; i < word.length; i++){
            for (int j = 0;  j < NUMBERS_OF_WORDS_IN_ALFABET; j++) {
                if (word[i].equals(alfabetArray[j])) {
                    alfabetArrayCount[j]++;
                    break;
                }
            }
        }

        return alfabetArrayCount;
    }
}

