// File: BankAccount.java
public abstract class BankAccount {
    // A protected variable accessible within the class and its subclasses.
    protected double balance;

    // Constructor to initialize the balance.
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // An abstract method with no body. Subclasses must provide their own implementation.
    public abstract void calculateInterest();

    // A non-abstract method with a concrete implementation that subclasses inherit.
    public void displayBalance() {
        System.out.println("Current Balance: INR " + balance);
    }
}