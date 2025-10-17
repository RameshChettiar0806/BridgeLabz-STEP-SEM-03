/*
 * Create Food class with template method prepare() that calls wash(), cook(), serve().
 * Create Pizza and Soup with different implementations.
 * Hints:
 * ● Template method calls other methods in sequence
 * ● Child classes override individual step methods
 * ● Test template method on different food types
 */

abstract class Food {
    // Template method
    public final void prepare() {
        wash();
        cook();
        serve();
    }

    protected abstract void wash();
    protected abstract void cook();
    protected abstract void serve();
}

class Pizza extends Food {
    protected void wash() {
        System.out.println("Washing vegetables for pizza.");
    }
    protected void cook() {
        System.out.println("Baking pizza in oven.");
    }
    protected void serve() {
        System.out.println("Serving pizza with toppings.");
    }
}

class Soup extends Food {
    protected void wash() {
        System.out.println("Washing vegetables for soup.");
    }
    protected void cook() {
        System.out.println("Boiling soup ingredients.");
    }
    protected void serve() {
        System.out.println("Serving hot soup in a bowl.");
    }
}

public class FoodPrep {
    public static void main(String[] args) {
        Food pizza = new Pizza();
        System.out.println("Preparing Pizza:");
        pizza.prepare();

        System.out.println();

        Food soup = new Soup();
        System.out.println("Preparing Soup:");
        soup.prepare();
    }
}
