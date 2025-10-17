public class Main {
    public static void main(String[] args) {
        // Create a Circle object
        Circle myCircle = new Circle(5.0);

        // Call methods from the abstract class (Shape)
        myCircle.calculateArea();
        myCircle.calculatePerimeter();
        System.out.println("Circle Area: " + myCircle.getArea());
        System.out.println("Circle Perimeter: " + myCircle.getPerimeter());

        System.out.println(); // Add a newline for separation

        // Call the method from the interface (Drawable)
        myCircle.draw();
    }
}