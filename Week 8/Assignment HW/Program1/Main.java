public class Main {
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle(5.0);
        System.out.println("--- Circle Information ---");
        circle.displayInfo();
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
        System.out.println();

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("--- Rectangle Information ---");
        rectangle.displayInfo();
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
    }
}