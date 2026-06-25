package prep.karat.payment.impl;

import prep.karat.exception.PaymentFailedException;
import prep.karat.payment.AbstractPayment;

public class UPIPayment extends AbstractPayment {

	public UPIPayment(String accountId) {
		super(accountId);
	}

	@Override
	public void pay(double amount) throws PaymentFailedException {
		validateAmount(amount);
		System.out.println("UPI Payment of " + amount);
	}

}
