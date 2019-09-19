package obligEn;

import java.util.NoSuchElementException;

public class Oppg9 {
    public static int[] tredjeMin(int[] a) {
        final String NO_SUCH_ELEMENT_EXCEPTION_MESSAGE = "There seams to be not enpugh elements in the given array";

        int arrayLength = a.length;

        if ( arrayLength < 3 ){
            throw new NoSuchElementException(NO_SUCH_ELEMENT_EXCEPTION_MESSAGE);
        }

        int[] returnArray = {0,1,2};


        returnArray[0] = a[returnArray[0]];
        returnArray[1] = a[returnArray[1]];
        returnArray[2] = a[returnArray[2]];

        returnArray = Oppg8.indekssortering(returnArray);


        //hjelpevariabler
        int tredjeMinst = returnArray[2];
        int nestMin = returnArray[1];
        int min = returnArray[0];


        for (int i = 3; i < arrayLength; i++){
            if (a[i] < a[tredjeMinst]){
                if (a[i] < a[nestMin]){
                    if(a[i] < a[min]){
                        tredjeMinst = nestMin;
                        nestMin = min;
                        min = i;
                    }else{
                        tredjeMinst = nestMin;
                        nestMin = i;
                    }
                }else{
                    tredjeMinst = i;
                }
            }
        }

        returnArray[0] = min;
        returnArray[1] = nestMin;
        returnArray[2] = tredjeMinst;

        return returnArray;
    }
}
