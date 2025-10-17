// File: UPIPayment.java
// This class also implements the PaymentGateway interface, providing its own specific logic.
public class UPIPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid INR " + amount + " via UPI");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of INR " + amount + " to UPI");
    }
}