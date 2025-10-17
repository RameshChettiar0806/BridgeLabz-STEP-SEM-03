// File: BankTest.java
// This is the main class to test the functionality and demonstrate polymorphism.
public class BankTest {
    public static void main(String[] args) {
        // Create a BankAccount reference that points to a SavingsAccount object.
        BankAccount savings = new SavingsAccount(1000);
        System.out.println("--- Savings Account Details ---");
        savings.displayBalance(); // Calls the displayBalance() method from BankAccount.
        savings.calculateInterest(); // Calls the overridden calculateInterest() from SavingsAccount.
        savings.displayBalance(); // Shows the new balance after interest is added.

        System.out.println(); // A blank line for readability.

        // Create a BankAccount reference that points to a CurrentAccount object.
        BankAccount current = new CurrentAccount(2000);
        System.out.println("--- Current Account Details ---");
        current.displayBalance(); // Calls the displayBalance() method.
        current.calculateInterest(); // Calls the overridden calculateInterest() from CurrentAccount.
        current.displayBalance(); // Shows the new balance.
    }
}