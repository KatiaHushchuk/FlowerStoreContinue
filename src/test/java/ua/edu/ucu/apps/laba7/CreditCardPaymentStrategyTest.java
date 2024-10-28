package ua.edu.ucu.apps.laba7;

import org.junit.jupiter.api.Test;

import ua.edu.payment.CreditCardPaymentStrategy;
import ua.edu.payment.Payment;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardPaymentStrategyTest {
    @Test
    public void testPay() {
        Payment payment = new CreditCardPaymentStrategy();
        
        double price = 100.0;
        double expected = 110.0;
        double actual = payment.pay(price);
        
        assertEquals(expected, actual, 0.01);
    }
}
