// File: PaymentTest.java
// This class demonstrates polymorphism using the PaymentGateway interface.
public class PaymentTest {
    public static void main(String[] args) {
        // Create a PaymentGateway reference and assign a CreditCardPayment object to it.
        PaymentGateway creditCard = new CreditCardPayment();
        System.out.println("--- Credit Card Transaction ---");
        creditCard.pay(500.00);
        creditCard.refund(100.50);

        System.out.println(); // Adds a newline for readability.

        // Create another PaymentGateway reference and assign a UPIPayment object to it.
        PaymentGateway upi = new UPIPayment();
        System.out.println("--- UPI Transaction ---");
        upi.pay(250.75);
        upi.refund(50.00);
    }
}