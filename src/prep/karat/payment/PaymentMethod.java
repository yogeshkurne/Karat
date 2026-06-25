package prep.karat.payment;

import prep.karat.exception.PaymentFailedException;

public interface PaymentMethod {

	public void pay(double amount) throws PaymentFailedException;
	
}
