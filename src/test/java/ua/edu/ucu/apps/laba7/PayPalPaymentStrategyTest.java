package ua.edu.ucu.apps.laba7;

import org.junit.jupiter.api.Test;
import ua.edu.payment.PayPalPaymentStrategy;
import ua.edu.payment.Payment;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayPalPaymentStrategyTest {
    @Test
    public void testPay() {
        Payment payment = new PayPalPaymentStrategy();
        
        double price = 100.0;
        double expected = 95.0;
        double actual = payment.pay(price);
        
        assertEquals(expected, actual, 0.01);
    }
    
}
