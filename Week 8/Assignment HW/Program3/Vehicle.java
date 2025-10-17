public abstract class Vehicle {
    // Abstract method to be implemented by subclasses.
    public abstract void start();

    // Concrete method with a default implementation.
    public void stop() {
        System.out.println("The vehicle has stopped.");
    }
}