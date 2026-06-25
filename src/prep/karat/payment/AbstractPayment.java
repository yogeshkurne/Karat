package prep.karat.payment;

import prep.karat.exception.PaymentFailedException;

public abstract class AbstractPayment implements PaymentMethod {

	private String accountId;

	public AbstractPayment(String accountId) {
		this.accountId = accountId;
	}

	public boolean validateAmount(double amount) throws PaymentFailedException {

		if (amount <= 0) {
			throw new PaymentFailedException("Invalid Payment Amount ");
		}
		return true;
	}
}
