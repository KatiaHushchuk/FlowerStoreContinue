package ua.edu.flower.flower.store;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import ua.edu.delivery.Delivery;
import ua.edu.payment.Payment;

@Getter
@Setter
public class Order {

    List<Item> items;
    private Payment payment;
    private Delivery delivery;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double getFinalPrice() {

        double totalPrice = items.stream()
                            .mapToDouble(Item::getPrice)
                            .sum();
        double deliveryCost = delivery.delivery(totalPrice);
        System.out.println("Delivery cost: " + deliveryCost);
        totalPrice += deliveryCost;
        double finalPrice = payment.pay(totalPrice);
        System.out.println("Final price after payment processing: " + finalPrice);
        
        return finalPrice;
    }
    
}
