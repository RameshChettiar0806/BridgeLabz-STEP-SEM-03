public class Main {
    public static void main(String[] args) {
        // Create an instance of the Car class.
        Car myCar = new Car();

        // Call the abstract method inherited from Vehicle.
        myCar.start();

        // Call the concrete method inherited from Vehicle.
        myCar.stop();

        // Call the method implemented from the Fuel interface.
        myCar.refuel();
    }
}