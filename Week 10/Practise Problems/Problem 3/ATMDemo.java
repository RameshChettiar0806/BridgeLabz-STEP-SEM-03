class BankAccount {
    // TODO: Declare private attributes: accountNumber, balance, pin
    private String accountNumber;
    private double balance;
    private int pin;

    // TODO: Constructor to initialize all fields
    public BankAccount(String accountNumber, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    // TODO: Validate PIN
    public boolean validatePin(int enteredPin) {
        return enteredPin == pin;
    }

    // TODO: Debit amount from account
    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("INR." + amount + " withdrawn. Remaining balance: INR." + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class ATM {
    private BankAccount linkedAccount;

    public ATM(BankAccount linkedAccount) {
        this.linkedAccount = linkedAccount;
    }

    public void withdraw(int enteredPin, double amount) {
        if (linkedAccount.validatePin(enteredPin)) {
            linkedAccount.debit(amount);
            System.out.println("Transaction successful.");
        } else {
            System.out.println("Invalid PIN. Transaction failed.");
        }
    }
}

class Customer {
    private String name;
    private ATM atm;

    public Customer(String name, ATM atm) {
        this.name = name;
        this.atm = atm;
    }

    public void performWithdrawal(int pin, double amount) {
        System.out.println(name + " is requesting withdrawal...");
        atm.withdraw(pin, amount);
    }
}

public class ATMDemo {
    public static void main(String[] args) {
        // Step 1 - Create BankAccount object
        BankAccount account = new BankAccount("1234567890", 5000.0, 1234);

        // Step 2 - Create ATM object linked to BankAccount
        ATM atm = new ATM(account);

        // Step 3 - Create Customer object associated with ATM
        Customer customer = new Customer("Ramesh", atm);

        // Step 4 - Call performWithdrawal() with correct PIN
        customer.performWithdrawal(1234, 1500.0);

        // Step 5 - Call performWithdrawal() with incorrect PIN
        customer.performWithdrawal(9999, 1000.0);

        // NOTE: Sequence flow: Customer → ATM → BankAccount
    }
}
