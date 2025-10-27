import java.util.*;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: INR. " + amount + " | New Balance: INR. " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: INR. " + amount + " | Remaining Balance: INR. " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class Customer {
    private String customerName;
    private int customerId;
    private List<Account> accounts = new ArrayList<>();

    public Customer(String customerName, int customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public void openAccount(Account a) {
        accounts.add(a);
        System.out.println(customerName + " opened account: " + a.getAccountNumber());
    }

    public void closeAccount(Account a) {
        accounts.remove(a);
        System.out.println(customerName + " closed account: " + a.getAccountNumber());
    }

    public void getDetails() {
        System.out.println("Customer: " + customerName + " | ID: " + customerId);
        System.out.println("Accounts:");
        for (Account a : accounts) {
            System.out.println(" - " + a.getAccountNumber() + " | Balance: INR. " + a.getBalance());
        }
    }
}

class Bank {
    private String bankName;
    private String branchCode;
    private List<Customer> customers = new ArrayList<>();

    public Bank(String bankName, String branchCode) {
        this.bankName = bankName;
        this.branchCode = branchCode;
    }

    public void addCustomer(Customer c) {
        customers.add(c);
        System.out.println("Added customer: " + c);
    }

    public void viewCustomers() {
        System.out.println("Bank: " + bankName + " | Branch: " + branchCode);
        System.out.println("Customers list:");
        for (Customer c : customers) {
            c.getDetails();
        }
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank", "NB001");

        Customer c1 = new Customer("Karthik", 101);
        Account a1 = new Account("SAV123", 5000);
        Account a2 = new Account("CUR456", 15000);

        c1.openAccount(a1);
        c1.openAccount(a2);

        a1.deposit(2000);
        a2.withdraw(3000);

        bank.addCustomer(c1);
        bank.viewCustomers();
    }
}
