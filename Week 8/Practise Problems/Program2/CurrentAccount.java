// File: CurrentAccount.java
// The CurrentAccount class also extends BankAccount, providing its own interest calculation logic.
public class CurrentAccount extends BankAccount {
    // Constructor to initialize the CurrentAccount with a balance.
    public CurrentAccount(double balance) {
        super(balance); // Calls the parent class constructor.
    }

    // Implementation of the abstract method to calculate interest for a current account.
    @Override
    public void calculateInterest() {
        double interest = balance * 0.02;
        System.out.println("Current Account Interest: INR " + interest);
        this.balance += interest; // Adds the calculated interest to the balance.
    }
}