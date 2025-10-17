class Car {
    private String brand;
    private String model;
    private double price;

    // Constructor
    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Override toString() to display car details in readable form
    @Override
    public String toString() {
        return "Car Details -> Brand: " + brand + ", Model: " + model + ", Price: ₹" + price;
    }
}

public class CarDemo {
    public static void main(String[] args) {
        // Create a Car object
        Car car1 = new Car("Tesla", "Model S", 8999999.99);

        // Print object (calls toString() automatically)
        System.out.println(car1);

        // Print class name using getClass().getName()
        System.out.println("Class Name: " + car1.getClass().getName());
    }
}
