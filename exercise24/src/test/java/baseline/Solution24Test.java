package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    public void test_isAnagram_return_value() {
        Solution24 obj = new Solution24();

        // True case
        char[] s1 =  new char[]{'n', 'o', 't', 'e'};
        char[] s2 = new char[]{'t', 'o', 'n', 'e'};

        // False case
        char[] s3 =  new char[]{'n', 'o', 't', 'e'};
        char[] s4 = new char[]{'b', 'o', 'n', 'e'};

        boolean actual_value = obj.isAnagram(s1, s2);
        boolean actual_value2 = obj.isAnagram(s3, s4);

        assertTrue(actual_value, String.valueOf(0.000001));
        assertFalse(actual_value2, String.valueOf(0.000001));
    }

}