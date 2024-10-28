package ua.edu.ucu.apps.laba7;

import org.junit.jupiter.api.Test;

import ua.edu.delivery.DHLDeliveryStrategy;
import ua.edu.delivery.Delivery;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DHLDeliveryStrategyTest {
    @Test
    public void testDelivery() {
        Delivery delivery = new DHLDeliveryStrategy();
        
        double price = 500.0;
        double expected = 120.0;
        double actual = delivery.delivery(price);
        
        assertEquals(expected, actual, 0.01);
    }
    
}
