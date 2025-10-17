class Product {
    private int productId;
    private String productName;

    // Constructor
    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    // Override equals() to compare by productId
    @Override
    public boolean equals(Object obj) {
        // Check if both references are same
        if (this == obj)
            return true;

        // Check if obj is an instance of Product
        if (obj == null || getClass() != obj.getClass())
            return false;

        // Typecast and compare productId
        Product other = (Product) obj;
        return this.productId == other.productId;
    }

    // Override toString() for better display
    @Override
    public String toString() {
        return "Product{ID=" + productId + ", Name='" + productName + "'}";
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        // Create Product objects
        Product p1 = new Product(101, "Laptop");
        Product p2 = new Product(101, "Laptop"); // same content as p1
        Product p3 = p1; // same reference as p1

        // == checks reference equality
        System.out.println("p1 == p2: " + (p1 == p2)); // false (different objects)
        System.out.println("p1 == p3: " + (p1 == p3)); // true (same reference)

        // equals() checks logical equality (based on productId)
        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true (same productId)
        System.out.println("p1.equals(p3): " + p1.equals(p3)); // true (same object)
    }
}
