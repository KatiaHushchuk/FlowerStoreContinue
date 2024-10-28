package ua.edu.payment;

public class CreditCardPaymentStrategy implements Payment {

    @Override
    public double pay(double price) {
        double finalAmount = price + 10;
        System.out.println("Paid by Credit Card. Fee: 10. Total: " + finalAmount);
        return finalAmount;
    }
}
