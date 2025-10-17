// File: PaymentGateway.java
public interface PaymentGateway {
    // Declaring the pay method. Interfaces only declare methods, they don't implement them.
    void pay(double amount);

    // Declaring the refund method.
    void refund(double amount);
}