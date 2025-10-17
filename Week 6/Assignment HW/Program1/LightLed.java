/*
 * Create Light class with multiple constructors using this(). Create LED class with
constructors using both this() and super().
Hints:
● Chain constructors using this() in same class
● Chain to parent using super() from child class
● Add print statements to trace constructor calls
 */

class Light {
    int brightness;
    String color;

    Light() {
        this(100); // default brightness
        System.out.println("Light() constructor called");
    }

    Light(int brightness) {
        this(brightness, "White");
        System.out.println("Light(int brightness) constructor called");
    }

    Light(int brightness, String color) {
        this.brightness = brightness;
        this.color = color;
        System.out.println("Light(int brightness, String color) constructor called");
    }
}

class LED extends Light {
    int power;

    LED() {
        this(5); // default power
        System.out.println("LED() constructor called");
    }

    LED(int power) {
        super(); // calls Light()
        this.power = power;
        System.out.println("LED(int power) constructor called");
    }

    LED(int brightness, String color, int power) {
        super(brightness, color); // calls Light(int, String)
        this.power = power;
        System.out.println("LED(int brightness, String color, int power) constructor called");
    }
}

public class LightLed {
    public static void main(String[] args) {
        System.out.println("Creating Light objects:");
        Light l1 = new Light();
        Light l2 = new Light(200);
        Light l3 = new Light(150, "Yellow");

        System.out.println("\nCreating LED objects:");
        LED led1 = new LED();
        LED led2 = new LED(10);
        LED led3 = new LED(250, "Blue", 15);
    }
}

