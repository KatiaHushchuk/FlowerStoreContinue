package ua.edu.ucu.apps.laba7;

import org.junit.jupiter.api.Test;

import ua.edu.delivery.Delivery;
import ua.edu.delivery.PostDeliveryStrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostDeliveryStrategyTest {
    @Test
    public void testDeliveryBelowThreshold() {
        Delivery delivery = new PostDeliveryStrategy();
        
        double price = 500.0;
        double expected = 100.0;
        double actual = delivery.delivery(price);
        
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testDeliveryAboveThreshold() {
        Delivery delivery = new PostDeliveryStrategy();
        
        double price = 1200.0;
        double expected = 0.0;
        double actual = delivery.delivery(price);
        
        assertEquals(expected, actual, 0.01);
    }
    
}
