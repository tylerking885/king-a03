package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    public void test_passwordValidator_accuracy() {
        Solution25 obj = new Solution25();

        String p = "12345";
        String p2 = "abcdef";
        String p3 = "abc123xyz";
        String p4 = "1337h@xor!";

        int actual_value = obj.passwordValidator(p);
        int actual_value2 = obj.passwordValidator(p2);
        int actual_value3 = obj.passwordValidator(p3);
        int actual_value4 = obj.passwordValidator(p4);

        int expected_value = 1;
        int expected_value2 = 2;
        int expected_value3 = 3;
        int expected_value4 = 4;

        assertEquals(actual_value, expected_value, 0.000001);
        assertEquals(actual_value2, expected_value2, 0.000001);
        assertEquals(actual_value3, expected_value3, 0.000001);
        assertEquals(actual_value4, expected_value4, 0.000001);
    }
}