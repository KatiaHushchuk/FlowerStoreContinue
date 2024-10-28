package ua.edu.ucu.apps.laba7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.edu.delivery.DHLDeliveryStrategy;
import ua.edu.delivery.Delivery;
import ua.edu.flower.flower.store.Flower;
import ua.edu.flower.flower.store.FlowerBucket;
import ua.edu.flower.flower.store.FlowerPack;
import ua.edu.flower.flower.store.Item;
import ua.edu.flower.flower.store.Order;
import ua.edu.payment.CreditCardPaymentStrategy;
import ua.edu.payment.Payment;

public class OrderTest {
    @Test
    public void testGetFinalPriceWithDeliveryAndPayment() {

        Flower flower = new Flower();
        flower.setPrice(30.0);
        FlowerPack flowerPack = new FlowerPack(flower, 2);
        Item item = new Item();
        item.setFlowerBucket(new FlowerBucket());
        item.getFlowerBucket().add(flowerPack);

        Order order = new Order();
        order.addItem(item);

        Delivery delivery = new DHLDeliveryStrategy();
        Payment payment = new CreditCardPaymentStrategy();
        order.setDelivery(delivery);
        order.setPayment(payment);

        double finalPrice = order.getFinalPrice();

        assertEquals(190.0, finalPrice, 0.01);
    }

    @Test
    public void testGetFinalPriceWithoutItems() {
        Order order = new Order();
        Delivery delivery = new DHLDeliveryStrategy();
        Payment payment = new CreditCardPaymentStrategy();
        order.setDelivery(delivery);
        order.setPayment(payment);
        double finalPrice = order.getFinalPrice();
        assertEquals(130.0, finalPrice, 0.01);
    }
}
