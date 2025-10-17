public class Dog implements Pet {
    @Override
    public void eat() {
        System.out.println("The dog is eating its food.");
    }

    @Override
    public void play() {
        System.out.println("The dog is playing with a ball.");
    }
}