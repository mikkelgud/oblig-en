package Test;

import obligEn.Oppg1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class Oppg1Test {

    int testArray[] ={23,2,3,24,23,2,4453,645,56,765,76};
    int testArrayNegative[] ={-12,-3,-13,-16};

    @Test
    public void returnererMaksStørsteVerdiFraEtPositivtArray() {
        int expected = 4453;
        int actualHigestNumberFromMethod = Oppg1.maks(testArray);

        Assertions.assertEquals( actualHigestNumberFromMethod, expected);
    }
    @Test
    public void returnererMaksStørsteVerdiFraEtNegativeArray() {
        int expected = -3;
        int actualHigestNumberFromMethod = Oppg1.maks(testArrayNegative);

        Assertions.assertEquals( actualHigestNumberFromMethod, expected);
    }

    @Test
    public void fårFunksjonRiktigOmbyttinger() {
        int expectedPermutations = 8;
        int actualPermutations = Oppg1.ombyttinger(testArray);

        Assertions.assertEquals( actualPermutations, expectedPermutations);
    }

    @Test
    public void fårFunksjonRiktigOmbyttingerMedNegativeTall() {
        int expectedPermutations = 2;
        int actualPermutations = Oppg1.ombyttinger(testArrayNegative);

        Assertions.assertEquals( actualPermutations, expectedPermutations);
    }

}