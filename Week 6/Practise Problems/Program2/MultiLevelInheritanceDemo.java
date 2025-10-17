// TODO: Create base class Animal:
class Animal {
    // TODO: Create protected fields:
    // - species (String)
    // - habitat (String)
    // - lifespan (int)
    // - isWildlife (boolean)
    protected String species;
    protected String habitat;
    protected int lifespan;
    protected boolean isWildlife;

    // TODO: Create constructor that:
    // - Takes all parameters
    // - Prints "Animal constructor: Creating [species]"
    public Animal(String species, String habitat, int lifespan, boolean isWildlife) {
        this.species = species;
        this.habitat = habitat;
        this.lifespan = lifespan;
        this.isWildlife = isWildlife;
        System.out.println("Animal constructor: Creating " + species);
    }

    // TODO: Create methods:
    // - eat() - prints "Animal is eating"
    // - sleep() - prints "Animal is sleeping"
    // - move() - prints "Animal is moving"
    // - getAnimalInfo() - returns formatted animal details
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void move() {
        System.out.println("Animal is moving");
    }

    public String getAnimalInfo() {
        return "Species: " + species + ", Habitat: " + habitat +
               ", Lifespan: " + lifespan + " years, Wildlife: " + isWildlife;
    }
}

// TODO: Create intermediate class Mammal extends Animal:
class Mammal extends Animal {
    // TODO: Add mammal-specific fields:
    // - furColor (String)
    // - hasWarmBlood (boolean) - always true for mammals
    // - gestationPeriod (int) - days
    protected String furColor;
    protected boolean hasWarmBlood;
    protected int gestationPeriod;

    // TODO: Create constructor that:
    // - Takes Animal parameters plus mammal-specific parameters
    // - Calls super() with appropriate parameters
    // - Sets hasWarmBlood to true automatically
    // - Prints "Mammal constructor: Adding mammal traits"
    public Mammal(String species, String habitat, int lifespan, boolean isWildlife,
                  String furColor, int gestationPeriod) {
        super(species, habitat, lifespan, isWildlife);
        this.furColor = furColor;
        this.hasWarmBlood = true;
        this.gestationPeriod = gestationPeriod;
        System.out.println("Mammal constructor: Adding mammal traits");
    }

    // TODO: Override methods from Animal:
    // - Override move() to print "Mammal is walking/running"
    // - Call super.move() first, then add mammal-specific behavior
    @Override
    public void move() {
        super.move();
        System.out.println("Mammal is walking/running");
    }

    // TODO: Add mammal-specific methods:
    // - nurse() - prints "Mammal is nursing offspring"
    // - regulateTemperature() - prints "Maintaining body temperature"
    public void nurse() {
        System.out.println("Mammal is nursing offspring");
    }

    public void regulateTemperature() {
        System.out.println("Maintaining body temperature");
    }
}

// TODO: Create specific class Dog extends Mammal:
 class Dog extends Mammal {
    // TODO: Add dog-specific fields:
    // - breed (String)
    // - isDomesticated (boolean)
    // - loyaltyLevel (int) - 1-10 scale
    // - favoriteActivity (String)
    private String breed;
    private boolean isDomesticated;
    private int loyaltyLevel;
    private String favoriteActivity;

    // TODO: Create multiple constructors with different chaining patterns:
    // Constructor 1: Basic dog with minimal parameters
    // - Calls super() with default mammal/animal values
    // - Sets dog-specific defaults
    public Dog() {
        super("Dog", "Domestic", 13, false, "Varied", 60);
        this.breed = "Unknown";
        this.isDomesticated = true;
        this.loyaltyLevel = 5;
        this.favoriteActivity = "Playing";
        System.out.println("Dog constructor: Creating default dog");
    }

    // Constructor 2: Detailed dog with all parameters
    // - Calls super() with all mammal/animal parameters
    // - Initializes all dog-specific fields
    // - Prints "Dog constructor: Creating [breed] dog"
    public Dog(String species, String habitat, int lifespan, boolean isWildlife,
               String furColor, int gestationPeriod,
               String breed, boolean isDomesticated, int loyaltyLevel, String favoriteActivity) {
        super(species, habitat, lifespan, isWildlife, furColor, gestationPeriod);
        this.breed = breed;
        this.isDomesticated = isDomesticated;
        this.loyaltyLevel = loyaltyLevel;
        this.favoriteActivity = favoriteActivity;
        System.out.println("Dog constructor: Creating " + breed + " dog");
    }

    // Constructor 3: Copy constructor
    // - Takes another Dog object as parameter
    // - Calls this() with parameters from source dog
    public Dog(Dog other) {
        this(other.species, other.habitat, other.lifespan, other.isWildlife,
             other.furColor, other.gestationPeriod,
             other.breed, other.isDomesticated, other.loyaltyLevel, other.favoriteActivity);
        System.out.println("Dog copy constructor: Copying " + other.breed + " dog");
    }

    // TODO: Override methods from the inheritance chain:
    // - Override eat() to show dog eating behavior
    // - Call super.eat() and add "wagging tail while eating"
    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog is eating and wagging tail while eating");
    }

    // - Override move() to print "Dog is running and playing"
    @Override
    public void move() {
        super.move();
        System.out.println("Dog is running and playing");
    }

    // - Override sleep() to print "Dog is sleeping in doghouse"
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping in doghouse");
    }

    // TODO: Add dog-specific methods:
    // - bark() - prints "Woof! Woof!"
    // - fetch() - prints "Dog is fetching the ball"
    // - showLoyalty() - prints loyalty level message
    public void bark() {
        System.out.println("Woof! Woof!");
    }

    public void fetch() {
        System.out.println("Dog is fetching the ball");
    }

    public void showLoyalty() {
        System.out.println("Loyalty Level: " + loyaltyLevel + " (1-10 scale)");
    }

    // TODO: Create method that demonstrates calling up the chain:
    // - demonstrateInheritance() - calls methods from all three levels
    public void demonstrateInheritance() {
        System.out.println("--- Demonstrating Inheritance Chain ---");
        eat();
        move();
        sleep();
        nurse();
        regulateTemperature();
        bark();
        fetch();
        showLoyalty();
        System.out.println(getAnimalInfo());
        System.out.println("Fur Color: " + furColor);
        System.out.println("Breed: " + breed);
        System.out.println("Favorite Activity: " + favoriteActivity);
    }

    public String getBreed() {
        return breed;
    }
}

public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Basic Dog Constructor ===");
        Dog dog1 = new Dog();
        dog1.demonstrateInheritance();

        System.out.println("\n=== Detailed Dog Constructor ===");
        Dog dog2 = new Dog("Dog", "Home", 15, false, "Brown", 63,
                           "Labrador", true, 9, "Swimming");
        dog2.demonstrateInheritance();

        System.out.println("\n=== Copy Constructor ===");
        Dog dog3 = new Dog(dog2);
        dog3.demonstrateInheritance();

        System.out.println("\n=== Method Overriding Test ===");
        dog2.eat();
        dog2.move();
        dog2.sleep();

        System.out.println("\n=== Access Inherited Members ===");
        System.out.println("Species: " + dog2.species);
        System.out.println("Habitat: " + dog2.habitat);
        System.out.println("Fur Color: " + dog2.furColor);
        System.out.println("Breed: " + dog2.getBreed());

        System.out.println("\n=== Inheritance Chain Test ===");
        System.out.println("dog2 instanceof Dog: " + (dog2 instanceof Dog));
        System.out.println("dog2 instanceof Mammal: " + (dog2 instanceof Mammal));
        System.out.println("dog2 instanceof Animal: " + (dog2 instanceof Animal));

        System.out.println("\n=== Multiple Dog Objects ===");
        Dog dog4 = new Dog("Dog", "Farm", 12, false, "White", 60,
                           "Dalmatian", true, 8, "Running");
        dog4.demonstrateInheritance();

        Dog dog5 = new Dog("Dog", "Street", 10, true, "Black", 58,
                           "Stray", false, 6, "Exploring");
        dog5.demonstrateInheritance();
    }
}