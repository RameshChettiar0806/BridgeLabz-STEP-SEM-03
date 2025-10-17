public class Main {
    public static void main(String[] args) {
        // Create an instance of the Dog class.
        Dog myDog = new Dog();

        // The Dog class can use methods from both the Animal and Pet interfaces.
        myDog.eat();
        myDog.play();
    }
}