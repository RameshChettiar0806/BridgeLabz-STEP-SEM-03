/*
 * Create inheritance chain: Color → PrimaryColor → RedColor. Each class adds specific
properties and methods.
Hints:
● Color has name field
● PrimaryColor adds intensity field
● RedColor adds shade field
● Show constructor chaining through all levels
 */

class Color {
    protected String name;

    Color(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Color Name: " + name);
    }
}

class PrimaryColor extends Color {
    protected int intensity;

    PrimaryColor(String name, int intensity) {
        super(name);
        this.intensity = intensity;
    }

    void showIntensity() {
        System.out.println("Intensity: " + intensity);
    }
}

class RedColor extends PrimaryColor {
    private String shade;

    RedColor(String name, int intensity, String shade) {
        super(name, intensity);
        this.shade = shade;
    }

    void showShade() {
        System.out.println("Shade: " + shade);
    }
}

public class ColorHierarchy {
    public static void main(String[] args) {
        RedColor red = new RedColor("Red", 80, "Crimson");
        red.showName();
        red.showIntensity();
        red.showShade();
    }
}