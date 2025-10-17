public class Car extends Vehicle implements Maintainable {
    public Car(int speed, String fuelType) {
        super(speed, fuelType);
    }

    @Override
    public void startEngine() {
        System.out.println("The " + this.fuelType + " car's engine has started.");
    }

    @Override
    public void serviceInfo() {
        System.out.println("Car service is recommended every 15,000 kilometers or 1 year.");
    }

    // Optional method to show current speed
    public void showSpeed() {
        System.out.println("Current speed: " + this.speed + " km/h");
    }
}