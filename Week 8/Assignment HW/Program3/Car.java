public class Car extends Vehicle implements Fuel {
    @Override
    public void start() {
        System.out.println("The car's engine has started.");
    }

    @Override
    public void refuel() {
        System.out.println("The car is being refueled.");
    }
}