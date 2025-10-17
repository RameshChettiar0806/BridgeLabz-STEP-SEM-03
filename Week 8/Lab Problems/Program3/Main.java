public class Main {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car myCar = new Car(100, "Petrol");

        // Call methods from the abstract class (Vehicle)
        myCar.startEngine();
        myCar.showSpeed();

        System.out.println(); // A blank line for readability.

        // Call the method from the interface (Maintainable)
        myCar.serviceInfo();
    }
}