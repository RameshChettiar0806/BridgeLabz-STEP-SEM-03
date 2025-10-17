public abstract class Vehicle {
    // Abstract method to be implemented by subclasses
    public abstract void start();

    // Non-abstract method with a default implementation
    public void fuelType() {
        System.out.println("Uses fuel");
    }
}