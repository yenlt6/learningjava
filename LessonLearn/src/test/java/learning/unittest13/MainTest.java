package learning.unittest13;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("Test_Email")
    public void testEmail_Method(){
        String email = "ngoc@techmater.vn";
        assertThat(email).isNotEmpty()
                .containsPattern("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");

        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        assertThat(email).isNotEmpty()
                .matches(EMAIL_REGEX);

    }

    @Test
    @DisplayName("Test_Weight")
    public void testWeight_Method(){
        double weight = 40;
        assertThat(weight).isNotNull()
                .isNotZero()
                .isBetween(1d, 200d);
    }

    @Test
    @DisplayName("Test_ID")
    public void testID_Method(){
       String [] arrayID = new String[5];
       arrayID[0] = "765254186";
       arrayID[1] = "695421357";
       arrayID[2] = "784156324";
       arrayID[3] = "765254847";
       arrayID[4] = "521489354";

       assertThat(arrayID).hasSize(5)
               .doesNotContainNull()
               .doesNotHaveDuplicates();

       for (int i = 0; i < arrayID.length; i++){
           assertThat(arrayID[i]).hasSize(9)
                   .containsOnlyDigits();
       }

    }



}