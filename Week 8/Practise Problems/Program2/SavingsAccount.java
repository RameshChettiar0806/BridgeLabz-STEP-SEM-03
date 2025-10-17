// File: SavingsAccount.java
// The SavingsAccount class extends BankAccount and provides a specific implementation for interest calculation.
public class SavingsAccount extends BankAccount {
    // Constructor to initialize the SavingsAccount with a balance.
    public SavingsAccount(double balance) {
        super(balance); // Calls the constructor of the parent class (BankAccount).
    }

    // Implementation of the abstract method to calculate interest for a savings account.
    @Override
    public void calculateInterest() {
        double interest = balance * 0.04;
        System.out.println("Savings Account Interest: INR " + interest);
        this.balance += interest; // Adds the calculated interest to the balance.
    }
}