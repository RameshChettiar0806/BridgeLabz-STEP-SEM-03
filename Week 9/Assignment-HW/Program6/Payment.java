// Interface for discount functionality
interface Discount {
    double apply(double amount);
}

public class Payment {

    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void processTransaction() {
        System.out.println("Processing transaction for amount: ₹" + amount);

        // Local Inner Class: Validator (defined inside a method)
        class Validator {
            public boolean isValid() {
                return amount > 0;
            }
        }

        Validator validator = new Validator();

        if (!validator.isValid()) {
            System.out.println("Invalid payment amount!");
            return;
        }

        // Anonymous Inner Class: implements Discount interface dynamically
        Discount discount = new Discount() {
            @Override
            public double apply(double amt) {
                // Example: 10% discount
                double discounted = amt * 0.9;
                System.out.println("Discount applied! New amount: ₹" + discounted);
                return discounted;
            }
        };

        // Applying discount and completing payment
        amount = discount.apply(amount);
        System.out.println("Transaction completed for amount: ₹" + amount);
    }

    // Main method to test
    public static void main(String[] args) {
        Payment payment1 = new Payment(1000);
        payment1.processTransaction();

        System.out.println("\n--- Another Example ---");
        Payment payment2 = new Payment(-500);
        payment2.processTransaction();
    }
}
