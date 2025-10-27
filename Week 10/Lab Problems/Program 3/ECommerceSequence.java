class PaymentGateway {
    boolean processPayment(double amount) {
        System.out.println("Processing payment of ₹" + amount + "...");
        System.out.println("Payment successful!");
        return true;
    }
}

class InventoryService {
    boolean checkInventory(String item) {
        System.out.println("Checking inventory for item: " + item);
        return true; // Assume item is available
    }
}

class OrderService {
    PaymentGateway paymentGateway = new PaymentGateway();
    InventoryService inventoryService = new InventoryService();

    boolean placeOrder(String item, double amount) {
        System.out.println("OrderService: Received order request for " + item);

        // Step 1: Check inventory
        boolean available = inventoryService.checkInventory(item);
        if (!available) {
            System.out.println("OrderService: Item out of stock!");
            return false;
        }

        // Step 2: Process payment
        boolean paymentStatus = paymentGateway.processPayment(amount);
        if (paymentStatus) {
            System.out.println("OrderService: Order placed successfully!");
            return true;
        } else {
            System.out.println("OrderService: Payment failed!");
            return false;
        }
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(OrderService orderService, String item, double amount) {
        System.out.println(name + " is placing an order for: " + item);
        boolean success = orderService.placeOrder(item, amount);
        if (success) {
            System.out.println(name + ": Order confirmed!");
        } else {
            System.out.println(name + ": Order failed!");
        }
    }
}

public class ECommerceSequence {
    public static void main(String[] args) {
        Customer c1 = new Customer("Karthik");
        OrderService orderService = new OrderService();

        c1.placeOrder(orderService, "Wireless Mouse", 899.00);
    }
}
