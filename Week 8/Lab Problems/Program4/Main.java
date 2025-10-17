public class Main {
    public static void main(String[] args) {
        // Create an instance of the Manager class
        Manager myManager = new Manager("Ramesh", 85000.00);

        // Call methods from the abstract class (Employee) and interface (Payable)
        myManager.calculateBonus();
        System.out.println(); // Add a newline for separation
        myManager.generatePaySlip();
    }
}