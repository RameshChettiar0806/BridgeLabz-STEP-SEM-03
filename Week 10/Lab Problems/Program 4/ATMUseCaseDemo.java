class ATMSystem {
    void validatePIN(String pin) {
        System.out.println("Validating PIN...");
        if (pin.equals("1234"))
            System.out.println("PIN validation successful.");
        else
            System.out.println("Invalid PIN!");
    }

    void withdrawMoney() {
        System.out.println("Withdrawing money...");
    }

    void depositMoney() {
        System.out.println("Depositing money...");
    }

    void checkBalance() {
        System.out.println("Checking account balance...");
    }
}

class Customer {
    String name;
    ATMSystem atm;

    Customer(String name, ATMSystem atm) {
        this.name = name;
        this.atm = atm;
    }

    void performTransaction(String pin, String action) {
        System.out.println(name + " inserted card.");
        atm.validatePIN(pin);
        switch (action.toLowerCase()) {
            case "withdraw":
                atm.withdrawMoney();
                break;
            case "deposit":
                atm.depositMoney();
                break;
            case "check balance":
                atm.checkBalance();
                break;
            default:
                System.out.println("Invalid action!");
        }
    }
}

public class ATMUseCaseDemo {
    public static void main(String[] args) {
        ATMSystem atm = new ATMSystem();
        Customer customer = new Customer("Karthik", atm);

        customer.performTransaction("1234", "withdraw");
        System.out.println();
        customer.performTransaction("1234", "check balance");
    }
}
