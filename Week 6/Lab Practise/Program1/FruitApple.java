/*Create a Fruit class with color and taste fields. Create an Apple class that extends
Fruit and adds variety field. 

Hints:
● Use extends keyword for inheritance
● Make fields protected in parent class
● Test by creating Apple object and accessing inherited fields
*/

class Fruit {
    protected String color;
    protected String taste;

    public Fruit(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }
}

class Apple extends Fruit {
    private String variety;

    public Apple(String color, String taste, String variety) {
        super(color, taste);
        this.variety = variety;
    }

    public void displayInfo() {
        System.out.println("Apple Variety: " + variety);
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
    }
}

public class FruitApple {
    public static void main(String[] args) {
        Apple apple = new Apple("Red", "Sweet", "Fuji");
        apple.displayInfo();
    }
}