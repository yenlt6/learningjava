package exam;

import junit.framework.TestCase;
import learning.unittest13.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class Task5Test extends TestCase {
    Task5 task5 = new Task5();

    @Test
    @DisplayName("Test Case 1")
    public void testCase1() {
        Set<Integer> intSet = new HashSet<>();
        intSet.add(2);
        intSet.add(20);
        intSet.add(21);
        intSet.add(5);
        intSet.add(8);
        intSet.add(15);
        intSet.add(26);
        intSet.add(8);
        intSet.add(9);
        intSet.add(10);


        task5.removeAllNumbersGreaterThan10(intSet);

        assertThat(task5.removeAllNumbersGreaterThan10(intSet)).isNotNull()
                .contains(2)
                .contains(5);



    }
}





