/*Create Phone class with brand and model. Create SmartPhone class extending Phone with
operating System field. Use constructor chaining.
Hints:
● Add print statements in constructors to see execution order
● Use super() in child constructor
● Create objects using different constructor combinations */

class Phone {
    String brand;
    String model;

    Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("Phone constructor called: " + brand + " " + model);
    }
}

class SmartPhone extends Phone {
    String operatingSystem;

    SmartPhone(String brand, String model, String operatingSystem) {
        super(brand, model);
        this.operatingSystem = operatingSystem;
        System.out.println("SmartPhone constructor called: " + operatingSystem);
    }
}

public class PhoneSmartPhone {
    public static void main(String[] args) {
        // Create Phone object
        Phone p = new Phone("Nokia", "3310");
        System.out.println();

        // Create SmartPhone object
        SmartPhone sp = new SmartPhone("Apple", "iPhone 14", "iOS");
        System.out.println();

        // Another SmartPhone object with different values
        SmartPhone sp2 = new SmartPhone("Samsung", "Galaxy S23", "Android");
    }
}