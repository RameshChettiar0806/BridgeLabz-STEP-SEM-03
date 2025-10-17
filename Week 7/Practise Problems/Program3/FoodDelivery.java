class Restaurant{
    protected String name;
        public Restaurant(String name) {
        this.name = name;
    }

    // TODO: Create 'prepareFood()' method that prints "[name] is preparing generic food"
    public void prepareFood() {
        System.out.println(name + " is preparing generic food.");
    }

    // TODO: Create 'estimateTime()' method that prints "Estimated time: 30 minutes"
    public void estimateTime() {
        System.out.println("Estimated time: 30 minutes");
    }
}


class PizzaPlace extends Restaurant {
    public PizzaPlace(String name) {
        super(name);
    }
    // TODO: Override 'prepareFood()' to print " [name] is making delicious pizza with fresh toppings!"
    @Override
    public void prepareFood() {
        // ... (implementation)
        }
    // TODO: Override 'estimateTime()' to print "Pizza ready in 20 minutes! "
    @Override
    public void estimateTime() {
        System.out.println("Pizza ready on 20 minutes! ");
    }
}

class SushiBar extends Restaurant {
    public SushiBar(String name) {
        super(name);
    }
// TODO: Override 'prepareFood()' to print "[name] is crafting fresh sushi with precision!"
    @Override
    public void prepareFood() {
        // ... (implementation)
        }
    // TODO: Override 'estimateTime()' to print "Sushi will be ready in 25 minutes! "
    @Override
    public void estimateTime() {
        System.out.println("Sushi will be ready in 25 minutes! ");
        }
}

public class FoodDelivery{
    public static void main(String args[]){
        // TODO: Dynamic Food Ordering System:
        // 1. Create a Restaurant reference variable
        // 2. Assign new PizzaPlace("Mario's Pizza") to it
        // 3. Call prepareFood() and estimateTime() - observe Pizza methods execute
        // 4. Reassign to new SushiBar("Tokyo Sushi")
        // 5. Call same methods again - observe Sushi methods execute
        // 6. Explain how JVM knows which method to call at runtime!
        Restaurant obj = new Restaurant("Mario's Pizza");
        obj.prepareFood();
        obj.estimateTime();
        obj = new SushiBar("Tokyo Sushi");
        obj.prepareFood();
        obj.estimateTime();
    }
}


