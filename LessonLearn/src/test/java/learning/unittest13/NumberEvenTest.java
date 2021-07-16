package learning.unittest13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberEvenTest {
    @Test
    void assertTrue() {
        boolean result = NumberEven.isNumberEven(8);
        Assertions.assertTrue(result);
    }
    @Test
    void assertFalse() {
        boolean result = NumberEven.isNumberEven(3);
        Assertions.assertFalse(result);


    }

}