/*Create Bird class with fly() method. Create Penguin and Eagle classes that override
fly() method differently.
Hints:
● Use @Override annotation
● Make different implementations in each child class
● Test polymorphism with array of Bird references */

class Bird {
    void fly() {
        System.out.println("Bird is flying.");
    }
}

class Penguin extends Bird {
    @Override
    void fly() {
        System.out.println("Penguin can't fly, it swims.");
    }
}

class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
}

public class BirdBehavour {
    public static void main(String[] args) {
        Bird[] birds = new Bird[3];
        birds[0] = new Bird();
        birds[1] = new Penguin();
        birds[2] = new Eagle();

        for (Bird b : birds) {
            b.fly();
        }
    }
}