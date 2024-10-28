package ua.edu.payment;

public class PayPalPaymentStrategy implements Payment {
    
    @Override
    public double pay(double price) {
        double finalAmount = price - 5;
        System.out.println("Paid by PayPal. Discount: 5. Total: " + finalAmount);
        return finalAmount;
    }
}
