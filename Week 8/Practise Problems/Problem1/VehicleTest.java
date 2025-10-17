public class VehicleTest {
    public static void main(String[] args) {
        // Create a Vehicle reference pointing to a Car object
        Vehicle myCar = new Car();
        System.out.println("Testing Car:");
        myCar.start();    // Calls the start() method of Car
        myCar.fuelType(); // Calls the fuelType() method of Vehicle

        System.out.println(); // Adds a newline for better readability

        // Create a Vehicle reference pointing to a Bike object
        Vehicle myBike = new Bike();
        System.out.println("Testing Bike:");
        myBike.start();    // Calls the start() method of Bike
        myBike.fuelType(); // Calls the fuelType() method of Vehicle
    }
}