/*
 * Concept: Dynamic Method Dispatch
Design a city transport system with different vehicle types:
● Buses follow fixed routes and track passenger capacity
● Taxis provide door-to-door service and calculate fare by distance
● Trains operate on schedules and manage multiple car capacity
● Bikes are available for short-distance eco-friendly trips
Create a unified "dispatch" system where the same command produces appropriate
transportation behavior based on vehicle type.
Hint: One dispatch call, many transport solutions - runtime polymorphism in
action!
 */

abstract class Vehicle {
    abstract void dispatch();
}

class Bus extends Vehicle {
    private String route;
    private int passengerCapacity;

    Bus(String route, int passengerCapacity) {
        this.route = route;
        this.passengerCapacity = passengerCapacity;
    }

    void dispatch() {
        System.out.println("Bus dispatched on route " + route +
            " with capacity " + passengerCapacity + " passengers.");
    }
}

class Taxi extends Vehicle {
    private String destination;
    private double distance;

    Taxi(String destination, double distance) {
        this.destination = destination;
        this.distance = distance;
    }

    void dispatch() {
        double fare = distance * 15; // Example fare calculation
        System.out.println("Taxi dispatched to " + destination +
            ". Distance: " + distance + " km. Fare: Rs." + fare);
    }
}

class Train extends Vehicle {
    private String schedule;
    private int carCapacity;

    Train(String schedule, int carCapacity) {
        this.schedule = schedule;
        this.carCapacity = carCapacity;
    }

    void dispatch() {
        System.out.println("Train dispatched as per schedule " + schedule +
            " with " + carCapacity + " cars.");
    }
}

class Bike extends Vehicle {
    private String pickupPoint;
    private String dropPoint;

    Bike(String pickupPoint, String dropPoint) {
        this.pickupPoint = pickupPoint;
        this.dropPoint = dropPoint;
    }

    void dispatch() {
        System.out.println("Bike dispatched from " + pickupPoint +
            " to " + dropPoint + ". Eco-friendly short trip!");
    }
}

public class TransporationFleetManagement {
    public static void main(String[] args) {
        Vehicle v;

        v = new Bus("Route 21A", 50);
        v.dispatch();

        v = new Taxi("Central Mall", 12.5);
        v.dispatch();

        v = new Train("10:30 AM Express", 8);
        v.dispatch();

        v = new Bike("Park Street", "Library");
        v.dispatch();
    }
}
