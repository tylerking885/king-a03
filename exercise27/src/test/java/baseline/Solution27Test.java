package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void validateFirstNameFill() {
        Solution27 object = new Solution27();

        String firstname = "John";

        boolean actual_value = object.validateFirstNameFill(firstname);

        assertFalse(actual_value, String.valueOf(0.000001));
    }

    @Test
    void validateLastNameFill() {
        Solution27 object2 = new Solution27();

        String lastname = "Johnson";

        boolean actual_value = object2.validateLastNameFill(lastname);

        assertFalse(actual_value, String.valueOf(0.000001));
    }

    @Test
    void validateMinLengthFirstName() {
        Solution27 object3 = new Solution27();

        String firstname = "John";

        boolean actual_value = object3.validateMinLengthFirstName(firstname);

        assertFalse(actual_value, String.valueOf(0.000001));
    }

    @Test
    void validateMinLengthLastName() {
        Solution27 object4 = new Solution27();

        String lastname = "Johnson";

        boolean actual_value = object4.validateMinLengthLastName(lastname);

        assertFalse(actual_value, String.valueOf(0.000001));
    }

    @Test
    void validateZipCode() {
        Solution27 object5 = new Solution27();

        String zip = "55555";

        boolean actual_value = object5.validateZipCode(zip);

        assertTrue(actual_value, String.valueOf(0.000001));
    }

    @Test
    void validateID() {
        Solution27 object6 = new Solution27();

        String ID = "TK-1234";

        boolean actual_value = object6.validateID(ID);

        assertTrue(actual_value, String.valueOf(0.000001));
    }
}