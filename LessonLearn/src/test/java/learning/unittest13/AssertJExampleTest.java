package learning.unittest13;

import junit.framework.TestCase;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.entry;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class AssertJExampleTest extends TestCase {

    @Test
    @DisplayName("TestAssertJ")
    void sampleAssertion() {
        assertThat("This is my sample Test").isNotNull()
                .startsWith("This")
                .contains("sample")
                .endsWith("Test");
    }

    @Test
    @DisplayName("TestObject")
    void testMethod_Objects() {
        Dog mic = new Dog("Mic", 10.5);
        Dog micClone = new Dog("Mic", 10.5);
        Dog otherDog = new Dog("Mic", 15.5);

        //Test will fail as isEqualTo() compares object reference
        //assertThat(mic).isEqualTo(micClone);

        //Test will pass
        assertThat(mic).isEqualToComparingFieldByFieldRecursively(micClone);

        //Only compare name
        assertThat(mic).isEqualToComparingOnlyGivenFields(otherDog, "name");
    }

    @Test
    @DisplayName("TestArray")
    void testMethod_Arrays() {
        String[] countries = new String[]{"Russia", "Viet Nam", "America", "Japan", "China"};
        assertThat(countries).contains("Viet Nam");

        assertThat(countries).isNotEmpty();
        assertThat(countries).startsWith("Russia");

        assertThat(countries).isNotEmpty() //Array is not empty
                .contains("Viet Nam")      //contains "Viet Nam" element
                .doesNotContainNull()      //does not contains any nulls
                .containsSequence("America", "Japan");  //contains sequence of element "America", "Japan"
    }

    @Test
    @DisplayName("TestStrings")
    void testMethod_Strings() {
        String say = "Chị không muốn nhiêu bug nhưng mà bug nhiều nên chị phải fix";
        String sayClone = say;

        assertThat(say).isNotNull()     //String is not empty
                .startsWith("Chị")      //Start with "Chị
                .doesNotContain("Anh")  //Not contain "Anh"
                .endsWith("fix");       //End with "fix"

        assertThat(say).isEqualTo(sayClone);
    }


    @Test
    @DisplayName("TestNumbers")
    void testMethod_Numbers() {
        Double value = 12.0;
        assertThat(value).isEqualTo(12.2, withPrecision(1d));
        assertThat(value).isCloseTo(15.0, Offset.offset(4d));
        assertThat(value).isBetween(10.0, 15.0); //value >= 10.0 and value <= 15.0
        assertThat(value).isStrictlyBetween(10.0, 15.0); //value > 10.0 and value < 15.0
    }

    @Test
    @DisplayName("TestMap")
    void testMethod_Map() {
        Map<String, String> countryCityMap = new HashMap<String, String>();
        countryCityMap.put("Viet Nam", "Ha Noi");
        countryCityMap.put("Japan", "Tokyo");
        countryCityMap.put("Canada", "Ottawa");
        countryCityMap.put("Australian", "Canberra");

        assertThat(countryCityMap).isNotEmpty()          //Map is not empty
                .hasSize(4)                              //Size = 4
                .doesNotContainValue("Sydney")           //Does not contain value "Sydney"
                .contains(entry("Viet Nam", "Ha Noi"))   //Contain ("Viet Nam", "Ha Noi")
                .containsKey("Japan")                    //Contains key "Japan"
                .containsValue("Ottawa");                //Contains value Ottawa
    }

    @Test
    @DisplayName("TestThrowable")
    void testMethod_Throwable() {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("This is error message");
        IllegalArgumentException illegalArgumentExceptionWithCause = new IllegalArgumentException("This is error message", new IOException());

        assertThat(illegalArgumentException).hasNoCause()
                .hasMessageStartingWith("T")
                .hasMessageEndingWith("e");
        assertThat(illegalArgumentExceptionWithCause).hasCauseExactlyInstanceOf(IOException.class);
    }

    @Test
    @DisplayName("TestThrowable")
    void testMethod_Class() {
        Dog mic = new Dog("Mic", 10.5);
        assertThat(Dog.class).isNotAnnotation()
                .isNotFinal()
                .hasDeclaredFields("name")
                .hasDeclaredFields("weight");
        assertThat(mic.getWeight()).as("%d's weight need to be more than 0", mic.getName())
                .isGreaterThan(0);
    }


//    private vn.techmaster.Test test;
//    @BeforeEach
//    public void setup() {
//        test = new vn.techmaster.Test();
//    }
////
//    @Test
//    @DisplayName("Chia số cho 0")
//    void testDivisor(){
//        int divisor = 9;
//        int dividend = 7;
//        test.div(divisor, dividend);
//
//        assertThat(divisor).isNotZero();
//
//
//    }

    @Test
    @DisplayName("Số điện thoại bắt đầu là 0 và chỉ có số")
    void test_contact() {
        String phoneNUmber = "0123456789";
        assertThat(phoneNUmber).isNotEmpty()
                .startsWith("0")
                .containsOnlyDigits();
    }
}
