class Payment {
	public void pay() {
		System.out.println("Generic payment");
	}
}

class CreditCardPayment extends Payment {
	@Override
	public void pay() {
		System.out.println("Processing credit card payment");
	}
}

class WalletPayment extends Payment {
	@Override
	public void pay() {
		System.out.println("Processing wallet payment");
	}
}

public class PaymentGateway {
	public static void main(String[] args) {
		// 1. Create array of Payment references with CreditCardPayment and WalletPayment
		Payment[] payments = { new CreditCardPayment(), new WalletPayment() };

		// 2. Loop through array, print class simple name and call pay()
		for (Payment p : payments) {
			System.out.println(p.getClass().getSimpleName());
			p.pay();
		}
	}
}