/*
 * Create Weather → Storm → Thunderstorm (multilevel) and Weather → Sunshine
(hierarchical). Include constructor chaining, method overriding, and polymorphism.
Hints:
● Implement both multilevel and hierarchical inheritance
● Use constructor chaining throughout
● Override methods at different levels
● Test with polymorphic array of Weather references
 */

class Weather {
    String type;

    Weather(String type) {
        this.type = type;
        System.out.println("Weather constructor: " + type);
    }

    void show() {
        System.out.println("General weather: " + type);
    }
}

class Storm extends Weather {
    Storm() {
        super("Storm");
        System.out.println("Storm constructor");
    }

    @Override
    void show() {
        System.out.println("It's stormy weather!");
    }
}

class Thunderstorm extends Storm {
    Thunderstorm() {
        super();
        System.out.println("Thunderstorm constructor");
    }

    @Override
    void show() {
        System.out.println("Thunderstorm: Lightning and thunder!");
    }
}

class Sunshine extends Weather {
    Sunshine() {
        super("Sunshine");
        System.out.println("Sunshine constructor");
    }

    @Override
    void show() {
        System.out.println("It's a bright sunny day!");
    }
}

public class WeatherSystem {
    public static void main(String[] args) {
        Weather[] weatherArr = new Weather[3];
        weatherArr[0] = new Weather("Generic");
        weatherArr[1] = new Thunderstorm();
        weatherArr[2] = new Sunshine();

        System.out.println("\nPolymorphic display:");
        for (Weather w : weatherArr) {
            w.show();
        }
    }
}
