class Cart {
    void addItem(String item) {
        System.out.println("Cart: Item '" + item + "' added to cart.");
    }
}

class PaymentService {
    void makePayment(double amount) {
        System.out.println("PaymentService: Payment of ₹" + amount + " processed successfully.");
    }
}

class OrderService {
    void confirmOrder(String item) {
        System.out.println("OrderService: Order confirmed for item '" + item + "'.");
    }
}

class Customer {
    Cart cart = new Cart();
    PaymentService payment = new PaymentService();
    OrderService order = new OrderService();

    void placeOrder(String item, double amount) {
        System.out.println("Customer: Initiating order for '" + item + "'.");
        cart.addItem(item);
        payment.makePayment(amount);
        order.confirmOrder(item);
        System.out.println("Customer: Order placed successfully!");
    }
}

public class OnlineShoppingSequenceDiagram {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.placeOrder("Wireless Mouse", 1200.00);
    }
}
