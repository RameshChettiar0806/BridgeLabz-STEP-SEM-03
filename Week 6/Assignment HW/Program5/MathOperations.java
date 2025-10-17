/*
 * Create BasicMath with overloaded calculate() methods. Create AdvancedMath
 * extending it and adding more overloaded methods.
 * Hints:
 * ● Create multiple calculate() methods with different parameters
 * ● Child class inherits all overloaded methods
 * ● Add new overloaded methods in child class
 */

// BasicMath class with overloaded calculate() methods
class BasicMath {
    int calculate(int a, int b) {
        return a + b;
    }

    double calculate(double a, double b) {
        return a * b;
    }

    int calculate(int a) {
        return a * a;
    }
}

// AdvancedMath extends BasicMath and adds more overloaded methods
class AdvancedMath extends BasicMath {
    double calculate(double a) {
        return Math.sqrt(a);
    }

    int calculate(int a, int b, int c) {
        return a + b + c;
    }

    double calculate(double a, double b, double c) {
        return a * b * c;
    }
}

// Main class
public class MathOperations {
    public static void main(String[] args) {
        AdvancedMath advMath = new AdvancedMath();

        System.out.println("Sum (int, int): " + advMath.calculate(5, 3)); // BasicMath
        System.out.println("Product (double, double): " + advMath.calculate(2.5, 4.0)); // BasicMath
        System.out.println("Square (int): " + advMath.calculate(6)); // BasicMath
        System.out.println("Square root (double): " + advMath.calculate(16.0)); // AdvancedMath
        System.out.println("Sum (int, int, int): " + advMath.calculate(1, 2, 3)); // AdvancedMath
        System.out.println("Product (double, double, double): " + advMath.calculate(1.5, 2.0, 3.0)); // AdvancedMath
    }
}
