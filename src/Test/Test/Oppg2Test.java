package Test;

import obligEn.Oppg2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Oppg2Test {

    int testArray[] ={2,2,23,23,44,56,76};
    int testArrayPositveAndNegative []= {-10, -10, -8, -1, 2, 5};
    int InvalidArray[] ={-12,-3,-13,-3, -16, 3,21};
    final String EXPECTED_ILLIGALSTATE_EXCEPTION_MESSAGE = "Array must be sorted for usage of this methode";



    @Test
    void returnererAntallUlikeSortertRiktig() {
        int expected = 5;
       int actual = Oppg2.antallUlikeSortert(testArray);

        Assertions.assertEquals( actual, expected);

    }

    @Test
    void returnererAntallUlikeSortertRiktigNegativeOgPositiveHeltall() {
        int expected = 5;
        int actual = Oppg2.antallUlikeSortert(testArrayPositveAndNegative);

        Assertions.assertEquals( actual, expected);

    }

    @Test
    void fungererFeilMeldingForIkkeSortertListe() {
        try {
           Oppg2.antallUlikeSortert(InvalidArray);
            fail();
        } catch (IllegalStateException expectedException) {
            Assertions.assertEquals(
                     EXPECTED_ILLIGALSTATE_EXCEPTION_MESSAGE
                   ,
                    expectedException.getMessage());
        }
    }

}