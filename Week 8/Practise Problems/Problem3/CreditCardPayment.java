// File: CreditCardPayment.java
// This class implements the PaymentGateway interface, so it must provide a concrete implementation for both methods.
public class CreditCardPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid INR " + amount + " via Credit Card");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of INR " + amount + " to Credit Card");
    }
}