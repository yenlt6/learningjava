package learning.unittest13;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    //Using assertEquals()
    @Test
    void assertEqualsExample() {
        //Test will pass
        assertEquals(calculator.sum(1, 1), 2);

        //Test will failed
//        assertEquals(calculator.sum(2, 2), 5);

    }

    //Using assertNotEquals()
    @org.junit.jupiter.api.Test
    void assertNotEqualsExample(){
        //Test will failed
        assertNotEquals(calculator.sum(1,1),2);

        //Test will pass
        assertNotEquals(calculator.sum(2,2),5);
    }

    //Using assertArrayEquals()
    @org.junit.jupiter.api.Test
    void assertArrayEqualsExample(){
        //Test will pass
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});

        //Test will failed because element order is different
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,3,2});

        //Test will failed because number of elements are different
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3,4});
    }

    //Using assertNull() and assertNotnull()
    @org.junit.jupiter.api.Test
    void assertNull_assertNotNull(){
        String nullString = null;
        String notNullString = "Techmaster";

        //Test will pass
        assertNull(nullString);
        assertNotNull(notNullString);

        //Test will failed
        assertNull(notNullString);
        assertNotNull(nullString);
    }

    //Using assertTrue() and assetFalse()
    @org.junit.jupiter.api.Test
    void assertTrue_assertFalse(){
        //Test will pass
        assertTrue(true);
        assertFalse(false);
        assertTrue(5 > 4, "5 is greater the 4");
        assertTrue(null == null, "null is equal to null");
        assertFalse(4 > 5, "5 is greater the 4" );

        //Test will failed
        assertTrue(false);
        assertTrue(5 < 4, "4 is greater the 5");
        assertFalse(4 < 5, "4 is greater the 5" );
    }


    //Using assertSame() and assertNotSame()
    @org.junit.jupiter.api.Test
    void assertSame_assertNotSame(){
        String originalObject = "Techmaster";
        String cloneObject = originalObject;
        String otherObject = "JUnit 5";

        //Test will pass
        assertSame(originalObject, cloneObject);
        assertNotSame(originalObject, otherObject);

        //Test will failed
        assertSame(originalObject,originalObject);
        assertNotSame(originalObject,cloneObject);
    }


    //Using assertTimeout() and assertTimeoutPreemptively()
    @org.junit.jupiter.api.Test
    void assertTimeout_assertTimeoutPreemptively(){
        //This will pass
        assertTimeout(Duration.ofMinutes(1), () -> {
            return "result";
        });

        //This will fail
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(200);
            return "result";
        });

        //This will fail
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            Thread.sleep(200);
            return "result";
        });
    }


    //Using assertThrows()
    @org.junit.jupiter.api.Test
    void assertThrowsExample(){
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("error message");
        });
    }


    //Using fail()
    @org.junit.jupiter.api.Test
    public void failExample() {
        fail("FAIL - try to development");
    }

    @Test
    void assertAllExamples() {
        assertAll(
                "heading",
                () -> {
                    assertTrue(5 > 4, "5 is greater the 4");
                    assertFalse(4 > 5, "5 is greater the 4" );
                },
                () -> {
                    String nullString = null;
                    String notNullString = "Techmaster";

                    assertNull(nullString);
                    assertNotNull(notNullString);
                },
                () ->{
                    assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});
                }
        );
    }
}

