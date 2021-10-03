package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    void investmentCalc() {
        Solution29 object = new Solution29();

        int r = 4;

        int actual_value = object.investmentCalc(r);
        int expected_value = 18;

        assertEquals(actual_value, expected_value, 0.000001);
    }
}