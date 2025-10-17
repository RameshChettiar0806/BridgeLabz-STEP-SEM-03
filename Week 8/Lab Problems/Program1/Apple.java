public class Apple extends Fruit implements Edible {
    private String variety;

    public Apple(String color, String taste, String variety) {
        super(color, taste);
        this.variety = variety;
    }

    @Override
    public void showDetails() {
        System.out.println("This is a " + variety + " apple.");
        System.out.println("It is " + color + " and tastes " + taste + ".");
    }

    @Override
    public void nutrientsInfo() {
        System.out.println("Apples are a good source of fiber and Vitamin C.");
    }
}