package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        PaymentCalculator obj = new PaymentCalculator();

        double b = 5000;
        double i = 0.12/365;
        double p = 100;

        int actual_value = obj.calculateMonthsUntilPaidOff(b, i, p);
        int expected_value = 70;

        assertEquals(expected_value, actual_value);
    }
}