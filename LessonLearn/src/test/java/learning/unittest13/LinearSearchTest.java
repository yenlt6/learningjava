package learning.unittest13;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {
    private static LinearSearch searcher;

    //before
    @BeforeAll
    static void setup(){
        int[] array = {2, 3, 4, 10, 40};
        searcher = new LinearSearch(array);
    }

    //Actual test methods
    @Test
    void getPosition(){
        int result = searcher.getPositionOfNumber(10);
        Assertions.assertEquals(3,result);
    }

    @Test
    void noSuchNumber(){
        int result = searcher.getPositionOfNumber(55);
        Assertions.assertEquals(-1, result);
    }

    //after
    @AfterAll
    static void finish(){
        System.out.println("Tests are finished!");
    }

}