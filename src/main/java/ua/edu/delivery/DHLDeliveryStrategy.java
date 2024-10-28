package ua.edu.delivery;

public class DHLDeliveryStrategy implements Delivery{
    
    @Override
    public double delivery(double price) {
        return 120;
    }
}
