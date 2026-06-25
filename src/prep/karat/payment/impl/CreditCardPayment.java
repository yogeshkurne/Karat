package prep.karat.payment.impl;

import prep.karat.exception.PaymentFailedException;
import prep.karat.payment.AbstractPayment;

public class CreditCardPayment extends AbstractPayment {

	public CreditCardPayment(String accountId) {
		super(accountId);
	}

	@Override
	public void pay(double amount) throws PaymentFailedException {
		validateAmount(amount);
		System.out.println("Credit Card Payment of " + amount);
	}

}
