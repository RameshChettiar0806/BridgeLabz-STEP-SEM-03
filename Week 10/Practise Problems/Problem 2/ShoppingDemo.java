import java.util.*;

// Product class
class Product {
    // Declare private attributes: name, price
    private String name;
    private double price;

    // Create a parameterized constructor to initialize all attributes
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Create showDetails() to display product info
    public void showDetails() {
        System.out.println("Product: " + name + ", Price: ₹" + price);
    }

    // Getter for product name
    public String getName() {
        return name;
    }
}

// Order class
class Order {
    // Declare private attributes: orderId (String), products (List<Product>)
    private String orderId;
    private List<Product> products;

    // Constructor to initialize orderId and list
    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Add a product to order
    public void addProduct(Product product) {
        products.add(product);
        // Print "Added product '<productName>' to Order <orderId>"
        System.out.println("Added product '" + product.getName() + "' to Order " + orderId);
    }

    // Show order details
    public void showOrderDetails() {
        // Print "Order <orderId> contains:"
        System.out.println("Order " + orderId + " contains:");
        // Loop through products and call showDetails()
        for (Product product : products) {
            product.showDetails();
        }
    }

    // Getter for orderId
    public String getOrderId() {
        return orderId;
    }
}

// Customer class
class Customer {
    // Declare private attributes: name, email, orders (List<Order>)
    private String name;
    private String email;
    private List<Order> orders;

    // Constructor to initialize customer info
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    // Place an order
    public void placeOrder(Order order) {
        // Add order to orders list
        orders.add(order);
        // Print "<customerName> placed Order <orderId>"
        System.out.println(name + " placed Order " + order.getOrderId());
    }

    // Display all orders for this customer
    public void showCustomerOrders() {
        // Print "Orders placed by <customerName>:"
        System.out.println("Orders placed by " + name + ":");
        // Loop through orders and call showOrderDetails()
        for (Order order : orders) {
            order.showOrderDetails();
        }
    }
}

// Main class
public class ShoppingDemo {
    public static void main(String[] args) {
        // Step 1 - Create Customer object
        Customer customer = new Customer("Amit", "amit@gmail.com");

        // Step 2 - Create Product objects
        Product laptop = new Product("Laptop", 75000);
        Product mobile = new Product("Mobile", 25000);
        Product mouse = new Product("Mouse", 800);

        // Step 3 - Create 2 Order objects and add different products to each
        Order order1 = new Order("ORD001");
        order1.addProduct(laptop);
        order1.addProduct(mouse);

        Order order2 = new Order("ORD002");
        order2.addProduct(mobile);

        // Step 4 - Associate orders with customer using placeOrder()
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Step 5 - Display all orders and their products using showCustomerOrders()
        customer.showCustomerOrders();

        // NOTE: This demo represents Object Diagram runtime objects and links.
    }
}