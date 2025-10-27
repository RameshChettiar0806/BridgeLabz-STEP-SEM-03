class Bank {
    String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }
}

class Customer {
    String name;
    int customerId;

    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }
}

class Account {
    int accountNumber;
    double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

public class BankObjectDiagram {
    public static void main(String[] args) {
        // Create bank object
        Bank bank1 = new Bank("Global Bank");

        // Create customers
        Customer cust1 = new Customer("Alice", 101);
        Customer cust2 = new Customer("Bob", 102);

        // Create accounts
        Account acc1 = new Account(5001, 8000);
        Account acc2 = new Account(5002, 12000);

        // Display object relationships (conceptually showing runtime links)
        System.out.println("Bank: " + bank1.bankName);
        System.out.println("\nCustomer 1: " + cust1.name + " (ID: " + cust1.customerId + ")");
        System.out.println("Linked Account: " + acc1.accountNumber + ", Balance = " + acc1.balance);

        System.out.println("\nCustomer 2: " + cust2.name + " (ID: " + cust2.customerId + ")");
        System.out.println("Linked Account: " + acc2.accountNumber + ", Balance = " + acc2.balance);
    }
}
