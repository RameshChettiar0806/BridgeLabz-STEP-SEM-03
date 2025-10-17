// File: Vehicle.java
 class Vehicle {
    // TODO: Create protected fields for inheritance:
    protected String brand;
    protected String model;
    protected int year;
    protected String engineType;

    // TODO: Create private fields that require getter/setter access:
    private String registrationNumber;
    private boolean isRunning;

    // Getter and Setter for registrationNumber
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    // Getter for isRunning (no setter, use start/stop)
    public boolean isRunning() {
        return isRunning;
    }

    // Default constructor
    Vehicle() {
        this.brand = "";
        this.model = "";
        this.engineType = "";
        this.registrationNumber = "";
        this.year = 0;
        this.isRunning = false;
        System.out.println("Vehicle default constructor called");
    }

    // Parameterized constructor
    Vehicle(String brand, String model, String engineType, int year) {
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.year = year;
        this.registrationNumber = "REG" + ((int)(Math.random() * 10000));
        this.isRunning = false;
        System.out.println("Vehicle parameterized constructor called");
    }

    // Vehicle operations
    public void start() {
        isRunning = true;
        System.out.println("Vehicle started");
    }

    public void stop() {
        isRunning = false;
        System.out.println("Vehicle stopped");
    }

    public String getVehicleInfo() {
        return "Brand: " + brand + ", Model: " + model + ", Year: " + year +
               ", Engine: " + engineType + ", Registration: " + registrationNumber +
               ", Running: " + isRunning;
    }

    public void displaySpecs() {
        System.out.println("Vehicle Specs:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Is Running: " + isRunning);
    }
}

// Car class that extends Vehicle
class Car extends Vehicle {
    // Car-specific fields
    int numberOfDoors;
    String fuelType;
    String transmissionType;

    // Default constructor
    Car() {
        super();
        this.numberOfDoors = 4;
        this.fuelType = "Petrol";
        this.transmissionType = "Manual";
        System.out.println("Car default constructor called");
    }

    // Parameterized constructor
    Car(String brand, String model, String engineType, int year,
        int numberOfDoors, String fuelType, String transmissionType) {
        super(brand, model, engineType, year);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        System.out.println("Car parameterized constructor called");
    }

    // Override start()
    @Override
    public void start() {
        super.start();
        System.out.println("Car startup sequence: Checking seatbelts, mirrors, infotainment...");
    }

    // Override displaySpecs()
    @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Car Specs:");
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Transmission Type: " + transmissionType);
    }

    // Car-specific methods
    public void openTrunk() {
        System.out.println("Trunk opened");
    }

    public void playRadio() {
        System.out.println("Radio playing music");
    }
}

// Main class to test Vehicle and Car classes
public class VehicleProgram {
    public static void main(String[] args) {
        // Create a Vehicle object using default constructor
        System.out.println("----Vehicle Default Constructor Test----");
        Vehicle v1 = new Vehicle();
        v1.displaySpecs();
        v1.start();
        v1.stop();
        System.out.println(v1.getVehicleInfo());

        // Create a Vehicle object using parameterized constructor
        System.out.println("\n----Vehicle Parameterized Constructor Test----");
        Vehicle v2 = new Vehicle("Suzuki", "Swift", "Petrol", 2020);
        v2.setRegistrationNumber("TN01XY9876");
        v2.displaySpecs();
        v2.start();
        v2.stop();
        System.out.println(v2.getVehicleInfo());

        // 1. Create Car using default constructor
        System.out.println("----Default Constructor Test----");
        Car car1 = new Car();
        car1.displaySpecs();
        car1.start();
        car1.openTrunk();
        car1.playRadio();
        car1.stop();
        System.out.println(car1.getVehicleInfo());

        // 2. Create Car using parameterized constructor
        System.out.println("\n----Parameterized Constructor Test----");
        Car car2 = new Car("Toyota", "Camry", "Hybrid", 2022, 4, "Hybrid", "Automatic");
        car2.setRegistrationNumber("TN09AB1234");
        car2.displaySpecs();
        car2.start();
        car2.openTrunk();
        car2.playRadio();
        car2.stop();
        System.out.println(car2.getVehicleInfo());

        // Test inheritance and super keyword
        System.out.println("\n----Inheritance and Super Test----");
        System.out.println("Brand (protected): " + car2.brand);
        System.out.println("Model (protected): " + car2.model);
        car2.start(); // overridden
        car2.stop();  // inherited

        // Polymorphic behavior
        System.out.println("\n----Polymorphism Test----");
        Vehicle v = new Car("Honda", "City", "Petrol", 2021, 4, "Petrol", "Manual");
        v.start(); // Calls Car's overridden start()
        v.displaySpecs(); // Calls Car's overridden displaySpecs()
    }
}